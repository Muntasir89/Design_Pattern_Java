package  Factory;

public class Client {
    public static void main(String[] args) {
        FVehicle car = FVehicleFactory.getInstance("car", 4);
        System.out.println(car);

        FVehicle bike = FVehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }
}
