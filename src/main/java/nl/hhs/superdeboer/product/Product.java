package nl.hhs.superdeboer.product;

import nl.hhs.superdeboer.user.User;

import java.time.LocalDate;

public class Product {
    private String name;
    private double price;
    private int aisle;
    private final LocalDate creationDate;
    private final User createdBy;
    private LocalDate modifiedDate;
    private User lastEditedBy;

    public Product(String name, double price, int aisle, LocalDate creationDate, User createdBy, LocalDate modifiedDate, User lastEditedBy) {
        this.name = name;
        this.price = price;
        this.aisle = aisle;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.modifiedDate = modifiedDate;
        this.lastEditedBy = lastEditedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setCreationDate() {
        this.creationDate = creationDate;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(){
        this.createdBy = createdBy;
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
