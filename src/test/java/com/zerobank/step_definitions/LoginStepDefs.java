package com.zerobank.step_definitions;

import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

        @Then("the user is on the login page")
    public void the_user_is_on_the_login_page() {
            String username = ConfigurationReader.get("valid_username");
            String password = ConfigurationReader.get("valid_password");
            LoginPage loginPage =new LoginPage();
            loginPage.login(username,password);
            loginPage.BackToSafetyButton.click();
    }

        @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        new HomePage().OnlineBankingButton.click();

    }

        @Then("Account summary page should be	displayed")
    public void account_summary_page_should_be_displayed() {
        new OnlineBankingPage().AccountSumButton.click();
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Summary",actualTitle);
        if (actualTitle.contains("Account Summary")){
            System.out.println("Account Summary page title is displayed");
        }
        System.out.println("Page title = " + Driver.get().getTitle());
        //new LoginPage().AccountSumLink.click();
        //new LoginPage().CashSavingLink.click();

    }

        @When("the user should not be able to login with invalid credentials")
    public void the_user_should_not_be_able_to_login_with_invalid_credentials() {
        String username = ConfigurationReader.get("valid_username");
        String password = ConfigurationReader.get("valid_password");
           new LoginPage().loginInvalid(username,password);
        BrowserUtils.waitFor(2);

    }

        @And("the user should not be able to login with blank username and password")
    public void the_user_should_not_be_able_to_login_with_blank_username_and_password() {

        String EmptyName ="";
        String EmptyPass ="";
        new LoginPage().userLoginName.sendKeys(EmptyName);
        new LoginPage().userPass.sendKeys(EmptyPass);

                new LoginPage().SecondSigninBtn.click();
            }
        @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

              new LoginPage().SecondSigninBtn.click();
                System.out.println("LoginErrorText =" + new LoginPage().LoginErrorText.getText());
            }

 }






