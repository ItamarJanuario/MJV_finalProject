package mjv.school.gameProject.Service;

import mjv.school.gameProject.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;
}
