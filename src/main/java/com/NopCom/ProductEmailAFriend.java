package com.NopCom;

import org.openqa.selenium.By;

public class ProductEmailAFriend extends Utils {
    //locater for email a friend
    private By _emailAFriend=By.xpath("//*[@class=\"email-a-friend\"]");
    //to send email to the friend
    public void emailAFriend()
    {
        scrollAndClick(_emailAFriend);
    }




}

