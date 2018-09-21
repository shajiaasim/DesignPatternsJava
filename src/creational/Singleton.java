package creational;

public class Singleton {

    private static Singleton singletonInstance =null;

    private Singleton(){
    }

    public static Singleton getStaticInstance(){
        if (singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
