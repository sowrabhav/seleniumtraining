package junittests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class saucelabstests {
    static Logger log = LoggerFactory.getLogger(saucelabstests.class);

    @BeforeEach
    public void setup() {
        log.info("Setting up test");
    }

    @Test
    public void test1() {
        log.info("Test 1");
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        log.info("Test 2");
        System.out.println("Test 2");
    }

    @Test
    public void test3() {
        log.info("Test 3");
        System.out.println("Test 3");
    }

    @AfterEach
    public void teardown() {
        log.info("Tearing down test");
    }
}
