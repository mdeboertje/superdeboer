package nl.hhs.superdeboer.user;

public enum AuthStatus {
    UNKNOWN_USER("Gebruiker is onbekend."),
    SUCCESSFUL_LOGIN("Login succesvol."),
    INCORRECT_CREDENTIALS("Gegevens komen niet overeen.");

    private final String label;

    AuthStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}