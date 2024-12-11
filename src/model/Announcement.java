package model;

import java.math.BigDecimal;

public class Announcement {
    private long id;
private String name;
private String description;
private BigDecimal price;
private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Announcement(Long id,String name, String description, BigDecimal price, String owner) {
       this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.owner = owner;

    }

    @Override
    public String toString() {
        return "\nAnnouncement{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                '}';
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
