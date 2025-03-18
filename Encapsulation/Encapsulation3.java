class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        setQuantity(quantity);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void increaseStock(int amount) {
        if (amount > 0) {
            this.quantity += amount;
            System.out.println(amount + " units added to stock.");
        } else {
            System.out.println("Increase amount must be positive.");
        }
    }

    public void sellProduct(int amount) {
        if (amount > 0 && amount <= quantity) {
            this.quantity -= amount;
            System.out.println(amount + " units sold.");
        } else {
            System.out.println("Not enough stock to sell.");
        }
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 10, 899.99);
        prod1.displayProductInfo();
        prod1.increaseStock(5);
        prod1.sellProduct(3);
        prod1.displayProductInfo();
    }
}

