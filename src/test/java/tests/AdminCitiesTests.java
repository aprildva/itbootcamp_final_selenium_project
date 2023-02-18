package tests;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdminCitiesTests extends BasicTest {

    @Test(priority = 1)
    public void  TC_1VisitsTheAdminCitiesPageAndListCities() throws InterruptedException {

        String email= "admin@admin.com";
        String password = "12345";

        navPage.getLoginButton().click();
        loginPage.inputEmail().sendKeys(email);
        loginPage.inputPassword().sendKeys(password);
        loginPage.getbuttonLogin().click();
        navPage.linkAdmin().click();
        navPage.linkCities().click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/admin/cities"),"Not on admin cities page");

    }

    @Test(priority = 2)
    public void  TC_2ChecksInputTypesForCreateEditNewCity() throws InterruptedException {

        navPage.linkAdmin().click();
        navPage.linkCities().click();
        citiesPage.getNewItemButton().click();
        citiesPage.waitdialogNewEditItem();
       Assert.assertTrue(citiesPage.inputCity().getAttribute("type").contains("text"),
               "Input type is not text ");

    }

    @Test(priority = 3)
    public void  TC_3creatNewCity() throws InterruptedException {

        String city="Iva's city";

        navPage.linkAdmin().click();
        navPage.linkCities().click();
        citiesPage.getNewItemButton().click();
        citiesPage.waitdialogNewEditItem();
        citiesPage.inputCity().sendKeys(city);
        citiesPage.getSaveButton().click();
        messagePopUpPage.waitPopUpCity();
        Thread.sleep(2000);
        Assert.assertTrue(messagePopUpPage.getpopUpCity().getText().contains("Saved successfully"),
                "Save message does not contain Saved successfully");

    }

    @Test(priority = 4)
    public void  TC_4editCity() throws InterruptedException {

        String oldCityName="Iva's city";
        String newCityName= "Iva's city Edited";

        navPage.linkAdmin().click();
        navPage.linkCities().click();
        citiesPage.inputSearch().sendKeys(oldCityName);
        Thread.sleep(2000);
        citiesPage.rowNumber(1);
        citiesPage.getEditButtonRow(1).click();
        citiesPage.inputCity().sendKeys(Keys.CONTROL + "a");
        citiesPage.inputCity().sendKeys(Keys.BACK_SPACE);
        citiesPage.inputCity().sendKeys(newCityName);
        citiesPage.getSaveButton().click();
        messagePopUpPage.waitPopUpCity();
        Thread.sleep(2000);
        Assert.assertTrue(messagePopUpPage.getpopUpCity().getText().contains("Saved successfully"),
                "Save message does not contain Saved successfully");

    }

    @Test(priority = 5)
    public void  TC_5searchCity() throws InterruptedException {

        String cityName= "Iva's city Edited";

        navPage.linkAdmin().click();
        navPage.linkCities().click();
        citiesPage.inputSearch().sendKeys(cityName);
        citiesPage.rowNumber(1);
        Thread.sleep(2000);
        Assert.assertEquals(citiesPage.getCell(1,2).getText(),"Iva's city Edited",
                "Name in row 1 is not expected");


    }

    @Test(priority = 6)
    public void  TC_6deleteCity() throws InterruptedException {

        String cityName= "Iva's city Edited";

        navPage.linkAdmin().click();
        navPage.linkCities().click();
        citiesPage.inputSearch().sendKeys(cityName);
        citiesPage.rowNumber(1);
        Thread.sleep(2000);
        Assert.assertEquals(citiesPage.getCell(1,2).getText(),"Iva's city Edited");
        citiesPage.getDeleteButtonRow(1).click();
        messagePopUpPage.waitPopUpCityDelete();
        citiesPage.getDeleteButton().click();
        messagePopUpPage.waitPopUpCity();
        Assert.assertTrue(messagePopUpPage.getpopUpCity().getText().contains("Deleted successfully"),
                "Delete message does not contain Delete saccessfully");

    }

}
