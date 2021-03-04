package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AActivityStepDefs {

    @Then("the user is on Account activity page")
    public void the_user_is_on_Account_activity_page() {
       new AccountActivityPage().accountActivityBtn_OB.click();
        BrowserUtils.waitFor(2);

    }

    @Then("Account dropdown should have saving selected")
    public void account_dropdown_should_have_saving_selected() {
        BrowserUtils.waitFor(2);
        String ExpectedOption ="Savings";
        System.out.println("ExpectedOption = " + ExpectedOption);
        String ActualOption =new AccountActivityPage().DropDownFirstSelected();
        System.out.println("ActualOption = " + ActualOption);
        Assert.assertEquals(ActualOption,ExpectedOption,"Savings");

    }

    @Then("Account dropdown  following options")
    public void account_dropdown_following_options(List<String> accountDropDown ) {
        System.out.println(accountDropDown.size());
        System.out.println(accountDropDown);
        BrowserUtils.waitFor(1);
        List<String> actualOptions = BrowserUtils.getElementsText(new AccountActivityPage().accountDropDownList);
        Assert.assertEquals(accountDropDown,actualOptions);
        System.out.println("menuOptions = " + accountDropDown);
        System.out.println("actualOptions = " + actualOptions);
    }

    @Then("Transaction table column names")
    public void transaction_table_column_names(List<String> transactionTableColumnNames) {
        List<String> TransactionsTable = BrowserUtils.getElementsText(new AccountActivityPage().TransactionTableColumn);
        Assert.assertEquals(transactionTableColumnNames,TransactionsTable);
        System.out.println("transactionTableColumnNames = " + transactionTableColumnNames);
    }

    @Then("Account Activity page should have {string} as title")
    public void account_Activity_page_should_have_as_title(String expectedTitle) {
        BrowserUtils.waitFor(2);
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals (Driver.get().getTitle(),expectedTitle);
    }



}
