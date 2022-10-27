public class User{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.getMessage();
    }
}