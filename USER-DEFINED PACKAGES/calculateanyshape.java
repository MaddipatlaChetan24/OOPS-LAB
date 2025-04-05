package shapes;
public class calculateanyshape {
private double radius;
private double length;
private double width;
public calculateanyshape(double radius) {
this.radius = radius;
}
public calculateanyshape(double length, double width) {
this.length = length;
this.width = width;
}
public double circlearea() {
return 3.14 * radius * radius;
}
public double circleperimeter() {
return 2 * 3.14 * radius;
}
public double rectanglearea() {
return length * width;
}
public double rectangleperimeter() {
return 2 * (length + width);
}
}
