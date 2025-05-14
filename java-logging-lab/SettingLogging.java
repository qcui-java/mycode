import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;

public class SettingLogging {
    private static final Logger logger = Logger.getLogger(SettingLogging.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE); // We need to create a new ConsoleHandler to override the default level

        logger.addHandler(handler);

        logger.fine("This is a debug message");
        logger.config("This is a configuration message");
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe error message");
    }
}

