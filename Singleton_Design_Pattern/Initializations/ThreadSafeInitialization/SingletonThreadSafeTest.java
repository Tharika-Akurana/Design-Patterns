public class SingletonThreadSafeTest {
    public static void main(String[] args) {
        SingletonThreadSafe threadSafeInstance1 = SingletonThreadSafe.getThreadSafeInstance(); // In there initilize the lazyInstance
        SingletonThreadSafe threadSafeInstance2 = SingletonThreadSafe.getThreadSafeInstance(); // In there return the previous made lazyInstance

        // Check if the lazyInstance1 and lazyInstance2 are the same instances
        if (threadSafeInstance1 == threadSafeInstance2) {
            System.out.println ("threadSafeInstance1 and threadSafeInstance2 are the same instances");
        } else {
            System.out.println ("threadSafeInstance1 and threadSafeInstance2 are different instances");
        }

    }
}