package mjv.school.gameProject.service;

import mjv.school.gameProject.dto.endereco.EnderecoDTO;
import mjv.school.gameProject.model.EnderecoModel;
import mjv.school.gameProject.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static mjv.school.gameProject.verification.VerificationsEndereco.verificaEndereco;


@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;

    public List<EnderecoModel> getAll() {
        return repository.findAll();
    }

    public EnderecoModel insert(EnderecoDTO enderecoBody) {
        EnderecoModel endereco = new EnderecoModel();

        endereco.setLogradouro(enderecoBody.getLogradouro());
        endereco.setCep(enderecoBody.getCep());
        endereco.setCidade(enderecoBody.getCidade());
        endereco.setNumero(enderecoBody.getNumero());
        endereco.setBairro(enderecoBody.getBairro());
        endereco.setComplemento(enderecoBody.getComplemento());
        endereco.setPais(enderecoBody.getPais());

        return repository.save(endereco);
    }

    public void update(Long id, @RequestBody EnderecoDTO enderecoBody){
        EnderecoModel endereco = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "[ ERROR ]"));
        verificaEndereco(enderecoBody, endereco);


        repository.save(endereco);
    }

    public EnderecoModel buscar(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "[ ERROR ] endereco nao encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
