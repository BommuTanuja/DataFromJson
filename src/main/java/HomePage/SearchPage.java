package HomePage;

import BasePage.WebPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private WebDriver driver;

    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this .driver =driver;
    }

    @FindBy(name="keyword")
    WebElement InputBox;

    @FindBy(xpath="//span[@class='searchTextSpan']/parent::button")
    WebElement searchButton;
    @FindBy(xpath = "//p[contains(text(),'Lace-Up Shoes- Navy')]")
    WebElement product;

    public void searchForShoe() throws InterruptedException {
        InputBox.sendKeys("Shoes");
        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.moveToElement(searchButton).click().build().perform();
        product.click();


    }
}
