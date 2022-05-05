package nl.hhs.superdeboer.product;

import nl.hhs.superdeboer.converter.GsonConverter;
import nl.hhs.superdeboer.user.SecurityContextHolder;
import nl.hhs.superdeboer.user.User;

import java.time.LocalDate;

public abstract class Product implements GsonConverter {
    private final String name;
    private double price;
    private int aisle;
    private final LocalDate creationDate;
    private final User createdBy;
    private LocalDate modifiedDate;
    private User lastEditedBy;
    private final ProductType productType;

    protected Product(String name, double price, int aisle, LocalDate modifiedDate, User lastEditedBy, ProductType productType) {
        this.name = name;
        this.price = price;
        this.aisle = aisle;
        this.productType = productType;
        this.creationDate = LocalDate.now();
        this.createdBy = SecurityContextHolder.getUser();
        this.modifiedDate = modifiedDate;
        this.lastEditedBy = lastEditedBy;
    }

    protected Product(String name, double price, int aisle) {
        this(name, price, aisle, null, null, ProductType.GENERIC);
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }


    public User getCreatedBy() {
        return createdBy;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public User getLastEditedBy() {
        return lastEditedBy;
    }

    public void setLastEditedBy(User lastEditedBy) {
        this.lastEditedBy = lastEditedBy;
    }
}
