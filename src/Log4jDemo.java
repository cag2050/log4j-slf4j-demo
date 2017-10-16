import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4jDemo {
    static Logger logger = Logger.getLogger(Log4jDemo.class.getName());
    public static void main(String[] args) {
        System.out.println("Log4jDemo");
//        程序设置日志级别
//        logger.setLevel(Level.WARN);
        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");
    }
}
