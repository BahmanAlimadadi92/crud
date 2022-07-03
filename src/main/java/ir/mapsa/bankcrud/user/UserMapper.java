package ir.mapsa.bankcrud.user;

import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDTO userDTO);

    UserDTO toDTO(User user);

    List<User> toEntities(List<UserDTO> userDTOS);

    List<UserDTO> toDTOS(List<User> users);



}
