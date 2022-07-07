package tests.day21_Rapor_reuasbleMethods_HtmlReports;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C02_ScreenShotReusableMethod {
    @Test
    public void test01() throws IOException {
        // amazon sahifesine intikalden bade fotograf cek eyleyelim

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazon");
        Driver.closeDriver();
    }
}
