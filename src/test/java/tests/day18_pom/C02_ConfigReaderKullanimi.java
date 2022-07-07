package tests.day18_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {
    @Test
    public void test1() {

        FacebookPage facebookPage=new FacebookPage();

        // facebook ana sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        // cikarsa cookies kabul edin
        facebookPage.cookiesKabul.click();
        // kullanici mail kutusuna yanlis kullanici adi yaz
        facebookPage.mailBox.sendKeys(ConfigReader.getProperty("fbWrongPasword"));
        // kullanici sifre kutuduna yanlis pastword yaz
        facebookPage.pasword.sendKeys(ConfigReader.getProperty("fbWrongPasword"));
        // logon butonuna bas
        facebookPage.loginButton.click();
        // giris yapilamadigini test ed
        Assert.assertTrue(facebookPage.girilemediYaziElement.isDisplayed());
        //sayfayi gapatin
        Driver.closeDriver();

    }
}
