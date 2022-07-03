package ir.mapsa.bankcrud.user;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-03T13:56:12+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setVersion( userDTO.getVersion() );
        user.setCreatedDate( userDTO.getCreatedDate() );
        user.setCreatedBy( userDTO.getCreatedBy() );
        user.setLastModifiedDate( userDTO.getLastModifiedDate() );
        user.setLastModifiedBy( userDTO.getLastModifiedBy() );
        user.setNationalCode( userDTO.getNationalCode() );
        user.setFamily( userDTO.getFamily() );
        user.setAge( userDTO.getAge() );

        return user;
    }

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setVersion( user.getVersion() );
        userDTO.setCreatedDate( user.getCreatedDate() );
        userDTO.setCreatedBy( user.getCreatedBy() );
        userDTO.setLastModifiedDate( user.getLastModifiedDate() );
        userDTO.setLastModifiedBy( user.getLastModifiedBy() );
        userDTO.setNationalCode( user.getNationalCode() );
        userDTO.setAge( user.getAge() );
        userDTO.setFamily( user.getFamily() );

        return userDTO;
    }

    @Override
    public List<User> toEntities(List<UserDTO> userDTOS) {
        if ( userDTOS == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userDTOS.size() );
        for ( UserDTO userDTO : userDTOS ) {
            list.add( toEntity( userDTO ) );
        }

        return list;
    }

    @Override
    public List<UserDTO> toDTOS(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( users.size() );
        for ( User user : users ) {
            list.add( toDTO( user ) );
        }

        return list;
    }
}
