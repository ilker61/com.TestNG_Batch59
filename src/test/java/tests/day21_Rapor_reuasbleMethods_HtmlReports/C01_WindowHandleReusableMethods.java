package tests.day21_Rapor_reuasbleMethods_HtmlReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Iterator;
import java.util.Set;

public class C01_WindowHandleReusableMethods {
    public C01_WindowHandleReusableMethods() {
    }
    @Test
    public void test01() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWH = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowHanleSeti = Driver.getDriver().getWindowHandles();
        String ikinciSayfaWH = "";
        Iterator var4 = windowHanleSeti.iterator();
        String each;
        while(var4.hasNext()) {
            each = (String)var4.next();
            if (!each.equals(ilkSayfaWH)) {
                ikinciSayfaWH = each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWH);
        System.out.println(Driver.getDriver().getTitle());
        String expectedTitle = "New Window";
        each = Driver.getDriver().getTitle();
        Assert.assertEquals(each, expectedTitle);
    }
    @Test
    public void test02() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods.switchToWindow("New Window2");
        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.closeDriver();

    }
}
