package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CitiesPage extends BasePage{

    public CitiesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getNewItemButton (){

        return driver.findElement(By.xpath("//button[contains(@class,'btnNewItem')]"));
}

    public void waitdialogNewEditItem (){

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
            "//div[contains(@class,'dlgNewEditItem')]")));
}

    public WebElement dialogNewItem (){
       return driver.findElement(By.xpath(
               "//div[contains(@class,'dlgNewEditItem')]"));
}

    public WebElement inputCity() {

        return driver.findElement(By.name("name"));

}
    public void dialogDelete () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//div[contains(@class,'v-dialog--active')]")));

    }

    public WebElement getSaveButton(){

        return driver.findElement(By.xpath(
                "//button[contains(@class,'btnSave')]"));
    }

    public WebElement getDeleteButtonRow( int row){

        return driver.findElement(By.xpath(
                "//div[@class='v-data-table__wrapper']/table/tbody/tr["+row+"]/td[1]/div/button[2]"));
    }

    public void rowNumber (int row) {

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(
                "//div[@class='v-data-table__wrapper']/table/tbody/tr"),row));
    }

    public WebElement inputSearch(){

        return driver.findElement(By.id("search"));
    }

    public WebElement getEditButtonRow( int row){

        return driver.findElement(By.xpath(
                "//div[@class='v-data-table__wrapper']/table/tbody/tr["+row+"]/td[1]/div/button[1]"));
    }


    public WebElement getCell (int row, int column) {
    return driver.findElement(By.xpath(
            "//div[@class='v-data-table__wrapper']/table/tbody/tr["+row+"]/td["+column+"]"));

    }

    public WebElement getDeleteButton(){

        return driver.findElement(By.xpath(
                "//div[@class='v-card__actions']/button[2]"));
    }


}
