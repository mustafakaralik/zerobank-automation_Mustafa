package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import javax.xml.xpath.XPath;
import java.util.List;

public class PurchaseForeignCurrencyPage extends BasePage {

    public  PurchaseForeignCurrencyPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy (xpath ="//*[text()='Purchase Foreign Currency']")
    public WebElement PurchaseForeignCash_Btn;

    @FindBy (xpath ="//select[@id='pc_currency']/option[@value]")
    public List<WebElement> ForeignCurrenciesTypes;

    @FindBy (id ="pc_currency")
    public WebElement ForeignCurrenciesDropDown;

    @FindBy (id ="pc_amount")
    public WebElement AmountSendKeyBox;

    @FindBy (id ="pc_calculate_costs")
    public WebElement CalculateCostBtn;

    @FindBy (id ="purchase_cash")
    public WebElement PurchaseBtn;

    @FindBy (id ="pc_conversion_amount")
    public WebElement ConversionAmountText;

    @FindBy (id ="//div[@class='alert alert-success hide']")
    public WebElement ConversionAmountText2;






    public List<String> ForCurrDrDownElements(){
        Select ForCurDropdown = new Select(ForeignCurrenciesDropDown);
        List<WebElement> ForCurrency = ForCurDropdown.getOptions();
        List<String> elementText=BrowserUtils.getElementsText(ForCurrency);
        //System.out.println(elementText);
        return elementText;

    }





}
