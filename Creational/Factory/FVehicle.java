package  Factory;

abstract public class FVehicle {
    public abstract int getWheel();
    public String toString(){
        return "Wheel: " + this.getWheel();
    }
}