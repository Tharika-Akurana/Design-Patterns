 public class SingletonEagerTest {
    public static void main(String[] args) {
        SingletonEager eagerInstance1 = SingletonEager.getEagerInstance();
        SingletonEager eagerInstance2 = SingletonEager.getEagerInstance();

        // Check if eagerInstance1 and eagerInstance2 are the same instance
        if (eagerInstance1 == eagerInstance2) {
            System.out.println ("eagerInstance1 and eagerInstance2 are the same instances");
        } else {
            System.out.println ("eagerInstance1 and eagerInstance2 are different instances");
        }
        
        // beacause of the using 'static' keyword we can access the class without an object

    }
 }