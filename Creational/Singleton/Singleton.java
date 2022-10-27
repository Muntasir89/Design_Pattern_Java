public class Singleton {
    static Singleton instance;
    private Singleton(){
        
    };
    public static Singleton getInstance()
    {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
    public void getMessage(){
        System.out.println("Everything is Ok");
    }
}