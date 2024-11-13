public class SingletonLazy {

    // Lazy Initialization 

    // private static variable
    private static SingletonLazy lazyInstance;

    // private constructor
    private SingletonLazy() {}

    // public static method (In there object is created only when calling the method)
    public static SingletonLazy getLazyInstance () {
        if (lazyInstance == null){
            lazyInstance = new SingletonLazy();
        }
        return lazyInstance;
    }
}