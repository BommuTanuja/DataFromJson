package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }

    @FindBy(name ="user-name")
    WebElement usernameInputBox;

    @FindBy(id="password")
    WebElement passwordInputBox;

    @FindBy(name="login-button")
    WebElement  submitButton;

    public void logintheUser(String username,String pwd){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(pwd);
        submitButton.click();
    }

}
