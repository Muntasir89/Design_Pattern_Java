package  Factory;

public class FVehicleFactory {
    public static FVehicle getInstance(String type, int wheel){
        if(type == "car")
            return new Car(wheel);
        else if(type == "bike")
            return new Bike(wheel);

        return null;
    }
}
