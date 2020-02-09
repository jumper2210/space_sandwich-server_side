package sandwich.backend.spaceSandwichBackend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sandwich.backend.spaceSandwichBackend.Config.JwtToken;
import sandwich.backend.spaceSandwichBackend.Entity.User;
import sandwich.backend.spaceSandwichBackend.Repository.UserRepository;
import sandwich.backend.spaceSandwichBackend.Serializable_Implementations.JwtResponseImplementation;

import java.util.ArrayList;
import java.util.Date;

@Service
public class JwtUser implements UserDetailsService {
    @Autowired
    private UserRepository ur;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Autowired
    private JwtUser userDetailsService;

    @Autowired
    private JwtToken jwtToken;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = ur.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }

    public JwtResponseImplementation save(User user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        ur.save(newUser);

        final UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());

        final String token = jwtToken.generateToken(userDetails);
        final String username = jwtToken.getUsernameFromToken(token);
        final Date date = jwtToken.getExpirationDateFromToken(token);

        return new JwtResponseImplementation(token, username, date);
    }
}