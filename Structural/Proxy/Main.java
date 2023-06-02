// Step 1: Create an interface for the real object and define its methods
interface Image {
    void display();
}

// Step 2: Create a concrete implementation of the real object
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // Simulating the time-consuming task of loading an image from disk
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename);
    }

    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

// Step 3: Create a proxy class that implements the same interface as the real object
class ImageProxy implements Image {
    private String filename;
    private RealImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

// Step 4: Demonstrate the usage of the proxy
public class Main {
    public static void main(String[] args) {
        // Create a proxy object
        Image image = new ImageProxy("image.jpg");

        // The real object is loaded only when the display() method is called
        image.display();

        // The real object is not loaded again as it has already been loaded
        image.display();
    }
}