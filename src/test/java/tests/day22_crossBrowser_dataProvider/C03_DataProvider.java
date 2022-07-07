package tests.day22_crossBrowser_dataProvider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {

    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();

        // amazon anasayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // nutella icin arama yapalim
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // sonuclarin nutella icerdigini test edah
        String expectedKelime="Nutella";
        String actualKelime=amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualKelime.contains(expectedKelime));
        
        Driver.closeDriver();

    }

    @DataProvider
    public static Object[][] AranacakKelimeler() {
       Object[][] arananKelimeArray={{"Nutella"} , {"Java"}, {"cigdem"}, {"Netherlands"}};
        return arananKelimeArray;
    }


    @Test (dataProvider = "AranacakKelimeler")
    // Arayacagimiz kelimeleri bir liste gibi tutup
    // bana yollayacak bir veri saglayici olusturacagiz

    public void dataProviderTesti(String arananKelime) {
        AmazonPage amazonPage=new AmazonPage();

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // Nutella , Java, cigdem, Netherlands icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);

        // sonuclarin aradigimiz kelimeleri icerdigini test edelim
        String expectedKelime="arananKelime";
        String actualKelime=amazonPage.aramaSonucElementi.getText();
       //Assert.assertTrue(actualKelime.contains(expectedKelime));
        // sayfayi kapatalim

        Driver.closeDriver();

    }
}
