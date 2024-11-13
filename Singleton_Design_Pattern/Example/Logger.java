// Logger class implementing the Singleton pattern
public class Logger {

    // Step 1: Private static instance of the Logger class
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation from outside the class
    private Logger() {
        // Initialization code for Logger (e.g., file setup, etc.)
    }

    // Step 3: Public method to provide access to the single instance
    public static Logger getInstance() {
        // Lazy initialization: the instance is created only when needed
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to log messages
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}


