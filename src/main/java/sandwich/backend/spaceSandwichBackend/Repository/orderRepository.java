package sandwich.backend.spaceSandwichBackend.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sandwich.backend.spaceSandwichBackend.Entity.Order;

import java.util.List;
import java.util.Optional;

@Repository
public interface orderRepository extends CrudRepository<Order, Long> {
    Optional<Order> findById(Long id);


}
