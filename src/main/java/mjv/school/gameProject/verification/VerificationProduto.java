package mjv.school.gameProject.verification;

import mjv.school.gameProject.dto.produto.ProdutoDTO;
import mjv.school.gameProject.model.ProdutoModel;

public class VerificationProduto {
    public static void verificarProduto(ProdutoModel produto, ProdutoDTO produtoDTO) {
        if(produtoDTO.getNome() != null) {
            produto.setNome(produtoDTO.getNome());
        }
        if(produtoDTO.getDescricao() != null) {
            produto.setDescricao(produtoDTO.getDescricao());
        }
        if(produtoDTO.getValor() != null) {
            produto.setValor(produtoDTO.getValor());
        }
        if(produtoDTO.getDesenvolvedora() != null) {
            produto.setDesenvolvedora(produtoDTO.getDesenvolvedora());
        }
    }
}
