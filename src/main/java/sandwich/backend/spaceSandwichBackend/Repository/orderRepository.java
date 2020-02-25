package sandwich.backend.spaceSandwichBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import sandwich.backend.spaceSandwichBackend.Entity.Order;

@Repository
public interface orderRepository extends JpaRepository<Order, Integer> {
}
