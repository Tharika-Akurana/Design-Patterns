// Main class to demonstrate the Singleton pattern
public class Main {

    public static void main(String[] args) {
        // Get the only instance of Logger
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Get the same instance of Logger (singleton behavior)
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        }
    }
}