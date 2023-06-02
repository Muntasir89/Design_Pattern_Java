# Design-Pattern
This project contains some design pattern which will be useful for android developers as it has advantages such as reusability, mutability, transparency.
# Creational Design Pattern
**_Creational design patterns are concerned with the way of creating objects. These design patterns are used when a decision must be made at the time of instantiation of a class._**
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
##  Builder
Why used--  </br>
&emsp;1) It is used when we have too many arguments to send in constructor & it's hard to maintain the order
</br>&emsp;2) When we don't want to send all parameters in object initialization (Generally we send optional parameters as NULL)
</br>It has a static nested class which contains all arguments of outer class and named using nameing convention 'ClassnameBuilder'. This class has a build method that will return the final Object.

## Factory
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
# Structural Design Pattern
**_Structural design pattern is a blueprint of how different objects and classes are combined together to form a bigger structure for achieving multiple goals altogether. The patterns in structural designs show how unique pieces of a system can be combined together in an extensible and flexible manner._**
## Bridge
According to the definition of **Gang of Four** - _Decouple an abstraction from its implementation so that the two can vary independently._
![image](https://user-images.githubusercontent.com/78687005/198269742-45fc2927-3efc-4c2f-8df1-5f2b6da75bc4.png)
### Output
![Output](https://user-images.githubusercontent.com/78687005/198846146-3741751d-a0e4-4edf-b757-7188344b5c21.JPG)
## Facade Design Pattern
Simply put, a facade encapsulates a complex subsystem behind a simple interface. It hides much of the complexity and makes the subsystem easy to use.</br>
Besides a much simpler interface, there's one more benefit of using this design pattern. It decouples a client implementation from the complex subsystem.
</br>It has three part-
1) **Complex Subsystem**
2) **Facade**
3) **Client Code**
```java
// Facade
class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade() {
        this.amplifier = new Amplifier();
        this.dvdPlayer = new DvdPlayer();
        this.projector = new Projector();
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amplifier.on();
        amplifier.setVolume(10);

        dvdPlayer.on();
        dvdPlayer.play(movie);

        projector.on();
        projector.setInput(dvdPlayer);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.off();
        projector.off();
    }
}
```
We've hid all the complexity in two methods: ***watchMovie()*** and ***endMovie()***.</br>
Now the client code are:
```java
// Client Code
public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        // Start watching a movie
        homeTheater.watchMovie("The Avengers");
        System.out.println("\n");
        // End the movie session
        homeTheater.endMovie();
    }
}
```
Output:
```
Get ready to watch a movie...
Amplifier turned on
Setting amplifier volume to 10
DVD player turned on
Playing movie: The Avengers
Projector turned on
Setting input to DVD player

Shutting down the home theater...
Amplifier turned off
Movie stopped
DVD player turned off
Projector turned off
```
### Benefits of Facade 
- Simplified Interface
- Decoupling
- Encapsulation
- Improved Maintainability
- Code Reusability
