import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jDemo {
    public static void main(String[] args) {
        System.out.println("Slf4jDemo");
        Logger logger = LoggerFactory.getLogger(Slf4jDemo.class.getName());
        logger.info("Slf4jDemo.class");
    }
}
