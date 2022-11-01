package mjv.school.gameProject.service;

import mjv.school.gameProject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

}
