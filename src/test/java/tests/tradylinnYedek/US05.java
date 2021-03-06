package tests.tradylinnYedek;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US05 {
/*
    US_05_06_07_Page us_05_06_07_page;

    @Test
    public void TC01() throws InterruptedException {
        //Kullanici vendor olarak hesabina gider
        us_05_06_07_page=new US_05_06_07_Page();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        us_05_06_07_page.girisButonu.click();
        us_05_06_07_page.userName.sendKeys(ConfigReader.getProperty("validVendorEmail"));
        us_05_06_07_page.pasword.sendKeys(ConfigReader.getProperty("validVendorPassword"));
        us_05_06_07_page.girisYapButonu.click();
        Thread.sleep(5000);
        us_05_06_07_page.hesabimButonu.click();

        //Kullanici Store Manager butonuna tiklar
        us_05_06_07_page.storeManagerButonu.click();

        //Kullanici Urunler butonuna tiklar
        us_05_06_07_page.urunButonu.click();

        // Kullanici; status, stock, price ve date stunlarinin görünür oldugu kontrol edilir
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        Assert.assertTrue(us_05_06_07_page.Status.isDisplayed());
        Assert.assertTrue(us_05_06_07_page.Stock.isDisplayed());
        Assert.assertTrue(us_05_06_07_page.Price.isDisplayed());
        Assert.assertTrue(us_05_06_07_page.Date.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void TC02() throws InterruptedException {
        //Kullanici vendor olarak hesabina gider
        us_05_06_07_page=new US_05_06_07_Page();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        us_05_06_07_page.girisButonu.click();
        us_05_06_07_page.userName.sendKeys(ConfigReader.getProperty("validVendorEmail"));
        us_05_06_07_page.pasword.sendKeys(ConfigReader.getProperty("validVendorPassword"));
        us_05_06_07_page.girisYapButonu.click();
        Thread.sleep(5000);
        us_05_06_07_page.hesabimButonu.click();

        //Kullanici Store Manager butonuna tiklar
        us_05_06_07_page.storeManagerButonu.click();

        //Kullanici Urunler butonuna tiklar
        us_05_06_07_page.urunButonu.click();

        //Kullanici Yeni Ekle butonuna tiklar
        us_05_06_07_page.yeniEkleButonu.click();

        // Kullanici Virtual ve Downloadable seceneklerinin oldugunu kontrol eder
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        Assert.assertTrue(us_05_06_07_page.virtualClick.isEnabled());
        Assert.assertTrue(us_05_06_07_page.downloadableClick.isEnabled());
        Driver.closeDriver();
    }
    @Test
    public void TC03() throws InterruptedException {
        //Kullanici vendor olarak hesabina gider
        us_05_06_07_page=new US_05_06_07_Page();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        us_05_06_07_page.girisButonu.click();
        us_05_06_07_page.userName.sendKeys(ConfigReader.getProperty("validVendorEmail"));
        us_05_06_07_page.pasword.sendKeys(ConfigReader.getProperty("validVendorPassword"));
        us_05_06_07_page.girisYapButonu.click();
        Thread.sleep(5000);
        us_05_06_07_page.hesabimButonu.click();

        //Kullanici Store Manager butonuna tiklar
        us_05_06_07_page.storeManagerButonu.click();

        //Kullanici Urunler butonuna tiklar
        us_05_06_07_page.urunButonu.click();

        //Kullanici Yeni Ekle butonuna tiklar
        us_05_06_07_page.yeniEkleButonu.click();

        // Kullanici Product Title, Price ve Sale Price box'lara veri girisi yapar
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.click(us_05_06_07_page.productTitle)
                .sendKeys(ConfigReader.getProperty("productTitle"))
                .sendKeys(Keys.TAB).sendKeys(ConfigReader
                        .getProperty("regularPrice")).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("salePrice")).perform();
        Driver.closeDriver();
    }

*/
/*
@Test
public void UC05_TC05() throws InterruptedException, AWTException {
    // Kullanici vendor olarak hesabina gider
    us_05_06_07_page=new US_05_06_07_Page();
    Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
    us_05_06_07_page.girisButonu.click();
    us_05_06_07_page.userName.sendKeys(ConfigReader.getProperty("validVendorEmail"));
    us_05_06_07_page.pasword.sendKeys(ConfigReader.getProperty("validVendorPassword"));
    us_05_06_07_page.girisYapButonu.click();
    Thread.sleep(5000);
    us_05_06_07_page.hesabimButonu.click();

    //Kullanici Store Manager butonuna tiklar
    us_05_06_07_page.storeManagerButonu.click();

    //Kullanici Urunler butonuna tiklar
    us_05_06_07_page.urunButonu.click();

    //Kullanici Yeni Ekle butonuna tiklar
    us_05_06_07_page.yeniEkleButonu.click();

    // Kullanici Product Title, Price ve Sale Price box'lara veri girisi yapar
    Actions actions=new Actions(Driver.getDriver());
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    Thread.sleep(3000);
    actions.click(us_05_06_07_page.virtualClick).click(us_05_06_07_page.productTitle)
            .sendKeys(ConfigReader.getProperty("productTitle"))
            .sendKeys(Keys.TAB).sendKeys(ConfigReader
                    .getProperty("regularPrice")).sendKeys(Keys.TAB)
            .sendKeys(ConfigReader.getProperty("salePrice")).perform();

    // Kullanici ürün resmi yuklemek icin Large Photo kutusuna tiklar
    us_05_06_07_page.largePhoto.click();
    us_05_06_07_page.dosyaYukle1.click();

    //Kullanici Dosya Secin butonuna tiklar
    JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
    js.executeScript("window.scrollBy(0,200)");
    us_05_06_07_page.uploaderButton1.click();
    Thread.sleep(3000);
    Robot rb = new Robot();
    StringSelection str1 = new StringSelection("\"C:\\Users\\jakyu\\Desktop\\baglama (3).png\"");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(9000);
    us_05_06_07_page.secPhoto.click();

    // Kullanici Galeri Images icin kücük resim bosluguna tiklar
    us_05_06_07_page.galeriImages.click();
    Thread.sleep(3000);
    us_05_06_07_page.ortamKutuphanesiSaz.click();

    //Kullanici Dosya Secin butonuna tiklar
    js.executeScript("window.scrollBy(0,200)");
    //us_05_06_07_page.uploaderButton1.click();
    StringSelection str2 = new StringSelection("\"C:\\Users\\jakyu\\Desktop\\baglama (3).png\"");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str2, null);
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(5000);
    //Kullanici bir resim dosyasini secer ve ADD TO GALLERY butonunu tiklar
    us_05_06_07_page.sazFoto.click();
    us_05_06_07_page.addToGalery.click();
    Thread.sleep(5000);
    //us_05_06_07_page.mediaModalIcanKapat.click();
    //Kullanici Short Description box a ve Description box a metin girer
    us_05_06_07_page.iframe1.click();
    Driver.getDriver().switchTo().frame(us_05_06_07_page.iframe1);
    us_05_06_07_page.iframe1TextBox.sendKeys(ConfigReader.getProperty("shortDescription"));
    Driver.getDriver().switchTo().defaultContent();
    us_05_06_07_page.iframe2.click();
    Driver.getDriver().switchTo().frame(us_05_06_07_page.iframe2);
    us_05_06_07_page.iframe2TextBoox.sendKeys(ConfigReader.getProperty("description"));
    Driver.getDriver().switchTo().defaultContent();
        /*
        Kullanici Categories de bir kategori secer
        Kullanici Product Brands da bir brand secer
        Kullanici Submit butonuna tiklar
         */
    /*
    Thread.sleep(3000);
    actions.click(us_05_06_07_page.categories).sendKeys(Keys.PAGE_DOWN).perform();
    us_05_06_07_page.musikClickBox.click();
    Thread.sleep(2000);
    us_05_06_07_page.brandEnstrumanClick.click();
    us_05_06_07_page.gecisPunkt.click();
    actions.sendKeys(Keys.PAGE_DOWN)
            .click(us_05_06_07_page.choosTags).click(us_05_06_07_page.ahsap)
            .sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).click(us_05_06_07_page.skuBox)
            .sendKeys("saz").click(us_05_06_07_page.manageStock).click(us_05_06_07_page.stockQty).sendKeys("1")
            .click(us_05_06_07_page.soldIndividually).perform();

    js.executeScript("arguments[0].scrollIntoView(true);",us_05_06_07_page.submitButton);
    js.executeScript("arguments[0].click();", us_05_06_07_page.submitButton);
    Driver.closeDriver();
    */

}

