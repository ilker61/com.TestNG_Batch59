package tests.tradylinnYedek;

public class ProjeResimYukleme {
    /*
    @Test(priority = 4)
    public void TC04() throws InterruptedException, AWTException {
        // User clicks photo icon
           trd.photo.click();
        // User clicks "Dosya Seçin" button
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)");
        trd.uploadFile.click();
        Thread.sleep(2000);
        Robot rb = new Robot();
        StringSelection str = new StringSelection("\"C:\\Users\\himer\\OneDrive\\Masaüstü\\hasortman.jpg\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        // User selects product photo and click open button

        // User waits for uploading file
        Thread.sleep(5000);
        // User clicks "ADD TO GALLERY" button
        trd.sec.click();
    }
Herkese merhaba arkadaslar, öncelikle siteye erişim ve bazı sorunları handle ederken yardımcı olan arkadaşlara teşekkür ediyorum.
US05'te bulunan testCase'imizin, upload file, kısmında otomasyonla yükleme sıkıntısı yaşayan arkadaşlar için attığım kodu;
trd.photo.click(); olan satırda, tradylinn page sayfanızın objesini ve locate ettiğiniz photo webelementini kendinize göre degistirdikten sonra aşağıdaki kodu;

        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)");
        trd.uploadFile.click();
        Thread.sleep(2000);
        Robot rb = new Robot();
olduğu gibi yapıştırdiktan sonra;
StringSelection str = new StringSelection("\"C:\\Users\\himer\\OneDrive\\Masaüstü\\hasortman.jpg\"");
Burada stringselection referansli str objemizin parametresine yükleyeceğiniz urun fotoğrafınn dosya yolunu yapıştıracaksiniz. Ardından;

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

Yukarıdaki kodu yapıştırarak windows'a gecis yapıp yükleme işini handle edebilirsiniz, kolaylıklar diliyorum iyi günler

     */
}
