package mjv.school.gameProject.dto.endereco;

import mjv.school.gameProject.model.EnderecoModel;

public class EnderecoResponseDTO {
    private Long id;
    private String logradouro;
    private String cep;
    private String cidade;
    private Integer numero;
    private String bairro;
    private String complemento;
    private String pais;

    public EnderecoResponseDTO () {

    }

    public EnderecoResponseDTO (EnderecoModel endereco) {
        id = endereco.getId();
        logradouro = endereco.getLogradouro();
        cep = endereco.getCep();
        cidade = endereco.getCidade();
        numero = endereco.getNumero();
        bairro = endereco.getBairro();
        complemento = endereco.getComplemento();
        pais = endereco. getPais();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCidade() {
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
