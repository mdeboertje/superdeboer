package nl.hhs.superdeboer.user;


import java.util.HashSet;
import java.util.Set;

public class Authenticator {
    private final Set<User> users = new HashSet<>();

    public Authenticator() {
        users.add(new User("piet@piet.nl", "test"));
        users.add(new User("jan@piet.nl", "test"));

    }

    public Set<User> getUsers() {
        return users;
    }

    public AuthStatus authenticate(String email, String password) {
        User user = users.stream().filter(u -> u.getEmail().equals(email)).findFirst().orElse(null);
        if (user == null){
            return AuthStatus.UNKNOWN_USER;
        }

        if (!user.getPassword().equals(password)){
            return AuthStatus.INCORRECT_CREDENTIALS;
        }

        SecurityContextHolder.setAuthentication(user);

        return AuthStatus.SUCCESSFUL_LOGIN;
    }

}
