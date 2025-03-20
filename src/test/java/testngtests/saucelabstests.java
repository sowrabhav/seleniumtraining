package testngtests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class saucelabstests {

    @BeforeClass
    public void setup() {
        System.out.println("Setting up the tests");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
    }

    @AfterClass
    public void teardown() {
        System.out.println("Tearing down the tests");
    }

}
