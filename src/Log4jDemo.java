import org.apache.log4j.Logger;

public class Log4jDemo {
    static Logger logger = Logger.getLogger(Log4jDemo.class.getName());
    public static void main(String[] args) {
        System.out.println("Log4jDemo");
        logger.info("Log4jDemo log");
    }
}
