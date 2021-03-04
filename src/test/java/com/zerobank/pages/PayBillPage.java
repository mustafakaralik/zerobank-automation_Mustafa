package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillPage extends  BasePage {
    public  PayBillPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy (xpath = "(//*[.='Pay Bills'])[2]")
    public WebElement PayBillsBtn_AA;

    @FindBy (id = "pay_bills_tab")
    public WebElement PayBillsBtn_AAA;

    @FindBy(id = "sp_amount")
    public WebElement AmountSendKey; //only number

    @FindBy(id = "sp_date")
    public WebElement DateSendKey; // ! Alphabetic --->2021-02-02

    @FindBy(id = "pay_saved_payees")
    public WebElement PayBtn;

    @FindBy (xpath = "//span[.='The payment was successfully submitted.']")
    public WebElement SuccessPaymentText;

    public void paySavedPayee (String amount,String date ){
        AmountSendKey.sendKeys(amount);
        DateSendKey.sendKeys(date);
        PayBtn.click();
    }


}
