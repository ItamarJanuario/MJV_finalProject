package mjv.school.gameProject.Model;

import javax.persistence.*;

@Entity
@Table(name = "tab_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    @Column(name = "descricao", length = 125, nullable = false)
    private String descricao;

    @Column(name = "preco", nullable = false)
    private Double preco;
    @Column(name = "desencolvedora", length = 50, nullable = false)
    private String desenvolvedora;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }
}
