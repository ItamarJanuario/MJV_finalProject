package mjv.school.gameProject.Controller;

import mjv.school.gameProject.Model.EnderecoModel;
import mjv.school.gameProject.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoService service;

//    @GetMapping
//    public List<EnderecoModel> getAll() {
//        return service.getAll();
//    }
//
//    @PostMapping("/")
//    private EnderecoModel save(@RequestBody EnderecoModel endereco){
//        return service.
//    }
}
