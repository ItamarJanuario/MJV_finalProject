package mjv.school.gameProject.model;

import mjv.school.gameProject.service.EnderecoService;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tab_usuario")
public class UsuarioModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    @Column(name = "senha", length = 50, nullable = false)
    private String senha;
    @Column(name = "data_registro", nullable = false)
    private LocalDate dataRegistro;
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private EnderecoModel endereco;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pedido_id")
    private List<PedidoModel> listaPedido = new ArrayList<>();

    public UsuarioModel(){dataRegistro = LocalDate.now();}


    public Long getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
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
