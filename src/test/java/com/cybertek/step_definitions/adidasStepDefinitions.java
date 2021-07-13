package com.cybertek.step_definitions;

import com.cybertek.pages.AdidasUtils;
import com.cybertek.utilitis.BrowserUtils;
import com.cybertek.utilitis.ConfigurationReader;
import com.cybertek.utilitis.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class adidasStepDefinitions {
    AdidasUtils adidasUtils = new AdidasUtils();
    Faker faker = new Faker();


    @Given("user i son home page")
    public void user_i_son_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user clicks on laptops")
    public void user_clicks_on_laptops() {
        BrowserUtils.sleep(1);
        adidasUtils.LaptopSection.click();
    }
    @When("selects Sony vaio i5")
    public void selects_sony_vaio_i5() {
        BrowserUtils.sleep(1);
        adidasUtils.laptopModel.click();
    }
    @Then("user should be able to add it to the card")
    public void user_should_be_able_to_add_it_to_the_card() {
        BrowserUtils.sleep(1);
        adidasUtils.addToCard.click();
        BrowserUtils.sleep(1);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        BrowserUtils.sleep(1);
        adidasUtils.homePageButton.click();
    }

        @When("selects Dell i7 8gb")
        public void selects_dell_i7_8gb() {
        BrowserUtils.sleep(1);
            adidasUtils.laptopModel2.click();
        }




    @Given("user is on card page")
    public void userIsOnCardPage() {
        BrowserUtils.sleep(1);
        adidasUtils.cart.click();
    }


    @When("user click on Delete item")
    public void userClickOnDeleteItem() {
        BrowserUtils.sleep(1);
        adidasUtils.getLaptopModel2Delete.click();

    }

    @Then("user should be able to delete that item")
    public void userShouldBeAbleToDeleteThatItem() {

    }

    @Given("User puts his info")
    public void userPutsHisInfo() {
        BrowserUtils.sleep(1);
        adidasUtils.placeOrder.click();
        BrowserUtils.sleep(1);
        adidasUtils.name.sendKeys(faker.name().fullName());
        adidasUtils.country.sendKeys(faker.country().name());
        adidasUtils.city.sendKeys(faker.country().capital());
        adidasUtils.card.sendKeys(faker.finance().creditCard());
        adidasUtils.month.sendKeys(String.valueOf(faker.number().numberBetween(1,12)));
        adidasUtils.year.sendKeys(String.valueOf(faker.number().numberBetween(2021,2023)));
    }

    @When("Clicks purchase he should see sale id")
    public void clicksPurchaseHeShouldSeeSaleId() {
        adidasUtils.purchase.click();
    }
}
