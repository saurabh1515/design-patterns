
interface Vehicle {
    void drive();
}

class Car implements Vehicle {

    @Override
    void drive() {
        System.out.println("driving car!!!");
    }

}

class Truck implements Vehicle {

    @Override
    void drive() {
        System.out.println("driving truck!!!");
    }
}

class VehicleFactory {

    public static Vehicle getVehicle (String type) {

        if( type.equals("car"))
            return new  Car();
        else if( type.equals("truck"))
            return new Truck();

        return null;
    }
}

// driver code
Vehicle vehicle = VehicleFactory.getVehicle("car");
vehicle.drive();

