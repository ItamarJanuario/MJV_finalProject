package mjv.school.gameProject.service;

import mjv.school.gameProject.dto.usuario.UsuarioComId;
import mjv.school.gameProject.dto.usuario.UsuarioSemId;
import mjv.school.gameProject.mapper.UsuarioMapper;
import mjv.school.gameProject.model.EnderecoModel;
import mjv.school.gameProject.model.PedidoModel;
import mjv.school.gameProject.model.UsuarioModel;
import mjv.school.gameProject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioModel> getAll () {
        return repository.findAll();
    }

    public void insert (UsuarioSemId usuarioBody) {
        UsuarioModel user = new UsuarioModel();
        user.setNome(usuarioBody.getNome());
        user.setSenha(usuarioBody.getSenha());
        user.setEmail(usuarioBody.getEmail());
        user.setEndereco(usuarioBody.getEndereco());

        repository.save(user);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
