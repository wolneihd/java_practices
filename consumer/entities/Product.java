package consumer.entities;

public class Product {

    private String name;
    private Double price;

    public Product() { }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticProductPredicate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    } 

    public void nonStaticProductPredicate() {
        price = price * 1.1;
    } 

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    
}
