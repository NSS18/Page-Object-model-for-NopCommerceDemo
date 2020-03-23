package com.NopCom;

import org.openqa.selenium.By;

//on the book page
public class BookPage extends Utils {
    //locator to click add to cart
    private By _clickOnAddToCart=By.xpath("//div[@data-productid=\"38\"]/div[2]/div[3]/div[2]/input[1]");
    //Locator to click on shopping cart
    private By _clickOnShoppingCart=By.xpath("//div[@class=\"bar-notification success\"]/p/a");


    //locator to select price high to low
    private By _selectFilterPriceHighToLow = By.xpath("//*[@id=\"products-orderby\"]");
    //locator for before sorting price1,price2 and price3
    private By _beforeSortingPrice1 = By.xpath("//div[@data-productid=\"37\"]/ div[2]/div[3]/div/span[2] ");
    private By _beforeSortingPrice2 = By.xpath("//div[@data-productid=\"38\"]/ div[2]/div[3]/div/span[2] ");
    private By _beforeSortingPrice3 = By.xpath("//div[@data-productid=\"39\"]/ div[2]/div[3]/div/span[2] ");
    //locator for after sorting price1,price2,price3
    private By _afterSortingPrice1 = By.xpath("//div[@data-productid=\"38\"]/ div[2]/div[3]/div/span[2] ");
    private By _afterSortingPrice2 = By.xpath("//div[@data-productid=\"37\"]/ div[2]/div[3]/div/span[2] ");
    private By _afterSortingPrice3 = By.xpath("//div[@data-productid=\"39\"]/ div[2]/div[3]/div/span[2] ");




    //To select high to low from filter
    public void selectHighToLowFromShortByFilter() {

        selectFromDropdownByText(_selectFilterPriceHighToLow, "Price: High to Low");
    }

    //To verify sorted price is high to low
    public void verifyPriceHighToLowSorting() {
        int i;
        //To get price before sorting
        String beforeSortingPrice1=getTextFromElement(_beforeSortingPrice1);
        String beforeSortingPrice2=getTextFromElement(_beforeSortingPrice2);
        String beforeSortingPrice3=getTextFromElement(_beforeSortingPrice3);
        //To store before price in array
        String[] priceBeforSortingArray={beforeSortingPrice1,beforeSortingPrice2,beforeSortingPrice3};
        //to print before price
        System.out.println("Price before sorting is:");
        for(i=0;i<3;i++)
            System.out.println(priceBeforSortingArray[i]);

        //To get actual price after sorting
        String actualPrice1 = getTextFromElement(_afterSortingPrice1);
        String actualPrice2 = getTextFromElement(_afterSortingPrice2);
        String actualPrice3 = getTextFromElement(_afterSortingPrice3);
        //To store after sorting price in array
        String [] priceAfterSortingArray={actualPrice1,actualPrice2,actualPrice3};
        //To print prices after sort
        System.out.println("Price after sorting is:");
        for (i = 0; i < 3; i++)
            System.out.println(priceAfterSortingArray[i]);
        //accepted price array
        String[] accepted = {"$51.00", "$27.00", "$24.00"};
        //actual price array
        String[] actual = {actualPrice1, actualPrice2, actualPrice3};
        //To verify price high to low
        compareArray(accepted, actual);

    }




    //click on add to cart
    public void clickOnAddToCart()
    {
        scrollAndClick(_clickOnAddToCart);
    }

    //click on shopping cart
    public void clickOnShoppingCart()
    {
        timeDelay(2);
        scrollAndClick(_clickOnShoppingCart);
    }
}