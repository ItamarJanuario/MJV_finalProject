package mjv.school.gameProject.controller;

import mjv.school.gameProject.dto.produto.ProdutoDTO;
import mjv.school.gameProject.model.ProdutoModel;
import mjv.school.gameProject.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<ProdutoModel> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ProdutoModel getProduto(@PathVariable(name = "id") Long id) {
        return service.buscarProduto(id);
    }

    @PostMapping("/novo")
    public ProdutoModel insert(@RequestBody ProdutoDTO produtoDTO){
        return service.insert(produtoDTO);
    }

    @PatchMapping("/{id}/atualizar")
    public void update(@PathVariable(name = "id")Long id, @RequestBody ProdutoDTO produtoDTO){
        service.update(id, produtoDTO);
    }

    @DeleteMapping("/{id}/deletar")
    public void delete(@PathVariable(name = "id")Long id) {
        service.delete(id);
    }
}
