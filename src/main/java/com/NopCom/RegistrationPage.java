package com.NopCom;

import org.openqa.selenium.By;

//To fill details on register page
public class RegistrationPage extends Utils {
    //locator for first name
    private By _firstName=By.id("FirstName");
    //locator for last name
    private By _lastName=By.id("LastName");
    //locator for email address
    private By _email=By.id("Email");
    //locator for password
    private By _password=By.id("Password");
    //locator for confirm password
    private By _confirmPassword=By.id("ConfirmPassword");
    //locator for register button
    private By _registerButton=By.id("register-button");

    private static String timestamp=timeStamp();

    //to verify user is on register page
    public void verifyUserIsOnRegisterPage()
    {
        assertURL("register");
    }

    //to enter registration details
    public void userEnterRegistrationDetails()  {
        LoadProp loadprop=new LoadProp();

        //To wait until first name is clickable
        waitForClickable(_firstName,30);
        //to give explicit wait
        explicitWait(30);
        //To enter first name
        String firstName=loadprop.getProperty("firstname");
        timeDelay(2);
        enterText(_firstName,firstName);
        //To enter last name
        String lastName=loadprop.getProperty("lastname");
        enterText(_lastName,lastName);
        //To enter email address
        enterText(_email,"shah.nidhi18+"+timestamp+"@gmail.com");
        //To enter password
        String password=loadprop.getProperty("password");
        enterText(_password,password);
        //To enter Confirm password
        String confirmPassword=loadprop.getProperty("confirmpassword");
        enterText(_confirmPassword,confirmPassword);
        //To click on register button
        clickOnElement(_registerButton);
    }

}
