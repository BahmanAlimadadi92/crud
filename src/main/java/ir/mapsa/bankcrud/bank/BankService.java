package ir.mapsa.bankcrud.bank;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class BankService implements IBankService {


    private final BankRepository repository;

    @Override
    public Bank save(Bank bank) {

        return repository.save(bank);
    }

    @Override
    public Bank update(Bank bank) {
        Bank lastSavedBank=getById( bank.getId());
        lastSavedBank.setBranchCode(bank.getBranchCode());
        lastSavedBank.setTitle(bank.getTitle());

        return repository.save(lastSavedBank);
    }

    @Override
    public void delete(Long id) {

        getById(id);
        repository.deleteById(id);

    }

    @Override
    public Bank getById(Long id) {
        Optional<Bank> optionalBankAtm=repository.findById(id);
        if (!optionalBankAtm.isPresent()){
            throw new RuntimeException("not found");
        }
        return optionalBankAtm.get();

    }

    @Override
    public List<Bank> getAll() {

        return (List<Bank>) repository.findAll();
    }

    @Override
    public Bank findBytitle(String title) {
        Optional<Bank> optional=repository.findByTitle(title);
        if (!optional.isPresent()){
            throw new RuntimeException("not found");
        }

        return optional.get();
    }


}
