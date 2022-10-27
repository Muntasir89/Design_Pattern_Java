package Factory;

class Bike extends FVehicle{
    int wheel;
    Bike(int wheel){
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}
