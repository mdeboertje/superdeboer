package nl.hhs.superdeboer.user;

import nl.hhs.superdeboer.shoppinglist.ShoppingList;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private String password;
    private List<Roles> roles;
    private List<ShoppingList> shoppingLists;

    public User(String email, String password, List<Roles> roles, List<ShoppingList> shoppingLists) {
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.shoppingLists = shoppingLists;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Roles> roles) {
        this.roles = roles;
    }

    public List<ShoppingList> getShoppingLists() {
        return shoppingLists;
    }
}
