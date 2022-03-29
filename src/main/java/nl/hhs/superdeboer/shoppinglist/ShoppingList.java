package nl.hhs.superdeboer.shoppinglist;

import nl.hhs.superdeboer.user.SecurityContextHolder;
import nl.hhs.superdeboer.user.User;

public class ShoppingList {
    public ShoppingList() {
        User user = SecurityContextHolder.getUser();
        System.out.println(user.getEmail());
    }
}
