package nl.hhs.superdeboer;

import nl.hhs.superdeboer.product.ProductService;
import nl.hhs.superdeboer.shoppinglist.ShoppingList;
import nl.hhs.superdeboer.user.Login;
import nl.hhs.superdeboer.user.Roles;
import nl.hhs.superdeboer.user.SecurityContextHolder;
import nl.hhs.superdeboer.user.User;

import java.util.List;
import java.util.Scanner;

public class SuperDeBoer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        System.out.println("Please Login");
        String email = scanner.nextLine();
        String password = scanner.nextLine();
        login.authenticate(email, password);
        User user = SecurityContextHolder.getUser();
        System.out.println(user.getEmail());

        SecurityContextHolder.logOut();

        System.out.println(user.getEmail());

//        while (true){
//
//
//            int keuze = scanner.nextInt();
//
//            switch (keuze){
//                case 1 -> {
//                    System.out.println("Uitloggen");
//                    SecurityContextHolder.logOut();
//                    System.exit(1);
//                }
//                case 2 -> System.out.println("yeet");
//            }
//            System.out.println(SecurityContextHolder.getUser());
//        }




    }

}
