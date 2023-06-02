// Client Code

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        // Start watching a movie
        homeTheater.watchMovie("The Avengers");
        System.out.println("\n\n");
        // End the movie session
        homeTheater.endMovie();
    }
}
