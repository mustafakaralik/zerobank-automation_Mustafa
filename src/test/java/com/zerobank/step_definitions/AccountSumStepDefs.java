package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSumStepDefs {


    @Then("the user should see following Account types")
    public void the_user_should_see_following_Account_types(List<String> accountTypes) {
        System.out.println(accountTypes.size());
        System.out.println(accountTypes);
        List<String> actualAccount = BrowserUtils.getElementsText(new AccountSummaryPage().FourAccounts);
        Assert.assertEquals(accountTypes,actualAccount);
        System.out.println("AccountTypes = " + accountTypes);

    }
    @Then("Credit Accounts table must have following column names")
    public void credit_Accounts_table_must_have_following_column_names(List<String> creditTable) {
        List<String> actualCreditTable = BrowserUtils.getElementsText(new AccountSummaryPage().CreditAccountTable);
        Assert.assertEquals(creditTable,actualCreditTable);
        System.out.println("creditTable = " + creditTable);
    }


}
