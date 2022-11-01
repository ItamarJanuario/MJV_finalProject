package mjv.school.gameProject.mapper;

import mjv.school.gameProject.dto.usuario.UsuarioComId;
import mjv.school.gameProject.model.UsuarioModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class UsuarioMapper {
    public static final UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
    public abstract UsuarioModel toUsuario(UsuarioComId usuarioBody);
}
