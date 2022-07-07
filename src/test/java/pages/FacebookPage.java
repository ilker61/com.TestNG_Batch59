package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@title='Erforderliche und optionale Cookies erlauben']")
    public WebElement cookiesKabul;

    @FindBy (xpath = "//input[@aria-label='E-Mail-Adresse oder Telefonnummer']")
    public WebElement mailBox;

    @FindBy (xpath = "//input[@placeholder='Passwort']")
    public WebElement pasword;

    @FindBy (xpath = "//button[@data-testid='royal_login_button']")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"email_container\"]/div[2]")
    public WebElement girilemediYaziElement;

}
