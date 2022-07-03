package ir.mapsa.bankcrud.account;

import ir.mapsa.bankcrud.bank.Bank;
import ir.mapsa.bankcrud.bank.IBankService;
import ir.mapsa.bankcrud.exception.NotFoundException;
import ir.mapsa.bankcrud.user.IUserService;
import ir.mapsa.bankcrud.user.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AccountService implements IAccountService{

    private final AccountRepository repository;
    private final IBankService service;
    private final IUserService iUserService;


    @Override
    public Account save(Account account) {
       Bank bank = service.getById(account.getBank().getId());
        User user =iUserService.getById(account.getUser().getId());
       account.setUser(user);
       account.setBank(bank);
       return  repository.save(account);


    }

    @Override
    public Account update(Account account) {
        Account lastSavedAccount=getById(account.getId());
        lastSavedAccount.setTitle(account.getTitle());
        lastSavedAccount.setUser(account.getUser());
        lastSavedAccount.setBank(account.getBank());
        return repository.save(lastSavedAccount);
    }

    @Override
    public void delete(Long id) {
        getById(id);
        repository.deleteById(id);
    }

    @Override
    public Account getById(Long id) {
        Optional<Account> optional=repository.findById(id);
        if (!optional.isPresent()){

            throw new NotFoundException("Not Found");
        }
        return optional.get();
    }

    @Override
    public List<Account> getAll() {
        return (List<Account>) repository.findAll();
    }

    @Override
    public Bank findByBank_title(String title) {
        Optional<Bank> optional = repository.findByBank_Title(title);
        if (!optional.isPresent()){
            throw  new RuntimeException("not found");
        }
        return optional.get();

    }




}
