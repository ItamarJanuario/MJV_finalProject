package mjv.school.gameProject.service;

import mjv.school.gameProject.dto.usuario.UsuarioDTO;
import mjv.school.gameProject.dto.usuario.UsuarioResponseDTO;
import mjv.school.gameProject.model.EnderecoModel;
import mjv.school.gameProject.model.UsuarioModel;
import mjv.school.gameProject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Autowired EnderecoService enderecoService;

    public List<UsuarioModel> getAll () {
        return repository.findAll();
    }


    public UsuarioResponseDTO salvarUsuario(UsuarioModel usuario) {
        return new UsuarioResponseDTO(repository.save(usuario));
    }


    public UsuarioResponseDTO insert (UsuarioDTO usuarioBody) {
        UsuarioModel usuario = new UsuarioModel();
        usuario.setNome(usuarioBody.getNome());
        usuario.setSenha(usuarioBody.getSenha());
        usuario.setEmail(usuarioBody.getEmail());

        if(usuarioBody.getEndereco() != null) {
            EnderecoModel endereco = enderecoService.buscar(usuarioBody.getEndereco());
            usuario.setEndereco(endereco);
        }
        return salvarUsuario(usuario);
    }


    public void update(Long id, @RequestBody UsuarioDTO usuarioBody) {
       UsuarioModel usuario = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "[ ERROR ] nao foi possivel continuar o processo"));

        if(usuarioBody.getNome() != null) {
            usuario.setNome(usuarioBody.getNome());
        }
        if(usuarioBody.getSenha() != null) {
            usuario.setSenha(usuarioBody.getSenha());
        }
        if(usuarioBody.getEmail() != null) {
            usuario.setEmail(usuarioBody.getEmail());
        }
        if(usuarioBody.getEndereco() != null) {
            EnderecoModel endereco =  enderecoService.buscar(usuarioBody.getEndereco());
            usuario.setEndereco(endereco);
        }

        repository.save(usuario);
    }

    public UsuarioModel  getUsuario(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "[ ERROR ] nao foi possivel buscar usuario"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
