package ir.mapsa.bankcrud.bank;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface BankRepository extends PagingAndSortingRepository<Bank,Long> {

   Optional<Bank>  findByTitle(String title);
}
