package com.NopCom;

import org.openqa.selenium.By;

public class NonRagisterUseremailResult extends Utils {
    //Locator for email sending error message
    private By _emailErrorMessage=By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li");
    //Expected message
    String expected="Only registered customers can use email a friend feature";
    //To verify email unsuccessful message
    public void verifyNonRegisterUserSeeErrorMessage()
    {

       // assertURL("productemailafriend");
        assertTextMessage("Non register user can't send email to friend",expected,_emailErrorMessage);
    }

}
