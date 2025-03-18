class Vehicle {
    public void startEngine() {
        System.out.println("The vehicle engine is starting...");
    }
}

class Car extends Vehicle {

    public void startEngine() {
        System.out.println("The car engine is starting with a roar!");
    }
}

class Truck extends Vehicle {

    public void startEngine() {
        System.out.println("The truck engine is starting with a heavy rumble!");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myTruck = new Truck();

        
        myCar.startEngine();  
        myTruck.startEngine(); 
    }
}

