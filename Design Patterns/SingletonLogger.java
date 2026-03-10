class Logger {

    private static Logger logger = null;

    // Private constructor
    private Logger() {
        System.out.println("Logger object created");
    }

    // Public method to access instance
    public static Logger getInstanceLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log() {
        System.out.println("Logger started");
    }
}

public class SingletonLogger {
    public static void main(String[] args) {

        Logger l1 = Logger.getInstanceLogger();
        l1.log();

        Logger l2 = Logger.getInstanceLogger();

        System.out.println(l1 == l2); // true (same object)
    }
}