package mjv.school.gameProject.service;

import mjv.school.gameProject.dto.pedido.PedidoDTO;
import mjv.school.gameProject.dto.usuario.UsuarioDTO;
import mjv.school.gameProject.enumeration.EnumStatusPedido;
import mjv.school.gameProject.model.EnderecoModel;
import mjv.school.gameProject.model.PedidoItemModel;
import mjv.school.gameProject.model.PedidoModel;
import mjv.school.gameProject.model.UsuarioModel;
import mjv.school.gameProject.repository.PedidoItemRepository;
import mjv.school.gameProject.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repository;

    @Autowired
    private PedidoItemRepository repositoryItem;

    @Autowired
    private UsuarioService serviceUsuario;
    public List<PedidoModel> getAll () {
        return repository.findAll();
    }

    public PedidoModel buscarPedido(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "[ ERROR ] Nao foi possivel buscar pedido"));
    }

    public void insert(Long idUsuario) {
        PedidoModel pedido = new PedidoModel();
        pedido.setValorTotalCompra(0.0);
        pedido.setDataCompra(LocalDate.now());
        pedido.setStatusPedido(EnumStatusPedido.PENDENTE);

        UsuarioModel usuario = serviceUsuario.getUsuario(idUsuario);

        usuario.getListaPedido().add(pedido);
        serviceUsuario.salvarUsuario(usuario);
    }

    public void adicionarItem(Long id, Long idItem) {
        PedidoModel pedido = buscarPedido(id);
        PedidoItemModel item = repositoryItem.findById(idItem).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "[ERROR] Nao foi possivel pegar o item"));

        if(pedido.getListaItem().contains(item)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        pedido.getListaItem().add(item);
        pedido.setValorTotalCompra(pedido.getValorTotalCompra() + item.getProduto().getValor());
        repository.save(pedido);
    }

    public PedidoModel removerItem(Long idItem, Long idPedido) {
        PedidoModel pedido = buscarPedido(idPedido);
        PedidoItemModel item = repositoryItem.findById(idItem).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST));

        if (!pedido.getListaItem().contains(item)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        pedido.getListaItem().remove(item);
        pedido.setValorTotalCompra(pedido.getValorTotalCompra() - item.getProduto().getValor());
        return repository.save(pedido);
    }

    public void update(Long id, EnumStatusPedido statusPedido) {
        PedidoModel pedido = buscarPedido(id);
        pedido.setStatusPedido(statusPedido);
        repository.save(pedido);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }



}
