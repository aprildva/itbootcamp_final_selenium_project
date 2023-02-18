package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends BasePage{
    public SignupPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement inputName(){

        return driver.findElement(By.name("name"));
    }

    public WebElement inputEmail(){

        return driver.findElement(By.name("email"));
    }

    public WebElement inputPassword(){

        return driver.findElement(By.name("password"));
    }
    public WebElement inputConfirmPassword(){

        return driver.findElement(By.name("confirmPassword"));
    }

    public WebElement getSignUpButton(){

        return driver.findElement(By.xpath(
                "//*[contains(@class, 'secondary')]"));
    }

}
