public class SingletonStaticBlockTest {
    public static void main(String[] args) {
        SingletonStaticBlock staticBlockInstanc1 = SingletonStaticBlock.getStaticBlockInstance(); // In there initilize the lazyInstance
        SingletonStaticBlock staticBlockInstanc2 = SingletonStaticBlock.getStaticBlockInstance(); // In there return the previous made lazyInstance

        // Check if the lazyInstance1 and lazyInstance2 are the same instances
        if (staticBlockInstanc1 == staticBlockInstanc2) {
            System.out.println ("staticBlockInstanc1 and staticBlockInstanc2 are the same instances");
        } else {
            System.out.println ("staticBlockInstanc1 and staticBlockInstanc2 are different instances");
        }

    }
}