package sandwich.backend.spaceSandwichBackend.Repository;

import org.springframework.data.repository.CrudRepository;
import sandwich.backend.spaceSandwichBackend.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}