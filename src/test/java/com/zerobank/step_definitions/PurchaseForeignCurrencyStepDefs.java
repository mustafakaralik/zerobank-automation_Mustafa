package com.zerobank.step_definitions;

import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.pages.PurchaseForeignCurrencyPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import java.util.List;

public class PurchaseForeignCurrencyStepDefs {

    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {

        new OnlineBankingPage().PayBillslink_OB.click();
        BrowserUtils.waitFor(2);
    new PurchaseForeignCurrencyPage().PurchaseForeignCash_Btn.click();

    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> Forreigncurrencies) {

       BrowserUtils.waitFor(1);
       new PurchaseForeignCurrencyPage().ForCurrDrDownElements().containsAll(Forreigncurrencies);



    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        BrowserUtils.waitFor(2);
        new PurchaseForeignCurrencyPage().AmountSendKeyBox.sendKeys("100");
        BrowserUtils.waitFor(2);
        new PurchaseForeignCurrencyPage().CalculateCostBtn.click();
        Alert alert = Driver.get().switchTo().alert();
        System.out.println("alert = " + alert.getText());
      
        System.out.println("LoginErrorText =" + new PurchaseForeignCurrencyPage()..getText());
    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {

    }
}
