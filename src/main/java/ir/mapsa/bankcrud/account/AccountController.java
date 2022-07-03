package ir.mapsa.bankcrud.account;

import ir.mapsa.bankcrud.bank.Bank;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@AllArgsConstructor
public class AccountController {

    private final IAccountService service;
    private final AccountMapper mapper;


    @PostMapping("/v1")
    public ResponseEntity<Void> save(@RequestBody AccountDto accountDto){

        Account account = mapper.toEntity(accountDto);
        service.save(account);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @PutMapping("/v1")
    public ResponseEntity<Void> update(@RequestBody AccountDto accountDto){

        Account account = mapper.toEntity(accountDto);
        service.update(account);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<AccountDto> getById(@PathVariable Long id){

        Account account = service.getById(id);
        AccountDto accountDto = mapper.toDTO(account);
        return  ResponseEntity.ok(accountDto);


    }

    @GetMapping("/v1")
    public ResponseEntity<List<AccountDto>> getAll(){

        List<Account> accounts = service.getAll();
        List<AccountDto> accountDtos = mapper.toDTOS(accounts);
        return ResponseEntity.ok(accountDtos);
    }

    @DeleteMapping("/v1/{id}")

    public ResponseEntity<Void> delete(@PathVariable Long id){

        service.delete(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/v1/{title}")
    public ResponseEntity<Bank> findByBank_title(@PathVariable String title){



        Bank byBank_title = service.findByBank_title(title);

        return  ResponseEntity.ok(byBank_title);



    }



}
