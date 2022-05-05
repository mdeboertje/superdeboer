package nl.hhs.superdeboer.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SecurityContextHolderTest {

    @Test
    @DisplayName("setAuthenticate shouldn't set a session user")
    public void setAuthenticateIsNull() {
        User currentUser = SecurityContextHolder.getUser();
        assertNull(currentUser);
    }

    @Test
    @DisplayName("setAuthenticate should set a session user")
    public void setAuthenticateShouldSucceed() {
        User user = new User("piet@piet.nl", "test");
        SecurityContextHolder.setAuthentication(user);
        User currentUser = SecurityContextHolder.getUser();
        assertEquals(user.getEmail(), currentUser.getEmail());
    }

    @Test
    @DisplayName("User should log out")
    public void logoutShouldSucceed() {
        User user = new User("piet@piet.nl", "test");
        SecurityContextHolder.setAuthentication(user);

        User currentUser = SecurityContextHolder.getUser();
        assertEquals(user.getEmail(), currentUser.getEmail());

        SecurityContextHolder.logOut();
        User loggedOut = SecurityContextHolder.getUser();
        assertNull(loggedOut);
    }

    @Test
    @DisplayName("User should fail")
    public void logoutShouldFail() {
        User currentUser = SecurityContextHolder.getUser();
        assertNull(currentUser);

        SecurityContextHolder.logOut();
        User loggedOut = SecurityContextHolder.getUser();
        assertNull(loggedOut);
    }
}
