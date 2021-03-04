package com.zerobank.step_definitions;

import com.zerobank.pages.AddNewPayeePage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class AddNewPayeeStepDefs {

    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {
        new AddNewPayeePage().PayBillsLink_OB.click();
        new AddNewPayeePage().AddNewPayee_PB.click();
    }



    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String> ANPDataTable) {
        //System.out.println(ANPDataTable);
        BrowserUtils.waitFor(2);

        new AddNewPayeePage().AddNewPayeeTable(ANPDataTable.get("Payee Name"),ANPDataTable.get("Payee Address"),ANPDataTable.get("Account"),ANPDataTable.get("Payee details"));


    }


    @Then("message The new payee The Law Office of Hyde, Price & Scharks was successfully created. should be  displayed")
    public void messageTheNewPayeeTheLawOfficeOfHydePriceScharksWasSuccessfullyCreatedShouldBeDisplayed() {

        String actualText = new AddNewPayeePage().AlertContentText_PB.getText();
        Assert.assertEquals("The new payee The Law Offices of Hyde, Price & Scharks was successfully created.",actualText);
    }
}
