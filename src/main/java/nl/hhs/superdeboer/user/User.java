package nl.hhs.superdeboer.user;

import nl.hhs.superdeboer.shoppinglist.ShoppingList;

import java.util.ArrayList;

public class User {
    private String email;
    private String password;
    private ArrayList<Roles> roles;
    private ArrayList<ShoppingList> shoppingLists;

    public User(String email, String password, ArrayList<Roles> roles, ArrayList<ShoppingList> shoppingLists) {
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

    public ArrayList<Roles> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Roles> roles) {
        this.roles = roles;
    }

    public ArrayList<ShoppingList> getShoppingLists() {
        return shoppingLists;
    }
}
