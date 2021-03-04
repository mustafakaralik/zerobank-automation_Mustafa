package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

    public class AccountSummaryPage  extends  BasePage  {
        public AccountSummaryPage(){
        PageFactory.initElements(Driver.get(),this); }


            @FindBy (xpath = "//*[@class='board-header']")
            public List<WebElement> FourAccounts;

            @FindBy(xpath = "(//table[@class='table'])[3]/thead/tr/th")
            public List<WebElement> CreditAccountTable ;



}
