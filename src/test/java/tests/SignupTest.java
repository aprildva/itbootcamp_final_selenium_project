package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest extends BasicTest {

    @Test(priority = 1)
    public void  TC_1visitsTheSignupPage() throws InterruptedException {

        navPage.getsingUpButton().click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"),"Not on sign up page");

    }

    @Test(priority = 2)
    public void  TC_2checksInputTypes(){

        navPage.getsingUpButton().click();
        Assert.assertTrue(singupPage.inputEmail().getAttribute("type").contains("email"),
                "Input type is not email");
        Assert.assertTrue(singupPage.inputPassword().getAttribute("type").contains("password"),
                "Input type is not password");
        Assert.assertTrue(singupPage.inputConfirmPassword().getAttribute("type").contains("password"),
                "Input type is not password");

    }

    @Test(priority = 3)
    public void  TC_3DisplaysErrorsWhenUserAlreadyExists() throws InterruptedException {

        String name= "Another User";
        String email= "admin@admin.com";
        String password= "12345";
        String confirmPassword= "12345";

        navPage.getsingUpButton().click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"));
        singupPage.inputName().sendKeys(name);
        singupPage.inputEmail().sendKeys(email);
        singupPage.inputPassword().sendKeys(password);
        singupPage.inputConfirmPassword().sendKeys(confirmPassword);
        singupPage.getSignUpButton().click();
        Assert.assertTrue(messagePopUpPage.popUp().getText().contains("E-mail already exists"),
                "Error message does not contain E-mail already exists");
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"),"Not on sign up page");

    }

    @Test(priority = 4)
    public void  TC_4Signup() throws InterruptedException {

        String name= "Ivana Radivojevic";
        String email= "ivana.rad@itbootcamp.rs";
        String password= "12345";
        String confirmPassword= "12345";


        navPage.getsingUpButton().click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"));
        singupPage.inputName().sendKeys(name);
        singupPage.inputEmail().sendKeys(email);
        singupPage.inputPassword().sendKeys(password);
        singupPage.inputConfirmPassword().sendKeys(confirmPassword);
        singupPage.getSignUpButton().click();
        wait.until(ExpectedConditions.urlContains("/home"));
        Assert.assertEquals(messagePopUpPage.getVerifyTittle(),"IMPORTANT: Verify your account",
                "Message dose not contain IMPORTANT: Verify your account");
        messagePopUpPage.getButtonClose().click();
        navPage.getLogoutButton().click();

    }
}
