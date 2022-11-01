package mjv.school.gameProject;

import mjv.school.gameProject.model.EnderecoModel;

public class Verifications {

    //verificando e passando para DTO
    public static void verificaNull(EnderecoModel enderecoDto, EnderecoModel endereco){

            if(enderecoDto.getLogradouro() != null) {
                endereco.setLogradouro(enderecoDto.getLogradouro());
            }
            if(enderecoDto.getCep() != null) {
                endereco.setCep(enderecoDto.getCep());
            }
            if(enderecoDto.getCidade() != null) {
                endereco.setCidade(enderecoDto.getCidade());
            }
            if(enderecoDto.getNumero() != null) {
                endereco.setNumero(enderecoDto.getNumero());
            }
            if(enderecoDto.getBairro() != null) {
                endereco.setBairro(enderecoDto.getBairro());
            }
            if(enderecoDto.getComplemento() != null) {
                endereco.setComplemento(enderecoDto.getComplemento());
            }
            if(enderecoDto.getPais() != null) {
                endereco.setPais(enderecoDto.getPais());
            }
    }
}
