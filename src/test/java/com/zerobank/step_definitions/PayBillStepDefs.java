package com.zerobank.step_definitions;

import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.pages.PayBillPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import java.util.Map;


public class PayBillStepDefs {

    @Then("Page should have {string} as title")
    public void page_should_have_as_title(String expectedTitle) {
        BrowserUtils.waitFor(2);
        new OnlineBankingPage().PayBillslink_OB.click();
        Assert.assertEquals(Driver.get().getTitle(), expectedTitle);

    }
    @When("user is able to complete payment")
    public void user_is_able_to_complete_payment(Map<String,String> PaymentInfo) {
        new PayBillPage().paySavedPayee(PaymentInfo.get("Amount"),PaymentInfo.get("Date"));
        BrowserUtils.waitFor(2
        );

    }
    @Then("After Payment,{string} should be displayed")
    public void after_Payment_should_be_displayed(String expectedPaymentText) {

        String ActualPaymentText = new PayBillPage().SuccessPaymentText.getText();
        Assert.assertEquals(ActualPaymentText, expectedPaymentText);
        System.out.println("expectedPaymentText = " + expectedPaymentText);
        //Assert.assertTrue(new PayBillPage().SuccessPaymentText.isDisplayed()); -->second option
    }

    @When("Payment should not be performed without entering the amount  or date")
    public void payment_should_not_be_performed_without_entering_the_amount_or_date()   {

        new PayBillPage().DateSendKey.sendKeys("2021-01-02");

        String displayAmmountMessage = "Please fill out this field.";
        String message2 = new PayBillPage().AmountSendKey.getAttribute("validationMessage"); //--> "validationMessage" nedir;?
        System.out.println("message2 = " + message2);
        Assert.assertFalse(message2.isEmpty());
        //**********************************************************************

        new PayBillPage().DateSendKey.clear();
        new PayBillPage().AmountSendKey.sendKeys("125");

        String displayDateMessage = "Please fill out this field.";
        String message = new PayBillPage().DateSendKey.getAttribute("validationMessage");
        Assert.assertEquals(displayDateMessage,message);

        new PayBillPage().PayBtn.click();

        //WE CAN RUN SEPAERATED USİNG MAP
//        @When("user tries to make a payment without entering the date")
//        public void user_tries_to_make_a_payment_without_entering_the_date(Map<String,String> inputs) {
//            new PayBillsPage().sendAmountInput(inputs.get("Amount"));
//        }

    }


    @Then("Please	fill out this field message! should be displayed")
    public void please_fill_out_this_field_message_should_be_displayed() {
        String displayDateMessage = "Please fill out this field.";
        String message = new PayBillPage().DateSendKey.getAttribute("validationMessage");
        System.out.println("message = " + message);
        Assert.assertEquals(displayDateMessage,message);
    }

    @And("Alphabetical or special characters should not be accepted in Amount field")
    public void alphabeticalOrSpecialCharactersShouldNotBeAcceptedInAmountField() {
    }


    @Then("Alphabetical characters should not be accepted in Date field")
    public void alphabetical_characters_should_not_be_accepted_in_Date_field() {

    }



}