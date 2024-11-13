public class SingletonEager {

    // Eager Initialization - because of that initially create the object
    // private static object
    private static final SingletonEager eagerInstance = new SingletonEager();

    // private constructor to avoid client applications to use constructor
    private SingletonEager() {}
    
    // public static method to provide global access to singleton
    public static SingletonEager getEagerInstance() {
        return eagerInstance;
    }
}