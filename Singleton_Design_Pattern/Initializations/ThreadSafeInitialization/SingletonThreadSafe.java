// Tread Safe Initialization - in there another object is created after creating one object

public class SingletonThreadSafe {

    // Private Static variable
    private static SingletonThreadSafe threadSafeInstance;

    // private constructor
    private SingletonThreadSafe() {}

    //public static method
    public static SingletonThreadSafe getThreadSafeInstance() {
        synchronized(SingletonThreadSafe.class){
            if (threadSafeInstance == null) {
                threadSafeInstance = new SingletonThreadSafe();
            }
        }
        return threadSafeInstance;
    }
}