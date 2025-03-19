package withoutPrinciple;

// Step 1: Define an interface for Vehicles
interface Vehicle {
    void manufacture();
}

// Step 2: Create concrete classes implementing the interface
class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Car is being manufactured.");
    }
}

class Bike implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Bike is being manufactured.");
    }
}

// Step 3: Directly instantiate objects in the main method (without Factory Pattern)
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.manufacture();
        
        Vehicle myBike = new Bike();
        myBike.manufacture();
    }
}
