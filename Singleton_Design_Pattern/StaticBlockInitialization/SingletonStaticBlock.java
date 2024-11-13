public class SingletonStaticBlock {
    
    // Static Block Initialization

    //private static variable
    private static final SingletonStaticBlock staticBlockInstance;

    // Static Block is used to initialize static data members.
    // It us executed before main method at the time of class loading.
    // It executed only once
    static {
        staticBlockInstance = new SingletonStaticBlock();
    }

    // private constructor
    private SingletonStaticBlock() {};

    //public static method
    public static SingletonStaticBlock getStaticBlockInstance(){
        return staticBlockInstance;
    }

    // this is differ from lazy initialization because here the class is created before tha main method is loading
    // in lazy initialization instance is created when it it requested

    // however this is thread safe because the instance is created during the class loading
    // class loading is inherently synchronized in java
    // so no need to worry about thread safety
}