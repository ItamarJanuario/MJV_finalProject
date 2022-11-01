package mjv.school.gameProject.service;

import mjv.school.gameProject.dto.endereco.EnderecoComId;
import mjv.school.gameProject.dto.endereco.EnderecoSemId;
import mjv.school.gameProject.mapper.EnderecoMapper;
import mjv.school.gameProject.model.EnderecoModel;
import mjv.school.gameProject.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

import static mjv.school.gameProject.Verifications.verificaNull;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;

    public List<EnderecoModel> getAll() {
        return repository.findAll();
    }

//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(name = "logradouro", length = 50, nullable = false)
//    private String logradouro;
//    @Column(name = "cep", length = 10, nullable = false)
//    private String cep;
//    @Column(name = "cidade", length = 50, nullable = false)
//    private String cidade;
//    @Column(name = "numero", length = 6, nullable = false)
//    private Integer numero;
//    @Column(name = "bairro", length = 30, nullable = false)
//    private String bairro;
//    @Column(name = "complemento", length = 50)
//    private String complemento;
//    @Column(name = "pais", length = 30, nullable = false)
//    private String pais;
    public void insert(EnderecoSemId enderecoBody) {
        EnderecoModel endereco = new EnderecoModel();

        endereco.setLogradouro(enderecoBody.getLogradouro());
        endereco.setCep(enderecoBody.getCep());
        endereco.setCidade(enderecoBody.getCidade());
        endereco.setNumero(enderecoBody.getNumero());
        endereco.setBairro(enderecoBody.getBairro());
        endereco.setComplemento(enderecoBody.getComplemento());
        endereco.setPais(enderecoBody.getPais());

        repository.save(endereco);
    }

    public void update(Long id, @RequestBody EnderecoComId enderecoBody){
        EnderecoModel endereco = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "[ ERROR ]"));
        EnderecoModel enderecoDto = EnderecoMapper.INSTANCE.toEndereco(enderecoBody);
        verificaNull(enderecoDto, endereco);


        repository.save(endereco);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
