package tests.tradylinnYedek;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US_05_06_07_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US05_TC05 {
    /*
    @Test
    public void UC05_TC05() throws InterruptedException, AWTException {
        // Kullanici vendor olarak hesabina gider
        us_05_06_07_page=new US_05_06_07_Page();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        us_05_06_07_page.girisButonu.click();
        us_05_06_07_page.userName.sendKeys(ConfigReader.getProperty("validVendorEmail"));
        ReusableMethods.waitFor(5);
        us_05_06_07_page.pasword.sendKeys(ConfigReader.getProperty("validVendorPassword"));
        ReusableMethods.waitFor(5);
        us_05_06_07_page.girisYapButonu.click();
        ReusableMethods.waitFor(5);
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
        ReusableMethods.waitFor(2);
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
        ReusableMethods.waitFor(6);
        Robot rb = new Robot();
        StringSelection str1 = new StringSelection("\"C:\\Users\\jakyu\\Desktop\\baglama (3).png\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        ReusableMethods.waitFor(5);
        us_05_06_07_page.secPhoto.click();

        // Kullanici Galeri Images icin kücük resim bosluguna tiklar
        us_05_06_07_page.galeriImages.click();
        ReusableMethods.waitFor(5);
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
        ReusableMethods.waitFor(5);
        //Kullanici bir resim dosyasini secer ve ADD TO GALLERY butonunu tiklar
        us_05_06_07_page.sazFoto.click();
        us_05_06_07_page.addToGalery.click();
        ReusableMethods.waitFor(5);
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
        ReusableMethods.waitFor(3);
        actions.click(us_05_06_07_page.categories).sendKeys(Keys.PAGE_DOWN).perform();
        us_05_06_07_page.musikClickBox.click();
        ReusableMethods.waitFor(3);
        us_05_06_07_page.brandEnstrumanClick.click();
        ReusableMethods.waitFor(3);
        // us_05_06_07_page.gecisPunkt.click();
        js.executeScript("arguments[0].scrollIntoView(true);",us_05_06_07_page.gecisPunkt);
        js.executeScript("arguments[0].click();", us_05_06_07_page.gecisPunkt);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        js.executeScript("arguments[0].scrollIntoView(true);",us_05_06_07_page.submitButton);
        js.executeScript("arguments[0].click();", us_05_06_07_page.submitButton);
        Driver.closeDriver();
    } */
}
