package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTest {

    BrcPage brcPage;

    @Test
    public void test1() {

        brcPage=new BrcPage();

        // https://www.bluerentalcars.com/ adresinde git
        Driver.getDriver().get(ConfigReader.getProperty("brcURL"));
        // login butonun abasin
        brcPage.ilkloginButton.click();
        // test data user email: customer@bluerentalcars.com
        brcPage.mailBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        // test data password: 12345
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        // login butonuna dihlayin
        brcPage.ikinciLoginButton.click();
        // Degerleri girildiignde sayfaya basarili
        // sekilde girilebildigini test et

        String actualUserName=brcPage.kullaniciProfilIsmi.getText();
        String expectedUserName=ConfigReader.getProperty("brcValidUserName");
        Assert.assertEquals(actualUserName,expectedUserName);

        Driver.closeDriver();


    }
}
