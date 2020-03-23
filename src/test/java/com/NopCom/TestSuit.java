package com.NopCom;


import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    //To create object of home page
    HomePage homePage=new HomePage();
    //To Create object of registration page
    RegistrationPage registrationPage = new RegistrationPage();
    //To Create object of registration result page
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    //To Create object of electronics page
    ElectronicsPage electronicsPage = new ElectronicsPage();
    //To Create object of camera and photo page
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    //To Create object of camera and photo result page
    CameraAndPhotoResultPage cameraAndPhotoResultPage = new CameraAndPhotoResultPage();
    //To Create object of login page
    LoginPage loginPage = new LoginPage();
    //To Create object of product email a friend
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
    //To Create object of product email a friend details
    ProductEmailAFriendDetails productEmailAFriendDetails = new ProductEmailAFriendDetails();
    //To Create object of user success email result--register user
    RegisterUserSuccessEmailResult productEmailResult = new RegisterUserSuccessEmailResult();
    //To Create object of user  email result--non register user
    NonRagisterUseremailResult nonRagisterUseremailResult = new NonRagisterUseremailResult();
    //To create object of book page
    BookPage bookPage=new BookPage();
    //To create object of cart page
    CartPage cartPage=new CartPage();
    //To create object of checkout as guest
    CheckoutAsGuest checkoutAsGuest=new CheckoutAsGuest();
    //To create object of fill checkout details
    FillCheckoutDetails fillCheckoutDetails=new FillCheckoutDetails();
    //To create object of checkout result
    CheckoutResult checkoutResult=new CheckoutResult();
    //To create object of news page
    NewsPage newsPage=new NewsPage();
    //To create object of new online store open page
    NewOnlineStoreIsOpenPage newOnlineStoreIsOpenPage=new NewOnlineStoreIsOpenPage();




    //1---->To verify that user should able to  register successfully on demo nop commerce website and able to see successful registration message.......................................
    @Test(priority = 8)
    public void userShouldAbleToRegisterSuccessfully()  {
        homePage.verifyUserIsOnHomePage();
        //Click on register button
        homePage.clickRegisterButton();
        //To fill Registration details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
        //Verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        registrationResultPage.userLogoutSuccessfully();

    }

    //----------------------End of testcase 1----------------

    //2---->To verify that user should able to compare two products successfully....................................................................................................
    @Test(priority = 7)
    public void userShouldBeAbleToCompareTwoDifferentProductsSuccessfully()  {
        homePage.verifyUserIsOnHomePage();
        //Click on electronics
        homePage.clickOnElectronics();
        //Verify user is  on electronics page

        electronicsPage.verifyUserIsOnElectronicsPage();
        //Click on camera and photo
        electronicsPage.userClicksOnCameraAndPhoto();
        //verify user is on camera and photo page
        cameraAndPhotoPage.verifyUserIsOnCameraAndPhotoPage();
        //Click on compare button for item 1
        cameraAndPhotoPage.clickOnCompareButtonForProduct1();
        //Click on compare button for item 2
        cameraAndPhotoPage.clickOnCompareButtonForProduct2();
        //Click on green product comparison link
        cameraAndPhotoPage.productComparision();
        //Verify compare product success message
        cameraAndPhotoResultPage.verifyUserSeeCompareProductSuccessMessage();

    }

