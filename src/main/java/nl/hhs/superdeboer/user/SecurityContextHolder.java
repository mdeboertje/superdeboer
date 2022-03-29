package nl.hhs.superdeboer.user;

public class SecurityContextHolder {
    private static User user;

    public static void setAuthentication(User authenticatedUser){
        user = authenticatedUser;
    }

    public static User getUser(){
        return user;
    }
}
