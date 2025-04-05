package geometry;
import geometry.Shape;
import geometry.Square;
import geometry.Triangle;
public class main {
public static void main(String[] args) {
Shape square = new Square(4);
System.out.println("Square area is: " + square.area());
System.out.println("Square perimeter is: " +
square.perimeter());
Shape triangle = new Triangle(5, 4, 3, 4, 5);
System.out.println("Triangle area is: " + triangle.area());
System.out.println("Triangle perimeter is: " +
triangle.perimeter());
}
}
