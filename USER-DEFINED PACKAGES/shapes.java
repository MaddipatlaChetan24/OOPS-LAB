package geometry;
abstract class Shape {
abstract double area();
abstract double perimeter();
}
class Square extends Shape {
private double side;
public Square(double side) {
this.side = side;
}
double area() {
return side * side;
}
double perimeter() {
return 4 * side;
}
}
class Triangle extends Shape {
private double base;
private double height;
private double side1;
private double side2;
private double side3;
public Triangle(double base, double height, double side1,
double side2, double side3) {
this.base = base;
this.height = height;
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}
double area() {
return 0.5 * base * height;
}
double perimeter() {
return side1 + side2 + side3;
}
}
