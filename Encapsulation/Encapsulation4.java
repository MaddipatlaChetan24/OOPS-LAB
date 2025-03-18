class Book {
    private String title;
    private double price;
    private double discount;

    public Book(String title, double price, double discount) {
        this.title = title;
        setPrice(price);
        setDiscount(discount);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setDiscount(double discount) {
        if (discount >= 0 && discount <= 100) {
            this.discount = discount;
        } else {
            System.out.println("Discount must be between 0 and 100.");
        }
    }

    public double calculatePriceAfterDiscount() {
        return price - (price * discount / 100);
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Price after discount: $" + calculatePriceAfterDiscount());
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 50.0, 10.0);
        book1.displayBookInfo();
    }
}

