package sandwich.backend.spaceSandwichBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sandwich.backend.spaceSandwichBackend.Entity.Order;

import java.util.List;

@Repository
public interface orderRepository extends CrudRepository<Order, Integer> {

}
