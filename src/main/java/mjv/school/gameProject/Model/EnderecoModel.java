package mjv.school.gameProject.Model;

import javax.persistence.*;

@Entity
@Table(name = "tab_endereco")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "logradouro", length = 50, nullable = false)
    private String logradouro;
    @Column(name = "cep", length = 10, nullable = false)
    private String cep;
    @Column(name = "cidade", length = 50, nullable = false)
    private String cidade;
    @Column(name = "numero", length = 6, nullable = false)
    private Integer numero;
    @Column(name = "bairro", length = 30, nullable = false)
    private String bairro;
    @Column(name = "complemento", length = 50, nullable = false)
    private String complemento;
    @Column(name = "pais", length = 30, nullable = false)
    private String pais;


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade) {
       this.cidade = cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}