package com.NopCom;

import org.openqa.selenium.By;

//to fill sending email details
public class ProductEmailAFriendDetails extends Utils {
    //locator for friend's email address
    private By _friendemailaddress=By.xpath("//input[@id=\"FriendEmail\"]");
    //locator for personal messege
    private By _personalMessage=By.xpath("//textarea[@id=\"PersonalMessage\"]");
    //locator for send email
    private By _sendEmail=By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");
    //locator for your email address
    private By _yourEmail=By.xpath("//input[@class=\"your-email\"]");


    //for referring product to friend-----Register user
    public void registerUserEnterFriendDetails()
    {
      //To enter friend's email address
      enterText(_friendemailaddress,"amar1678@gmail.com");
      //To enter personal message
      enterText(_personalMessage,"Please see this product");
      //To click on send email
      clickOnElement(_sendEmail);
    }

    //To enter friend's email address---Non register user
    public void nonRegisterUserEnterFriendDetails()
    {
        //To enter friend's email address
        enterText(_friendemailaddress,"amar1678@gmail.com");
        //To enter your email address
        enterText(_yourEmail,"try123@yahoo.com");
        //To enter personal message
        enterText(_personalMessage,"Please see this product");
        //To click on send email
        clickOnElement(_sendEmail);
    }
}
