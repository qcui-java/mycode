import java.util.logging.Logger;

public class BuiltinLogging {
    private static final Logger logger = Logger.getLogger(BuiltinLogging.class.getName());

    public static void main(String[] args) {
        logger.fine("This is an info message");
        logger.config("This is a configuration message");
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe error message");
    }
}

