package ir.mapsa.bankcrud.user;

import java.util.List;

public interface IUserService {

    User save (User user);

    void delete(Long id);

    User update(User user);

    List<User> getAll();

    User getById(Long id);

    List<User> findByAllNationalCodeGreaterThan(String nationalCode);

    List<User> findByAllAgeIsAfter(Integer age);

    User findByFamily(String family);


}
