package mjv.school.gameProject.controller;

import mjv.school.gameProject.dto.usuario.UsuarioDTO;
import mjv.school.gameProject.dto.usuario.UsuarioResponseDTO;
import mjv.school.gameProject.model.EnderecoModel;
import mjv.school.gameProject.model.UsuarioModel;
import mjv.school.gameProject.service.EnderecoService;
import mjv.school.gameProject.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<UsuarioModel> getAll () {
       return service.getAll();
    }

    @GetMapping("/{id}/buscar")
    public UsuarioModel getUsuario(@PathVariable(name = "id")  Long id) {
        return service.getUsuario(id);
    }

    @PostMapping("/novo")
    public UsuarioResponseDTO insert(@RequestBody UsuarioDTO usuarioBody) {
        return service.insert(usuarioBody);
    }


    @PatchMapping("/{id}/atualizar")
    public void update(@PathVariable(name = "id") Long id, @RequestBody UsuarioDTO usuarioBody){
        service.update(id, usuarioBody);
    }

    @DeleteMapping("/{id}/deletar")
    public void deletar(@PathVariable(name = "id") Long id){
        service.delete(id);
    }
}
