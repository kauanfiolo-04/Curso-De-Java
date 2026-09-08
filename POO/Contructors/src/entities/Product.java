package entities;

public class Product {
    String name; // Sem modificador, só pode ser acessado nas classes do msm Package
    private double price;
    private int quantity;

    // Contructor padrao
    public Product() {}

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Contructor sobrecarregado
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "{ name: " + name +
                " , price: $" + String.format("%.2f", price) +
                " , quantity: " + quantity +
                " , total: $" + String.format("%.2f", totalValueInStock()) +
                " }";
    }
}
