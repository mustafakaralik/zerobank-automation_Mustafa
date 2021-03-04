package com.zerobank.step_definitions;

import com.zerobank.pages.AANavigationPage;
import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AANavigationStepDefs {

    //**********first scenario
    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        new AANavigationPage().AccountSumLink.click();
        BrowserUtils.waitFor(3);
        new AANavigationPage().CashSavingLink.click();

    }

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {

        new AANavigationPage().AccountSumLink.click();
        BrowserUtils.waitFor(3);
        new AANavigationPage().BrokerageLink_AS.click();

    }


    @Then("Account	drop down should have Brokerage	selected")
    public void account_drop_down_should_have_Brokerage_selected() {
        String ExpectedOption ="Brokerage";
        System.out.println("ExpectedOption = " + ExpectedOption);
        String ActualOption =new AccountActivityPage().DropDownFirstSelected();
        System.out.println("ActualOption = " + ActualOption);
        Assert.assertEquals(ActualOption,ExpectedOption,"Brokerage");

    }



    @When("the user clicks on Checking link on the Account Summary page")
    public void theUserClicksOnCheckingLinkOnTheAccountSummaryPage() {
        new AANavigationPage().AccountSumLink.click();
        new AANavigationPage().CheckingLink_AA.click();

    }


    @And("Account drop down should have Checking selected")
    public void accountDropDownShouldHaveCheckingSelected() {
        String ExpectedOption ="Checking";
        System.out.println("ExpectedOption = " + ExpectedOption);
        String ActualOption =new AccountActivityPage().DropDownFirstSelected();
        System.out.println("ActualOption = " + ActualOption);
        Assert.assertEquals(ActualOption,ExpectedOption,"Checking");

    }

    @And("Account drop down should have Credit Card selected")
    public void accountDropDownShouldHaveCreditCardSelected() {
        String ExpectedOption ="Credit Card";
        System.out.println("ExpectedOption = " + ExpectedOption);
        String ActualOption =new AccountActivityPage().DropDownFirstSelected();
        System.out.println("ActualOption = " + ActualOption);
        Assert.assertEquals(ActualOption,ExpectedOption,"Credit Card");
    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void theUserClicksOnCreditCardLinkOnTheAccountSummaryPage() {
        new AANavigationPage().AccountSumLink.click();
        new AANavigationPage().CreditCartLink_AA.click();

    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void theUserClicksOnLoanLinkOnTheAccountSummaryPage() {
        new AANavigationPage().AccountSumLink.click();
        new AANavigationPage().LoanLink_AA.click();
    }

    @And("Account drop down should have Loan selected")
    public void accountDropDownShouldHaveLoanSelected() {
        String ExpectedOption ="Loan";
        System.out.println("ExpectedOption = " + ExpectedOption);
        String ActualOption =new AccountActivityPage().DropDownFirstSelected();
        System.out.println("ActualOption = " + ActualOption);
        Assert.assertEquals(ActualOption,ExpectedOption,"Loan");
    }
}
