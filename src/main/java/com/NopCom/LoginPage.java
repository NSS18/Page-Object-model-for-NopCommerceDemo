package com.NopCom;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    //locator for email
    private By _email=By.xpath("//*[@id=\"Email\"]");
    //locator for password
    private By _password=By.xpath("//*[@id=\"Password\"]");
    //locator for login button
    private By _login=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input");

    //Method to verify we  are on login page
    public void verifyOnLoginPage()
    {
        timeDelay(2);
        assertURL("login");
    }

    //To enter login details
    public void loginDetails() {
        LoadProp loadProp=new LoadProp();
        timeDelay(2);
        //To enter email
        String loginEmail= loadProp.getProperty("loginemail");
        enterText(_email,loginEmail);
        waitForClickable(_password,50);
        //To enter password
        String loginPassword=loadProp.getProperty("loginpassword");
        enterText(_password,loginPassword);
        waitForClickable(_login,50);
        //To click on login
        clickOnElement(_login);
    }
}
