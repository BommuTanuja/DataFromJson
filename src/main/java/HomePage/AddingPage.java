package HomePage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class AddingPage {
    private WebDriver driver;
    JavascriptExecutor jse;
    WebDriverWait webDriverWait;

    public AddingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }

    @FindBy(xpath = "//span[@class='pdp-final-price']/span")
    WebElement price;

    @FindBy(xpath = "//span[text()='add to cart']/parent::div")
    WebElement cartButton;

    @FindBy(xpath = "//span[text()='Cart']")
    WebElement checkingCartButton;

    @FindBy(css = ".item-price")
    WebElement shoppingCart;

    public void switchingToWindow() {

        Set<String> WindowIds = driver.getWindowHandles();

        for (String window : WindowIds) {
            driver.switchTo().window(window);
        }
    }
    public String GetPriceValue() {
            String value = price.getText();
            return  value;
    }
    public void addingCart() {
            Actions actions = new Actions(driver);
            actions.moveToElement(cartButton).click().build().perform();
    }

    public void checkTheCart(){
        checkingCartButton.click();

    }

    public String getCartPrice(){
      //  WebDriverWait webDriverWait1 = new WebDriverWait(Duration.ofSeconds(20));
        String cartPrice  = shoppingCart.getText();
        return cartPrice;

    }




}

