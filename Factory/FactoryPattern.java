
interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    
    @Override
    public void drive() {
        System.out.println("driving car!!!");
    }
}

class Truck implements Vehicle {

    @Override
    public void drive() {
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

public class FactoryPattern {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.drive();

        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.drive();
    }
}


