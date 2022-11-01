package mjv.school.gameProject.controller;

import mjv.school.gameProject.dto.endereco.EnderecoComId;
import mjv.school.gameProject.dto.endereco.EnderecoSemId;
import mjv.school.gameProject.model.EnderecoModel;
import mjv.school.gameProject.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoService service;

    @GetMapping
    public List<EnderecoModel> getAll() {
        return service.getAll();
    }

    @PostMapping("/novo")
    public void  insert(@RequestBody EnderecoSemId enderecoBody){
         service.insert(enderecoBody);
    }

    @PatchMapping("/{id}/atualizar")
    public void update(@PathVariable(name = "id")Long id, @RequestBody EnderecoComId enderecoBody) {
       service.update(id, enderecoBody);
    }

    @DeleteMapping("/{id}/deletar")
    public void delete(@PathVariable(name = "id") Long id) {
        service.deletar(id);
    }

}
