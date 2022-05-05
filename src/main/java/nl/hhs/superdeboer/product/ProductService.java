package nl.hhs.superdeboer.product;

import nl.hhs.superdeboer.user.SecurityContextHolder;
import nl.hhs.superdeboer.user.User;

import java.time.LocalDate;
import java.util.Scanner;

public class ProductService {
    Scanner sc = new Scanner(System.in);

    public Product createProduct(String name, double price, int aisle) {
        User currentUser = SecurityContextHolder.getUser();
        if (currentUser != null) {
            System.out.println("Wat voor product wilt u toevoegen?");

            System.out.println("Hoe wilt u het product noemen?");
            name = sc.nextLine();

            System.out.println("Hoe duur wordt dit product?");
            price = sc.nextDouble();


            System.out.println("Welk pad heeft dit product?");
            aisle = sc.nextInt();


            return null;
        }


        return null;
    }
}
