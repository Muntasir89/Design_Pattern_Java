package Builder;

public class User
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BVehicle car = new BVehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
        BVehicle bike = new BVehicle.VehicleBuilder("250cc", 2).build();

         System.out.println(car.getEngine());
        
         System.out.println(car.getWheel());
        
         System.out.println(car.getAirbags());
        
         System.out.println(bike.getEngine());
        
         System.out.println(bike.getWheel());
        
         System.out.println(bike.getAirbags());
    }
}
