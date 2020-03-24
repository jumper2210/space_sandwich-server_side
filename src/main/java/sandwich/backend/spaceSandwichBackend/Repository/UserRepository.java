package sandwich.backend.spaceSandwichBackend.Repository;

import org.springframework.data.repository.CrudRepository;
import sandwich.backend.spaceSandwichBackend.Entity.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
    Optional<User> findById(Long id);
}