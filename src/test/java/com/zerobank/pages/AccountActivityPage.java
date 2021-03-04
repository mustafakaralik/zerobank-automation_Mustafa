package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class AccountActivityPage  extends  BasePage {
    public AccountActivityPage(){

        PageFactory.initElements(Driver.get(),this); }


    @FindBy (id = "account_activity_link")
    public WebElement accountActivityBtn_OB;

    @FindBy(xpath = "//a[.='Account Activity']")
    public WebElement accountActivityBtn_AA;

    @FindBy (xpath = "//select[@id='aa_accountId']")
    public WebElement  accountDropDown;

    @FindBy(xpath = "//option[@value]")
    public List<WebElement> accountDropDownList;

    @FindBy(xpath = "//div[@id='all_transactions_for_account']/table/thead/tr/th")
    public List<WebElement> TransactionTableColumn;

    public  String DropDownFirstSelected (){
        BrowserUtils.waitFor(2);
             Select StateDropdown = new Select(accountDropDown);
        return StateDropdown.getFirstSelectedOption().getText();


    }




    }

