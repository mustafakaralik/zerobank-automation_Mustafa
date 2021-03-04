package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AANavigationPage extends BasePage{

    public AANavigationPage(){

        PageFactory.initElements(Driver.get(),this); }

        @FindBy (xpath = "//a[.='Brokerage']")
            public WebElement BrokerageLink_AS;

        @FindBy (xpath = "//a[.='Account Activity']")
            public WebElement AccountActivityLink_AS;

         @FindBy (id = "aa_accountId")
            public WebElement AccountDropDown_AA;

         @FindBy (id = "account_summary_link")
            public WebElement AccountSumLink;

        @FindBy (xpath = "(//*[.='Savings'])[1]")
            public WebElement CashSavingLink;

        @FindBy (xpath = "//*[.='Checking']")
            public WebElement CheckingLink_AA;

        @FindBy (xpath = "(//*[.='Credit Card'])[2]")
            public WebElement CreditCartLink_AA;

        @FindBy (xpath = "//*[.='Loan']")
            public WebElement LoanLink_AA;


}
