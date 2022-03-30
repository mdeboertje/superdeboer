package nl.hhs.superdeboer.product;

import nl.hhs.superdeboer.user.SecurityContextHolder;
import nl.hhs.superdeboer.user.User;

import java.util.Scanner;

public class ProductService {
    Scanner sc = new Scanner(System.in);

    public Product createProduct(String name, double price, int aisle){
        User currentUser = SecurityContextHolder.getUser();
        if (currentUser != null){
            Product product = new Product();

            System.out.println("Hoe wilt u het product noemen?");   
            name = sc.nextLine();
            product.setName(name);

            System.out.println("Hoe duur wordt dit product?");
            price = sc.nextDouble();
            product.setPrice(price);

            System.out.printLn("Welk pad heeft dit product?")    
            aisle = sc.nextInt();
            product.setAisle(aisle)

            product.setCreationDate(LocalDate.now());
            product.setCreatedBy(currentUser.getEmail);

            return product
        }
    }
}
