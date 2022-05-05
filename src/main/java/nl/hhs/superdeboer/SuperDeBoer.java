package nl.hhs.superdeboer;

import nl.hhs.superdeboer.product.Flessen;
import nl.hhs.superdeboer.product.Product;
import nl.hhs.superdeboer.product.ProductService;
import nl.hhs.superdeboer.product.Vers;
import nl.hhs.superdeboer.shoppinglist.ShoppingListService;
import nl.hhs.superdeboer.user.Authenticator;
import nl.hhs.superdeboer.user.SecurityContextHolder;
import nl.hhs.superdeboer.user.User;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class SuperDeBoer {
    public static void main(String[] args) {
        initDirectory();
        Scanner scanner = new Scanner(System.in);
        Authenticator authenticator = new Authenticator();

        System.out.println("Please Login");
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Password");
        String password = scanner.nextLine();
        authenticator.authenticate(email, password);
        User user = SecurityContextHolder.getUser();
        System.out.println(user.getEmail());

        while (true) {
            mainThing();
        }
    }

    private static void mainThing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kies 1 om een product aan te maken.");
        System.out.println("Kies 2 om uit te loggen.");
        int keuze = scanner.nextInt();
        switch (keuze) {
            case 1 -> {
                System.out.println("Create product");
                System.out.println("Kies het soort product wat u wilt maken \n 1. Flessen \n 2. Vers");
                int keuze2 = scanner.nextInt();
                switch (keuze2) {
                    case 1 -> {
                        while (true) {
                            ArrayList<Product> products = new ArrayList<>();
                            products.add(Flessen.createFles());
                            ShoppingListService.convertListToJson(products, "flessen.json");
                            System.out.println("Product toegevoegd");
                        }

                    }
                    case 2 -> {
                        ArrayList<Product> products = new ArrayList<>();
                        products.add(Vers.createVers());
                        ShoppingListService.convertListToJson(products, "vers.json");
                        System.out.println("Product toegevoegd");

                    } case 0 -> {
                        mainThing();
                    }

                }
            }
            case 2 -> {
                System.out.println("Uitloggen");
                SecurityContextHolder.logOut();
                System.exit(1);
            }
        }
        if (keuze == 0) {
            System.exit(0);
        }
    }

    private static void initDirectory() {
        File newDirectory = new File("data/text.json");
        if (!newDirectory.exists()) {
            System.out.println("Directory initialised");
            try {
                FileUtils.writeStringToFile(newDirectory, "string", StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (newDirectory.exists()) {
            System.out.println("Directory already exists");
        }

    }
}
