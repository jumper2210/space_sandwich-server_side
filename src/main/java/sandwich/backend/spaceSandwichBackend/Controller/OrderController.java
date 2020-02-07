package sandwich.backend.spaceSandwichBackend.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sandwich.backend.spaceSandwichBackend.Entity.Order;
import sandwich.backend.spaceSandwichBackend.Repository.orderRepository;


@CrossOrigin
@RestController
public class OrderController {

    @Autowired
    private orderRepository or;

    @PostMapping("/orders")
    public ResponseEntity<?> setOrder(@RequestBody Order order) {

        return ResponseEntity.ok(order);
    }
}
