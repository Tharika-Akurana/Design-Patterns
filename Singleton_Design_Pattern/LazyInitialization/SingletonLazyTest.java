public class SingletonLazyTest {
    public static void main(String[] args) {
        SingletonLazy lazyInstance1 = SingletonLazy.getLazyInstance(); // In there initilize the lazyInstance
        SingletonLazy lazyInstance2 = SingletonLazy.getLazyInstance(); // In there return the previous made lazyInstance

        // Check if the lazyInstance1 and lazyInstance2 are the same instances
        if (lazyInstance1 == lazyInstance2) {
            System.out.println ("lazyrInstance1 and lazyInstance2 are the same instances");
        } else {
            System.out.println ("lazyInstance1 and lazyInstance2 are different instances");
        }

    }
}