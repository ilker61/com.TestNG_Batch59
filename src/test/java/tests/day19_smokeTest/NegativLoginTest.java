package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativLoginTest {

    BrcPage brcPage;

    @Test
    public void yanlisSifer() {
        brcPage=new BrcPage();

        // https://www.bluerentalcars.com/ adresinde git
        Driver.getDriver().get(ConfigReader.getProperty("brcURL"));
        // login butonun abasin
        brcPage.ilkloginButton.click();
        // test data user email: customer@bluerentalcars.com
        brcPage.mailBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        // test data password: 54321
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        // login butonuna dihlayin
        brcPage.ikinciLoginButton.click();
        // Degerleri girildiignde sayfaya basarili
        // sekilde giriLEMEdigini test et

        Assert.assertTrue(brcPage.ikinciLoginButton.isDisplayed());

        Driver.closeDriver();

    }
}
