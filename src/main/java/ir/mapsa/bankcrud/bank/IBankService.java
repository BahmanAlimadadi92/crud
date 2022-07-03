package ir.mapsa.bankcrud.bank;

import java.util.List;

public interface IBankService {

  Bank save(Bank bank);

  Bank update(Bank bank);

  void delete (Long id);

  Bank getById(Long id);

  List<Bank> getAll();

  Bank findBytitle(String title);






}
