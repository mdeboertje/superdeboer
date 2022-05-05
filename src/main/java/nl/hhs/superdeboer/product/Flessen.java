package nl.hhs.superdeboer.product;

import nl.hhs.superdeboer.user.SecurityContextHolder;
import nl.hhs.superdeboer.user.User;

import java.time.LocalDate;
import java.util.Scanner;

public class Flessen extends Product {
    private double statiegeld;

    protected Flessen(String name, double price, int aisle, LocalDate modifiedDate, User lastEditedBy, double statiegeld) {
        super(name, price, aisle, modifiedDate, lastEditedBy, ProductType.BOTTLE);
        this.statiegeld = statiegeld;
    }

    protected Flessen(String name, double price, int aisle, double statiegeld) {
        super(name, price, aisle);
        this.statiegeld = statiegeld;
    }

    public static Product createFles() {
        User currentUser = SecurityContextHolder.getUser();
        Scanner sc = new Scanner(System.in);

        Flessen product = null;
        if (currentUser != null) {
            System.out.println("Hoe wilt u het product noemen?");
            String name = sc.nextLine();

            System.out.println("Hoe duur wordt dit product?");
            double price = sc.nextDouble();

            System.out.println("Hoeveel statiegeld moet erbij?");
            double statiegeld = sc.nextDouble();

            System.out.println("Welk pad heeft dit product?");
            int aisle = sc.nextInt();

            product = new Flessen(name, price, aisle, statiegeld);

        }

        return product;
    }
}
