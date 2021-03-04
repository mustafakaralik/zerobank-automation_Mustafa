package com.zerobank.step_definitions;

import com.zerobank.pages.HomePage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;


public class homeStepDefs {

    @Given("the user is on home page")
    public void the_user_is_on_home_page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new HomePage().firstSigninBtn.click();

    }

}
