package nl.hhs.superdeboer;

import nl.hhs.superdeboer.product.ProductService;
import nl.hhs.superdeboer.shoppinglist.ShoppingList;
import nl.hhs.superdeboer.user.Roles;
import nl.hhs.superdeboer.user.SecurityHolder;
import nl.hhs.superdeboer.user.User;

import java.util.List;

public class SuperDeBoer {
    public static void main(String[] args) {
        User user = new User("tes", "tes", List.of(Roles.USER), null);
        new ProductService().createProduct(null, 0, 0);

        SecurityHolder.setAuthentication(user);

        new ProductService().createProduct(null, 0, 0);

        new ShoppingList();


    }

}
