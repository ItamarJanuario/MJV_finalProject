package mjv.school.gameProject.service;

import mjv.school.gameProject.dto.produto.ProdutoDTO;
import mjv.school.gameProject.model.ProdutoModel;
import mjv.school.gameProject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static mjv.school.gameProject.verification.VerificationProduto.verificarProduto;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoModel> getAll() {
        return repository.findAll();
    }

    public ProdutoModel buscarProduto(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "[ ERROR ] nao foi possivel buscar o produto"));
    }

    public ProdutoModel insert(@RequestBody ProdutoDTO produtoBody) {
        ProdutoModel produto = new ProdutoModel();

        produto.setNome(produtoBody.getNome());
        produto.setDescricao(produtoBody.getDescricao());
        produto.setValor(produtoBody.getValor());
        produto.setDesenvolvedora(produtoBody.getDesenvolvedora());

        return repository.save(produto);
    }

    public ProdutoModel update(Long id, @RequestBody ProdutoDTO produtoBody) {
        ProdutoModel produto = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "[ ERROR ] nao foi possivel atualziar produto"));
        verificarProduto(produto, produtoBody);

        return repository.save(produto);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}
