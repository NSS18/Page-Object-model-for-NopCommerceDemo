package com.NopCom;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils {
    //locator for camera & photo image
    private By _cameraAndPhoto=By.xpath("//a/img[@alt=\"Picture for category Camera & photo\"]");

    //To verify user is on electronics page
    public void verifyUserIsOnElectronicsPage()
    {
        timeDelay(2);
        assertURL("electronics");
    }

    //To click on camera and photo
    public void userClicksOnCameraAndPhoto()
    {
        timeDelay(2);
        clickOnElement(_cameraAndPhoto);
    }

}
