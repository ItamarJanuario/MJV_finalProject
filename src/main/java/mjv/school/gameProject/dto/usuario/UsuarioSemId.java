package mjv.school.gameProject.dto.usuario;

import mjv.school.gameProject.model.EnderecoModel;
import mjv.school.gameProject.model.PedidoModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsuarioSemId {

    private String nome;
    private String senha;
    private LocalDate dataRegistro;
    private String email;
    private EnderecoModel endereco;
    private List<PedidoModel> listaPedido = new ArrayList<>();

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public List<PedidoModel> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(List<PedidoModel> listaPedido) {
        this.listaPedido = listaPedido;
    }
}
