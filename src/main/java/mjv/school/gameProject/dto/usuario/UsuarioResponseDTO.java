package mjv.school.gameProject.dto.usuario;

import mjv.school.gameProject.dto.endereco.EnderecoResponseDTO;
import mjv.school.gameProject.model.UsuarioModel;

import java.time.LocalDate;

public class UsuarioResponseDTO {
    private Long id;
    private String nome;
    private String senha;
    private LocalDate dataRegistro;
    private EnderecoResponseDTO endereco;

    public UsuarioResponseDTO() {

    }

    public UsuarioResponseDTO(UsuarioModel usuario) {
        id = usuario.getId();
        nome = usuario.getNome();
        senha = usuario.getSenha();
        dataRegistro = usuario.getDataRegistro();

        if (usuario.getEndereco() != null) {
            endereco = new EnderecoResponseDTO(usuario.getEndereco());
        }
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public EnderecoResponseDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoResponseDTO endereco) {
        this.endereco = endereco;
    }
}
