package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    private WebDriver driver;
    public WelcomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css="span[class='title']")
    WebElement titleofPage;

    @FindBy(css = ".error")
    private WebElement errorMessage;

    public String getTitle(){
        return titleofPage.getText();
    }
    public String getErrorMessage(){
        return errorMessage.getText();
    }

    }
