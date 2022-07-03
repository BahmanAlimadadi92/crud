package ir.mapsa.bankcrud.account;

import ir.mapsa.bankcrud.bank.Bank;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {

   Optional<Bank>  findByBank_Title(String title);

}
