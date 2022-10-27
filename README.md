# Design-Pattern
This project contains some design pattern which will be useful for android developers as it has advantages such as reusability, mutability, transparency.
### Creational Design Pattern
Creational design patterns are concerned with the way of creating objects. These design patterns are used when a decision must be made at the time of instantiation of a class.
## Singleton Design Pattern
This pattern is used for allowing users to use only one instance of a class.
Single Design Pattern has two instantiation i) Early instantiation ii) Lazy instantiation

###  Early instantiation
The Singleton class creates an object initialy by using new keyword. Whether the user calls the getInstance() method or not Singleton class creates an object in the memory.
```java
    static Singleton instance = new Singleton();
    private Singleton(){};
    public static Singleton getInstance()
    {
        return instance;
    }
```
### Lazy instantiation
In this instantiation, the Singleton classes object is only created when user need it by checking whether it is NULL or not.
```java
    static Singleton instance;
    private Singleton(){};
    public static Singleton getInstance()
    {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
```
##  Builder Design Pattern
Why used--  </br>
&emsp;1) It is used when we have too many arguments to send in constructor & it's hard to maintain the order
</br>&emsp;2) When we don't want to send all parameters in object initialization (Generally we send optional parameters as NULL)
</br>It has a static nested class which contains all arguments of outer class and named using nameing convention 'ClassnameBuilder'. This class has a build method that will return the final Object.

## Factory Design Pattern
Why used-- </br>
&emsp; 1) Used when we have multiple sub-classes of a Super class & based on input we want to return one class instance
```java
    public static FVehicle getInstance(String type, int wheel){
        if(type == "car")
            return new Car(wheel);
        else if(type == "bike")
            return new Bike(wheel);

        return null;
    }
```
&emsp; 2) It provides abstraction between implementation & user classes</br>Super class can be interface or abstract class or basic class.
```java
    abstract public class FVehicle {
    public abstract int getWheel();

    public String toString(){
        return "Wheel: " + this.getWheel();
    }
}
```
