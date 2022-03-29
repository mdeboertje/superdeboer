package nl.hhs.superdeboer.shoppinglist;

import nl.hhs.superdeboer.user.SecurityHolder;
import nl.hhs.superdeboer.user.User;

public class ShoppingList {
    public ShoppingList() {
        User user = SecurityHolder.getUser();
        System.out.println(user.getEmail());
    }
}
