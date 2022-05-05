package nl.hhs.superdeboer.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthenticatorTest {
    @Test
    @DisplayName("Login should fail with unknown email")
    public void loginWithUnknownCreds(){
        Authenticator authenticator = new Authenticator();
        assertEquals(authenticator.authenticate("henkdetank@tank.nl","tank123"), AuthStatus.UNKNOWN_USER);
    }

    @Test
    @DisplayName("Login should fail with invalid credentials")
    public void loginWithInvalidCreds(){
        Authenticator authenticator = new Authenticator();
        assertEquals(authenticator.authenticate("piet@piet.nl", "best"), AuthStatus.INCORRECT_CREDENTIALS);
    }

    @Test
    @DisplayName("Login should succeed with the correct credentials")
    public void loginWithCorrectCreds(){
        Authenticator authenticator = new Authenticator();
        assertEquals(authenticator.authenticate("piet@piet.nl", "test"), AuthStatus.SUCCESSFUL_LOGIN);
    }

}
