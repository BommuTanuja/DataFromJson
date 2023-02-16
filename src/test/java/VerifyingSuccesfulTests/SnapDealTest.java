package VerifyingSuccesfulTests;

import BasePage.WebPage;
import HomePage.AddingPage;
import HomePage.SearchPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SnapDealTest extends WebPage {
    public SearchPage searchPage;
    public AddingPage addingPage;

    @BeforeClass
    public void InitializeUrl(){
        searchPage = new SearchPage(driver);
        addingPage = new AddingPage(driver);

    }

    @Test
    public void verifyingThePage() throws InterruptedException {
        searchPage.searchForShoe();
        addingPage.switchingToWindow();
        String priceInCart = addingPage.GetPriceValue();
        System.out.println(priceInCart);
        addingPage.addingCart();
        addingPage.checkTheCart();
        String cartValue = addingPage.getCartPrice();
        System.out.println(cartValue);
        Assert.assertTrue(priceInCart.contains(cartValue));












    }

}
