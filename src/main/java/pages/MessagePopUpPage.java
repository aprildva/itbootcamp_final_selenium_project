package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessagePopUpPage extends BasePage {
    public MessagePopUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void waitPopUp() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//div[contains(@class, 'v-snack__content')]/ul/li")));

    }

    public WebElement popUp() {
        return driver.findElement(By.xpath(
                "//div[contains(@class, 'v-snack__content')]/ul/li"));
    }


    public void verify() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//*[contains(@class, 'dlgVerifyAccount')]")));

    }

    public String getVerifyTittle() {
        return driver.findElement(By.xpath(
                "//*[contains(@class,'dlgVerifyAccount')]")).getText();
    }

    public WebElement getButtonClose() {
        return driver.findElement(By.xpath("//*[contains(@class, 'btnClose')]"));
    }

    public void waitPopUpCity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//div[contains(@class,'success')]")));

    }

    public WebElement getpopUpCity() {
        return driver.findElement(By.xpath(
                "//div[contains(@class,'success')]"));
    }


    public void waitPopUpCityDelete() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//div[@class='v-dialog v-dialog--active']")));

    }
}