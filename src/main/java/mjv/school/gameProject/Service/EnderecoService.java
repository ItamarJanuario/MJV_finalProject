package mjv.school.gameProject.Service;

import mjv.school.gameProject.Model.EnderecoModel;
import mjv.school.gameProject.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;


}
