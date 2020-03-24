package sandwich.backend.spaceSandwichBackend.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import java.util.Date;
import sandwich.backend.spaceSandwichBackend.Config.JwtToken;
import sandwich.backend.spaceSandwichBackend.Repository.UserRepository;
import sandwich.backend.spaceSandwichBackend.Serializable_Implementations.JwtRequestImplementation;
import sandwich.backend.spaceSandwichBackend.Serializable_Implementations.JwtResponseImplementation;
import sandwich.backend.spaceSandwichBackend.Service.JwtUser;
import sandwich.backend.spaceSandwichBackend.Service.UserDate;


@RestController
@CrossOrigin
public class UserJwtController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtToken jwtToken;
    @Autowired
    private UserRepository ur;
    @Autowired
    private JwtUser userDetailsService;


    @PostMapping("/authentication")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequestImplementation authenticationRequest) throws Exception {

        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        final String token = jwtToken.generateToken(userDetails);
        final String username = jwtToken.getUsernameFromToken(token);
        final Date date = jwtToken.getExpirationDateFromToken(token);
        return ResponseEntity.ok(new JwtResponseImplementation(token, username, date));
    }

    @PostMapping("/registration")
    public ResponseEntity<?> saveUser(@RequestBody UserDate user) throws Exception {
        return ResponseEntity.ok(userDetailsService.save(user));
    }



    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
