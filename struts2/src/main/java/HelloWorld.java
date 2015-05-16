import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by lgt on 2015/5/16.
 */
public class HelloWorld {
    private static final Logger logger = LogManager.getLogger("HelloWorld");
    public static void  main(String[] args)
    {
        logger.info("HelloWorld");
    }
}
