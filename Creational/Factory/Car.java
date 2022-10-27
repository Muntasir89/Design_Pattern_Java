package Factory;

class Car extends FVehicle{
    int wheel;
    Car(int wheel){
        this.wheel = wheel;
    }
    @Override
    public int getWheel() {
        return this.wheel;
    }
}
