package ir.mapsa.bankcrud.user;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor

public class UserController {


    private final IUserService service;
    private final UserMapper mapper;



    @PostMapping("/v1")
    public ResponseEntity<Void> save(@RequestBody UserDTO userDTO){
        User user = mapper.toEntity(userDTO);
        User save = service.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/v1")
    public ResponseEntity<Void> update(@RequestBody UserDTO userDTO){
        User user = mapper.toEntity(userDTO);
        User update = service.update(user);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    @GetMapping("/v1/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable Long id){
        User user = service.getById(id);
        UserDTO userDTO = mapper.toDTO(user);
        return ResponseEntity.ok(userDTO);

    }



    @GetMapping("/v1")
    public ResponseEntity<List<UserDTO>> getAll(){
        List<User> users = service.getAll();
        List<UserDTO> userDTOS = mapper.toDTOS(users);
        return  ResponseEntity.ok(userDTOS);

    }

    @DeleteMapping("/v1/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        service.delete(id);
        return  ResponseEntity.ok().build();

    }


    @GetMapping("/v1/{allnationalcodegreaterthan}")
    public ResponseEntity<List<UserDTO>> nationalCodeGreaterThan(@PathVariable String nationalCode){
        List<User> byAllNationalCodeGreaterThan = service.findByAllNationalCodeGreaterThan(nationalCode);
        List<UserDTO> userDTOS = mapper.toDTOS(byAllNationalCodeGreaterThan);
        return ResponseEntity.ok(userDTOS);

    }


    @GetMapping("/v1/{allageisafter}")
    public ResponseEntity<List<UserDTO>> allAgeIsAfter(@PathVariable Integer age){

        List<User> byAllAgeIsAfter = service.findByAllAgeIsAfter(age);
        List<UserDTO> userDTOS = mapper.toDTOS(byAllAgeIsAfter);
        return ResponseEntity.ok(userDTOS);

    }

    @GetMapping("/v1/{family}")
    public ResponseEntity<UserDTO> findByFamily(@PathVariable String family){
        User byFamily = service.findByFamily(family);
        UserDTO userDTO = mapper.toDTO(byFamily);
        return ResponseEntity.ok(userDTO);

    }




}
