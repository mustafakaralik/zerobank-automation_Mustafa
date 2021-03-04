package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewPayeePage extends BasePage {

    public AddNewPayeePage (){
        PageFactory.initElements(Driver.get(),this);
    }

   @FindBy (id = "pay_bills_link")
    public WebElement PayBillsLink_OB;


    @FindBy (xpath = "(//*[.='Add New Payee'])[2]")
    public WebElement AddNewPayee_PB;


    @FindBy (id = "np_new_payee_name")
    public WebElement PayeeNameSendKey_PB;

    @FindBy (id = "np_new_payee_address")
    public WebElement PayeeAddressSendKey_PB;

    @FindBy (id = "np_new_payee_account")
    public WebElement AccountSendKey_PB;

    @FindBy (id = "np_new_payee_details")
    public WebElement DetailsSendKey_PB;

    @FindBy (id = "add_new_payee")
    public WebElement AddPayeeTableBtn_PB;

    @FindBy (id = "alert_content")
    public WebElement AlertContentText_PB;


    public void AddNewPayeeTable (String payeeName, String PayeeAddress, String Account, String PayeeDetails  ) {
        PayeeNameSendKey_PB.sendKeys(payeeName);
        PayeeAddressSendKey_PB.sendKeys(PayeeAddress);
        System.out.println(Account);
        AccountSendKey_PB.sendKeys(Account);
        DetailsSendKey_PB.sendKeys(PayeeDetails);
        AddPayeeTableBtn_PB.click();


    }



}
