package mjv.school.gameProject.controller;

import mjv.school.gameProject.dto.usuario.UsuarioSemId;
import mjv.school.gameProject.model.UsuarioModel;
import mjv.school.gameProject.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<UsuarioModel> getAll (UsuarioModel usuarioBody) {
       return service.getAll();
    }

    @PostMapping("/")
    public void insert(@RequestBody UsuarioSemId usuarioBody) {
        service.insert(usuarioBody);
    }

    @DeleteMapping("/{id}/deletar")
    public void deletar(@PathVariable(name = "id") Long id){
        service.delete(id);
    }
}
