package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement inputEmail () {
        return driver.findElement(By.name("email"));

    }

    public WebElement inputPassword () {
      return  driver.findElement(By.name("password"));

    }
    public WebElement getbuttonLogin () {
     return driver.findElement(By.xpath(
             "//div[@class='flex text-xs-center mt-5 mb-3']/button"));

    }

}
