package mjv.school.gameProject.Service;

import mjv.school.gameProject.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

}
