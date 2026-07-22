class CartItem {

    String itemName;
    double unitPrice;
    int quantity;

    CartItem(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    CartItem updateQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    double calculateAmount() {
        return unitPrice * quantity;
    }

    void display() {
        System.out.println("Item: " + itemName);
        System.out.println("Unit Price: Rs." + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: Rs." + calculateAmount());
    }
}

public class day13_3 {
    public static void main(String[] args) {

        CartItem item = new CartItem("Notebook", 60, 2);

        item.updateQuantity(5).display();

    }
}