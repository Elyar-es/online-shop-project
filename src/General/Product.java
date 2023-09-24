package General;

import javafx.scene.image.Image;

import java.math.BigDecimal;

public class Product {
    private String name;
    private String id;
    private int stock;
    private BigDecimal price;
    private Image image;

    public Product(String name, String id, int stock, BigDecimal price) {
        this.name = name;
        this.id = id;
        this.stock = stock;
        this.price = price;
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}