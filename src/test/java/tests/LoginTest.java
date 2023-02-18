package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BasicTest {


 @Test(priority = 1)
 public void  TC_1visitsTheLoginPage() {

  navPage.getLanguageButton().click();
  navPage.getLanguageENButton().click();
  navPage.getLoginButton().click();
  Assert.assertTrue(driver.getCurrentUrl().contains("/login"),"Not on login page");

 }

 @Test(priority = 2)
 public void TC_2checksInputTypes() {

  navPage.getLoginButton().click();
  Assert.assertTrue(loginPage.inputEmail().getAttribute("type").contains("email"),"Input type is not  email");
  Assert.assertTrue(loginPage.inputPassword().getAttribute("type").contains("password"),"Input type is not password");

 }

 @Test(priority = 3)
 public void TC_3displaysErrorsWhenUserDoesNotExist() {

  String email ="non-existing-user@gmal.com";
  String password ="password123";

  navPage.getLoginButton().click();
  loginPage.inputEmail().sendKeys(email);
  loginPage.inputPassword().sendKeys(password);
  loginPage.getbuttonLogin().click();
  messagePopUpPage.waitPopUp();
  Assert.assertEquals(messagePopUpPage.popUp().getText(),"User does not exists",
          "Error message does not contain User does not exist");
  Assert.assertTrue(driver.getCurrentUrl().contains("/login"),"Not on login page");

 }

 @Test(priority = 4)
 public void TC_4displaysErrorsWhenPasswordIsWrong() {

  String email ="admin@admin.com";
  String password ="password123";

  navPage.getLoginButton().click();
  loginPage.inputEmail().sendKeys(email);
  loginPage.inputPassword().sendKeys(password);
  loginPage.getbuttonLogin().click();
  messagePopUpPage.waitPopUp();
  Assert.assertEquals(messagePopUpPage.popUp().getText(),"Wrong password",
          "Error message does not contain Wrong password");
  Assert.assertTrue(driver.getCurrentUrl().contains("/login"),"Not on login page");

 }

 @Test(priority = 5)
 public void TC_5Login() throws InterruptedException {

  String email ="admin@admin.com";
  String password ="12345";

  navPage.getLoginButton().click();
  loginPage.inputEmail().sendKeys(email);
  loginPage.inputPassword().sendKeys(password);
  loginPage.getbuttonLogin().click();
  wait.until(ExpectedConditions.urlContains("/home"));
  Assert.assertTrue(driver.getCurrentUrl().contains("/home"),"Not on home page");

 }
 @Test(priority = 6)
 public void TC_6Logout() throws InterruptedException {

  Assert.assertTrue(navPage.getLogoutButton().isDisplayed(),"Logout button is not visible");
  navPage.getLogoutButton().click();

 }

}


