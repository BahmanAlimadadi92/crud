package ir.mapsa.bankcrud.user;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends PagingAndSortingRepository<User,Long> {


    List<User> findAllByNationalCodeGreaterThan(String nationalCode);

    List<User> findAllByAgeIsAfter(Integer age);

   Optional<User> findByFamily(String family);

}
