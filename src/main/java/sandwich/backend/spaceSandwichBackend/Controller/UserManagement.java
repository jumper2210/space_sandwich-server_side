package sandwich.backend.spaceSandwichBackend.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import sandwich.backend.spaceSandwichBackend.Entity.Order;
import sandwich.backend.spaceSandwichBackend.Entity.User;
import sandwich.backend.spaceSandwichBackend.Repository.UserRepository;
import sandwich.backend.spaceSandwichBackend.Repository.orderRepository;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserManagement {

    @Autowired
    private UserRepository ur;
@Autowired
private orderRepository or;
    @CrossOrigin
    @GetMapping("/getAllUsers")
    public List<User> retrieveAllUsers() {
        return (List<User>) ur.findAll();
    }

    @CrossOrigin
    @GetMapping("/getUserData")
    public ResponseEntity<?> retrieveAllUserData() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = ur.findByUsername(username);
        return ResponseEntity.ok(user.getRoles());
    }

    @PostMapping("/deleteUser")
    public ResponseEntity<?> deleteUser(@RequestBody User user, Order order) throws IllegalAccessException {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User admin = ur.findByUsername(username);
        Optional<User> userToDelete = ur.findById(user.getId());
        String userRole = admin.getRoles();
        User utd = userToDelete.get();
        utd.getOrders();
        if ( userRole.equals("ROLE_ADMIN")) {
            or.delete(order);
            ur.delete(utd);
        } else {return null; }
        return ResponseEntity.ok(user);
    }
}
