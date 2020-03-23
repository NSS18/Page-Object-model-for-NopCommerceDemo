package com.NopCom;

import org.openqa.selenium.By;

//cart page
public class CartPage extends Utils {
    //locator for terms and condition
    private By _termsAndCondition=By.id("termsofservice");
    //locator for checkout
    private By _clickOnCheckout=By.id("checkout");

    //To click terms and condition checkbox
    public void checkTermsAndCondition()
{   timeDelay(2);
    scrollAndClick(_termsAndCondition);
}

    //To click on checkout
    public void clickOnCheckout()
    {
    timeDelay(2);
    scrollAndClick(_clickOnCheckout);
    }
}