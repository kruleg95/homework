package lesson12.reflection.singletonRefelction;

public class Singleton {
    private static Singleton singletonInstance;

    private String name;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    public static Singleton getSingletonInstance() {
        return singletonInstance;
    }

    public static void setSingletonInstance(Singleton singletonInstance) {
        Singleton.singletonInstance = singletonInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
