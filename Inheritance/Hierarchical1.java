class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area() {
        return 0; 
    }

    public double perimeter() {
        return 0; 
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

   
    public double area() {
        return Math.PI * radius * radius;
    }

   
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

   
    public double area() {
        return width * height;
    }

  
    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println(circle.name + " - Area: " + circle.area() + ", Perimeter: " + circle.perimeter());
        System.out.println(rectangle.name + " - Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter() + ", Diagonal: " + rectangle.diagonal());
    }
}

