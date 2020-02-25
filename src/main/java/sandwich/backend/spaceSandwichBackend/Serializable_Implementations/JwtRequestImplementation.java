package sandwich.backend.spaceSandwichBackend.Serializable_Implementations;

import java.io.Serializable;

public class JwtRequestImplementation implements Serializable {
    private static final long serialVersionUID = 591111115150707L;
    private String username;
    private String password;

    //default constructor for JSON Parsing
    public JwtRequestImplementation()
    {
    }

    public JwtRequestImplementation(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


