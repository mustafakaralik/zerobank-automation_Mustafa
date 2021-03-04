package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class LoginPage  extends  BasePage  {

    public LoginPage (){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy (id = "user_password")
    public WebElement userPass;

    @FindBy (id = "user_login")
    public WebElement userLoginName;

    @FindBy (xpath = "//input[@class='btn btn-primary']")
    public WebElement  SecondSigninBtn;

    @FindBy (xpath = "//button[@id='primary-button']")
    public WebElement BackToSafetyButton;

    @FindBy (xpath = "//div[@class='alert alert-error']")
    public WebElement LoginErrorText;







    public void login(String userNameStr,String PassWordStr){
        userLoginName.sendKeys(userNameStr);
        userPass.sendKeys(PassWordStr);
        SecondSigninBtn.click();

    }
    public void loginInvalid(String userNameStr,String PassWordStr) {

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        userLoginName.sendKeys(userNameStr + randomInt);

        Random randomGenerator2 = new Random();
        int randomInt2 = randomGenerator2.nextInt(1000);
        userPass.sendKeys(PassWordStr + randomInt2);
        SecondSigninBtn.click();




    }



}
