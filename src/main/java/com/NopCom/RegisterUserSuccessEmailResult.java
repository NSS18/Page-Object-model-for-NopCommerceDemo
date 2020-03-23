package com.NopCom;

import org.openqa.selenium.By;

public class RegisterUserSuccessEmailResult extends Utils {
    //locator for email success message
    private By _emailSuccessMessage=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]");
    String expected="Your message has been sent.";
    //Method to verify email success messege
    public void verifyRegisterUserSeeEmailSuccessMessage()
    {

        assertURL("productemailafriend");
        assertTextMessage("Email sending not successful",expected,_emailSuccessMessage);
    }


}
