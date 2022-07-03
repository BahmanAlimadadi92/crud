package ir.mapsa.bankcrud.bank;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
@AllArgsConstructor

public class BankController {

    private final IBankService service;
    private final BankMapper mapper;



    @PostMapping("/v1")
    public ResponseEntity<Void> save(@RequestBody BankDTO bankDTO){
        Bank bank = mapper.toEntity(bankDTO);
        service.save(bank);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @PutMapping("/v1")
    public ResponseEntity<Void> update(@RequestBody BankDTO bankDTO){

        Bank bank = mapper.toEntity(bankDTO);
        service.update(bank);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    @GetMapping("v1/{id}")
    public ResponseEntity<BankDTO> getById(@PathVariable Long id){
        Bank bank = service.getById(id);
        BankDTO bankDTO = mapper.toDTO(bank);
        return ResponseEntity.ok(bankDTO);

    }
    @GetMapping("/v1")
    public ResponseEntity<List<BankDTO>> getAll(){
        List<Bank> banks = service.getAll();
        List<BankDTO> bankDTOS = mapper.toDTOs(banks);
        return  ResponseEntity.ok(bankDTOS);
    }


    @DeleteMapping("/v/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/v1/{title}")
    public ResponseEntity<BankDTO> findByTitle(@PathVariable String title){

        Bank bank = service.findBytitle(title);
        BankDTO bankDTO = mapper.toDTO(bank);
        return  ResponseEntity.ok(bankDTO);

    }

}
