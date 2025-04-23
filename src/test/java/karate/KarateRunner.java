package karate;

import com.intuit.karate.junit5.Karate;

public class KarateRunner {
    /*@Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }*/

    /*@Karate.Test
    Karate testSpecificFeature() {
        return Karate.run("ApiTest").relativeTo(getClass());
    }
*/
    @Karate.Test
    Karate testSpecificFeature() {
        return Karate.run("src/test/java/karate/getcalldemo.feature");
    }

/*    @Karate.Test
    Karate testScenario() {
        return Karate.run("karate");
    }*/
}
