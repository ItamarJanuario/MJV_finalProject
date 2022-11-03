package mjv.school.gameProject.dto.usuario;

import mjv.school.gameProject.dto.endereco.EnderecoDTO;
import mjv.school.gameProject.model.EnderecoModel;
import mjv.school.gameProject.model.UsuarioModel;
import mjv.school.gameProject.service.EnderecoService;

public class UsuarioDTO {
    private String nome;
    private String senha;
    private String email;
    private Long endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getEndereco() {
        return endereco;
    }

    public void setEndereco(Long endereco) {
        this.endereco = endereco;
    }
}
