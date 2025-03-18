interface Vehicle {
    void move();
}

class Car implements Vehicle {

    public void move() {
        System.out.println("The car drives on the road.");
    }
}

class Airplane implements Vehicle {

    public void move() {
        System.out.println("The airplane flies in the sky.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle airplane = new Airplane();

        car.move();
        airplane.move();
    }
}

