package nl.hhs.superdeboer.product;

import nl.hhs.superdeboer.user.SecurityHolder;
import nl.hhs.superdeboer.user.User;

import java.util.Scanner;

public class ProductService {
    Scanner sc = new Scanner(System.in);

    public Product createProduct(String name, double price, int aisle){
        System.out.println("Hoe wilt u het product noemen?");

        User user = SecurityHolder.getUser();

        System.out.println(user);
        return null;
    }
}
