package mjv.school.gameProject.service;

import mjv.school.gameProject.model.PedidoItemModel;
import mjv.school.gameProject.model.PedidoModel;
import mjv.school.gameProject.model.ProdutoModel;
import mjv.school.gameProject.repository.PedidoItemRepository;
import mjv.school.gameProject.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PedidoItemService {
    @Autowired
    private PedidoItemRepository repository;
    @Autowired
    private PedidoRepository repositoryPedido;

    @Autowired
    private PedidoService servicePedido;

    @Autowired
    private ProdutoService serviceProduto;

    public List<PedidoItemModel> getAll() {
        return repository.findAll();
    }

    public PedidoItemModel buscarPedidoItem(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "[ ERROR ] não foi possivel buscar pedido"));
    }


//    public void insert(Long idProduto, Long idPedido) {
//        PedidoModel pedido = servicePedido.buscarPedido(idPedido);
//        ProdutoModel produto = serviceProduto.buscarProduto(idProduto);
//
//        PedidoItemModel item = new PedidoItemModel();
//        item.setProduto(produto);
//        pedido.getListaItem().add(item);
//        repository.save(item);
//        repositoryPedido.save(pedido);
//
//        return item;
//    }

    public void insert(PedidoItemModel pedidoItem) {
       repository.save(pedidoItem);
    }

    public PedidoItemModel update(Long idProduto, Long idItem) {
       ProdutoModel produto = serviceProduto.buscarProduto(idProduto);
       PedidoItemModel item = buscarPedidoItem(idItem);
       item.setProduto(produto);
       return repository.save(item);
    }

    public void delete (Long id) {
        repository.deleteById(id);
    }
}
