package ir.mapsa.bankcrud.account;

import ir.mapsa.bankcrud.bank.Bank;

import java.util.List;

public interface IAccountService {

    Account save(Account account);

    Account update(Account account);

    void delete(Long id);

    Account getById(Long id);

    List<Account> getAll();

    Bank findByBank_title(String title);

}
