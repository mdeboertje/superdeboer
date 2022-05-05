package nl.hhs.superdeboer.product;

import nl.hhs.superdeboer.user.SecurityContextHolder;
import nl.hhs.superdeboer.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.Scanner;

public abstract class Vers extends Product {
    private int gewicht;
    private Date houdbaarheid;


    public Vers(String name, double price, int aisle, LocalDate modifiedDate, User lastEditedBy, int gewicht, Date houdbaarheid) {
        super(name, price, aisle, modifiedDate, lastEditedBy, ProductType.FRESH);
        this.gewicht = gewicht;
        this.houdbaarheid = houdbaarheid;
    }

    public Vers(String name, double price, int aisle, int gewicht, Date houdbaarheid) {
        super(name, price, aisle, null, null, ProductType.FRESH);
        this.gewicht = gewicht;
        this.houdbaarheid = houdbaarheid;
    }

    public static Product createVers() {
        User currentUser = SecurityContextHolder.getUser();
        Scanner sc = new Scanner(System.in);

        Product product = null;
        if (currentUser != null) {
            System.out.println("Hoe wilt u het product noemen?");
            String name = sc.nextLine();

            System.out.println("Hoe duur wordt dit product?");
            double price = sc.nextDouble();

            System.out.println("Hoeveel statiegeld moet erbij?");
            double statiegeld = sc.nextDouble();

            System.out.println("Welk pad heeft dit product?");
            int aisle = sc.nextInt();

            System.out.println("Hoeveel weegt dit product?");
            int gewicht = sc.nextInt();

            Date dt = new Date();
            LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC"))).plusDays(7
            );
            product = new Vers(name, price, aisle, gewicht, dt) {
            };
        }
        return product;

    }
}
