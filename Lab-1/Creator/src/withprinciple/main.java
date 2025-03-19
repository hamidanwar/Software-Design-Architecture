package withprinciple;

import java.util.logging.Logger;

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

class Truck implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Truck is being manufactured.");
    }
}

class Bus implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Bus is being manufactured.");
    }
}

// Step 3: Define an Enum for vehicle types
enum VehicleType {
    CAR, BIKE, TRUCK, BUS
}

// Step 4: Create a Factory class (Creator) that follows the Creator Principle
class VehicleFactory {
    private static final Logger logger = Logger.getLogger(VehicleFactory.class.getName());
    
    public static Vehicle createVehicle(VehicleType type) {
        logger.info("Creating vehicle of type: " + type);
        switch (type) {
            case CAR:
                return new Car();
            case BIKE:
                return new Bike();
            case TRUCK:
                return new Truck();
            case BUS:
                return new Bus();
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}

