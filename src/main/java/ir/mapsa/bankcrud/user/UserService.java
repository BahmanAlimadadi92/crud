package ir.mapsa.bankcrud.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements IUserService{
    private final UserRepository repository;



    @Override
    public User save(User user) {
        return repository.save(user) ;
    }

    @Override
    public void delete(Long id) {
        getById(id);
        repository.deleteById(id);
    }

    @Override
    public User update(User user) {
        User lastSavedUser=getById(user.getId());
        lastSavedUser.setAge(user.getAge());
        lastSavedUser.setFamily(user.getFamily());
        lastSavedUser.setFullName(user.getFullName());
        lastSavedUser.setNationalCode(user.getNationalCode());
        return repository.save(lastSavedUser);

    }

    @Override
    public List<User> getAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    public User getById(Long id) {
        Optional<User> optional=repository.findById(id);
        if (!optional.isPresent()){
            throw new RuntimeException("not found");
        }
        return optional.get();

    }

    @Override
    public List<User> findByAllNationalCodeGreaterThan(String nationalCode) {
        List<User> allByNationalCodeGreaterThan = repository.findAllByNationalCodeGreaterThan(nationalCode);
        return allByNationalCodeGreaterThan;
    }

    @Override
    public List<User> findByAllAgeIsAfter(Integer age) {
        List<User> allByAgeIsAfter = repository.findAllByAgeIsAfter(age);
        return allByAgeIsAfter;
    }

    @Override
    public User findByFamily(String family) {
        Optional<User> optional=repository.findByFamily(family);
        if (!optional.isPresent()){
            throw new RuntimeException("not found");
        }
        return optional.get();
    }
}
