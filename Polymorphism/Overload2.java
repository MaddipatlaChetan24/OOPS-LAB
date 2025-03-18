class AreaCalculator {


    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        
     
        System.out.println("Area of Circle with radius 5: " + calculator.calculateArea(5));
        
      
        System.out.println("Area of Rectangle with length 4 and width 6: " + calculator.calculateArea(4, 6));
        
      
        System.out.println("Area of Triangle with base 4 and height 8: " + calculator.calculateArea(4, 8));
    }
}

