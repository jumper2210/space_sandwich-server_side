package sandwich.backend.spaceSandwichBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import sandwich.backend.spaceSandwichBackend.Entity.Order;


public interface orderRepository extends JpaRepository<Order, Integer>,JpaSpecificationExecutor<Order> {
}
