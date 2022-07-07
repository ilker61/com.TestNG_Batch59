package tests.day21_Rapor_reuasbleMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_PositiveLoginTestiRaporu extends TestBaseRapor {
    BrcPage brcPage;

    @Test
    public void test1() {

        extentTest=extentReports.createTest("Positif Login", "Gecerli User Name ile giris yapabilmeli");

        brcPage=new BrcPage();

        // https://www.bluerentalcars.com/ adresinde git
        Driver.getDriver().get(ConfigReader.getProperty("brcURL"));
        extentTest.info("Brc anasayfaya gidildi");

        // login butonun abasin
        brcPage.ilkloginButton.click();
        extentTest.info("Login butonuna basildi");

        // test data user email: customer@bluerentalcars.com
        brcPage.mailBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("gecerli email yazildi");

        // test data password: 12345
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("gecerli passwoord girildi");

        // login butonuna dihlayin
        brcPage.ikinciLoginButton.click();
        extentTest.info("ikinci login butonuna basildi");

        // Degerleri girildiignde sayfaya basarili
        // sekilde girilebildigini test et

        String actualUserName=brcPage.kullaniciProfilIsmi.getText();
        String expectedUserName=ConfigReader.getProperty("brcValidUserName");
        Assert.assertEquals(actualUserName,expectedUserName);

        extentTest.pass("kullanici basarili sekilde giris yapti");

        Driver.closeDriver();


    }
}
