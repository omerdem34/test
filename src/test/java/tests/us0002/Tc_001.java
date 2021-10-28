package tests.us0002;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Tc_001   {

    @Test
    public void test () {
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        Driver.closeDriver();
    }
}
