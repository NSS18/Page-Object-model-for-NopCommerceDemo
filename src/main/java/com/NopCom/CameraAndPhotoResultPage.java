package com.NopCom;

import org.openqa.selenium.By;

//to verify comparison
public class CameraAndPhotoResultPage extends Utils {
    //Locator for message
    private By _compareProductSuccessMessage=By.xpath("//div[@class=\"page-title\"]/h1");
    String expected="Compare products";
    //Verify user can see compare product message
    public void verifyUserSeeCompareProductSuccessMessage()
    {
        assertURL("compareproducts");
        assertTextMessage("Product Comparison not successful",expected,_compareProductSuccessMessage);
    }


}
