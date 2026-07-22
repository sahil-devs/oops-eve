class Product {

    String id;
    String name;
    double price;
    int quantity;

    Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotal() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs." + calculateTotal());
    }
}

public class day13_1 {
    public static void main(String[] args) {

        Product p = new Product("P101", "Keyboard", 850, 3);
        p.display();

    }
}