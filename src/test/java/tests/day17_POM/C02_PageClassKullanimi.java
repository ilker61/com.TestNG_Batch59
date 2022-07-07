package tests.day17_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {

    @Test (groups = {"grup1", "grup2"})
    public void test1(){

        AmazonPage amazonPage=new AmazonPage();

        // Amazona git
        Driver.getDriver().get("https://www.amazon.com");

        //nutella arat
        amazonPage.aramaKutusu.sendKeys("nutella" + Keys.ENTER);

        //sonuc yazisinin nutella icerdigini test et
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String arananKelime="nutella";

        Assert.assertTrue(actualSonuc.contains(arananKelime));

        Driver.closeDriver();
    }

}
