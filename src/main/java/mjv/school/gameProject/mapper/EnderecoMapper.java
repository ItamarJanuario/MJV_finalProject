package mjv.school.gameProject.mapper;

import mjv.school.gameProject.dto.endereco.EnderecoDTO;
import mjv.school.gameProject.model.EnderecoModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")

public abstract class EnderecoMapper {
    public static final EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

    public abstract EnderecoModel toEndereco(EnderecoDTO enderecoBody);
}