//-----------------------End of testcase 2-------------



    //3---->To verify that when  Registered user should be able to refer a product to a friend..............................
    @Test(priority = 9)
    public void registerUserShouldBeAbleToReferProductToTheFriend()  {
        homePage.verifyUserIsOnHomePage();
        //Click on login link
        homePage.clickOnLogin();
        //To verify user is on login page
        //loginPage.verifyOnLoginPage();
        //Enter login details
        loginPage.loginDetails();
        //Click on electronics
        homePage.clickOnElectronics();
        //To verify we are on electronics page
        //electronicsPage.verifyUserIsOnElectronicsPage();
        //Click on camera & photo
        electronicsPage.userClicksOnCameraAndPhoto();
        //To select product
        cameraAndPhotoPage.selectProduct();
        //To click on email a friend
        productEmailAFriend.emailAFriend();
        //To fill the details
        productEmailAFriendDetails.registerUserEnterFriendDetails();
        //To check User should able to see message-"Your message has been sent.".
        productEmailResult.verifyRegisterUserSeeEmailSuccessMessage();


    }

    //------------------End of testcase 3------------------



    //4---->To verify that non registered user should not be able to refer a product to a friend..............................
    @Test(priority = 6)
    public void nonRegisterUserShouldNotBeAbleToReferAProductToFriend() {
        homePage.verifyUserIsOnHomePage();
        //Click on electronics
        homePage.clickOnElectronics();
        //To verify user is on electronics page
        //electronicsPage.verifyUserIsOnElectronicsPage();
        //To click camera and photo
        electronicsPage.userClicksOnCameraAndPhoto();
        //To select product
        cameraAndPhotoPage.selectProduct();
        //To click email a friend
        productEmailAFriend.emailAFriend();
        //To fill details
        productEmailAFriendDetails.nonRegisterUserEnterFriendDetails();
        //To verify User should able to see error message -"Only registered customers can use email a friend feature"
        nonRagisterUseremailResult.verifyNonRegisterUserSeeErrorMessage();
        homePage.goBackToHomepage();

    }

    //---------------End of testcase 4----------------------------


    //5---->To verify user should be able to sort product high to low by price................................................
    @Test(priority = 1)
    public void userShouldBeAbleToSortProductHighToLowByPrice()
    {
        homePage.verifyUserIsOnHomePage();
        //To click on books
        homePage.clickBooks();
        //To select short by filter for price high to low
        bookPage.selectHighToLowFromShortByFilter();
        //To print price high to low
        bookPage.verifyPriceHighToLowSorting();
        homePage.goBackToHomepage();

    }

//--------------End of testcase 5-----------------------------



    //6---->Guest user should be able to checkout successfully
     @Test(priority = 4)
    public void verifyGuestUserShouldAbleToCheckoutSuccessfully()
    {
        homePage.verifyUserIsOnHomePage();
        //Click on book link
        homePage.clickOnBooksLink();
        //Click on add to cart
        bookPage.clickOnAddToCart();
        //Click on shopping cart
        bookPage.clickOnShoppingCart();
        //To accept on terms and condition
        cartPage.checkTermsAndCondition();
        //Click on checkout
        cartPage.clickOnCheckout();
        //Click on checkout as guest
        checkoutAsGuest.clickOnCheckoutAsGuest();
        //To fill checkout details
        fillCheckoutDetails.fillCheckoutDetails();
        //To verify success message
        checkoutResult.verifyCheckoutSuccessMessage();
        homePage.goBackToHomepage();

    }



    //-------------------------End of Test case 6------------------------------

    //7----->Guest user should able to add new comment on nope commerce website

     @Test(priority = 3)
    public void userShouldAbleToAddNewCommentOnNopCommerceWebsite()
    {
        //To click on view news archive
        homePage.ClickOnViewNewsArchive();
        //To click on details
        newsPage.clickOnDetails();
        //To add new comment
        newOnlineStoreIsOpenPage.addNewComment();
        //To verify New comment added
        newOnlineStoreIsOpenPage.verifySuccessMessageOfComment();
        homePage.goBackToHomepage();

    }

//----------------------------------End of TestCase 7-------------------------------------




    //8----->User should able to change currancy
    @Test (priority = 2)
    public void userShouldAbleToChangeCurrency()
    {
        homePage.verifyUserIsOnHomePage();
        //To click on currency euro
        homePage.clickCurrencyEuro();
        //To verify Euro sign
        homePage.VerifyPriceHasEuroSign();
        //To click on currency dollar
        homePage.clickCurrencyDollar();
        //To verify Dollar sign
        homePage.VerifyPriceHasDollarSign();
        homePage.goBackToHomepage();

    }

//---------------------------------------------End of Testcase 8------------------------------------


//9---->Verify add to cart button is present on all featured product

     @Test(priority = 5)
    public void verifyAddToCartButtonIsPresentOnAllFeaturedProducts()
    {

        homePage.verifyUserIsOnHomePage();
        //To verify add to cart is present in all featured products
        homePage.verifyAddToCartPresentOnHomepageFeaturedItems();
        homePage.goBackToHomepage();

    }


//-----------------------End of TestCAse 9---------------------------------------

}


