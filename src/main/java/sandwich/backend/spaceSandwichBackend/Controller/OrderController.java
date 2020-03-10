package sandwich.backend.spaceSandwichBackend.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import sandwich.backend.spaceSandwichBackend.Entity.Order;
import sandwich.backend.spaceSandwichBackend.Entity.User;
import sandwich.backend.spaceSandwichBackend.Repository.UserRepository;
import sandwich.backend.spaceSandwichBackend.Repository.orderRepository;

import java.util.List;

@CrossOrigin
@RestController
public class OrderController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private orderRepository or;

    public boolean checkNull(Order order) throws IllegalAccessException {
        if (order.getIngredients() != null && order.getOrderData() != null )
            return true;
        else
            return false;
    }


    @GetMapping("/zamowieniaAdmin")
    public List<Order> retrieveAllUserOrdersAdmin() {
        return (List<Order>) or.findAll();



    }

    @PostMapping("/zamowienia")
    public ResponseEntity<?> createOrder(@RequestBody Order order) throws IllegalAccessException {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByUsername(username);

        if (checkNull(order)) {
            order.setUser(user);
            or.save(order);
        } else {
            return new ResponseEntity<Object>("Wrong data", HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(order);
    }

    @CrossOrigin
    @GetMapping("/zamowienia")
    public ResponseEntity<?> retrieveAllUserOrders() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByUsername(username);
        return ResponseEntity.ok(user.getOrders());
    }
    @CrossOrigin
    @GetMapping("/getUserData")
    public ResponseEntity<?> retrieveAllUserData() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByUsername(username);
        return ResponseEntity.ok(user.getRoles());
    }
}
