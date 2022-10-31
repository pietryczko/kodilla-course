package patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLog() {
        logger = Logger.LOG;
        logger.log("Test log");
    }

    @Test
    void testLog() {
        String lastLog = logger.getLastLog();
        assertEquals("Test log", lastLog);
    }
}
