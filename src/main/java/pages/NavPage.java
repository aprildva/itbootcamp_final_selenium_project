package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavPage extends BasePage{
    public NavPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getlinkHome () {
      return   driver.findElement(By.xpath("//a[contains(@class,'btnHome')]"));

    }

    public WebElement linkAbout () {
      return  driver.findElement(By.xpath(
              "//a[contains(@class,'btnAbout')]"));

    }

    public WebElement linkMyProfile () {
      return  driver.findElement(By.xpath(
              "//a[contains(@class,'btnProfile')]"));

    }

    public WebElement linkAdmin () {
      return  driver.findElement(By.xpath(
              "//button[contains(@class,'btnAdmin')]"));

    }

    public WebElement linkCities () {
        return driver.findElement(By.xpath(
                "//a[contains(@class,'btnAdminCities')]"));


    }

    public WebElement linkUsers () {
        return driver.findElement(By.xpath(
                "//a[contains(@class,'btnAdminUsers')]"));


    }

    public WebElement getsingUpButton() {

        return driver.findElement(By.xpath(
                "//*[contains(@class, 'btnLogin')][2]"));

    }
    public WebElement getLoginButton() {
        return  driver.findElement(By.xpath(
                "//a[contains(@class,'btnLogin')]"));

    }

    public WebElement getLogoutButton () {
        return  driver.findElement(By.xpath(
                "//button[contains(@class,'btnLogout')]"));

    }

    public WebElement getLanguageButton() {
        return  driver.findElement(By.xpath(
                "//button[contains(@class,'btnLocaleActivation ')]"));

    }

    public WebElement getLanguageENButton() {
        return driver.findElement(By.xpath("//div[contains(@class,'btnEN')]"));


    }

    public WebElement getLanguageESButton() {
        return driver.findElement(By.xpath("//div[contains(@class,'btnES')]"));


    }

    public WebElement getLanguageFRButton() {
        return driver.findElement(By.xpath("//div[contains(@class,'btnFR')]"));


    }

    public WebElement getLanguageCNButton() {
        return driver.findElement(By.xpath("//div[contains(@class,'btnCN')]"));

    }

    public WebElement getH1P () {
        return driver.findElement(By.xpath(
                "//div[@class='layout row wrap']/div/h1"));
    }

}
