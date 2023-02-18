package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthRoutesTests extends BasicTest{

    @Test(priority = 1)
    public void  TC_1forbidsVisitsToHomeUrlIfNotAuthenticated() throws InterruptedException {
        driver.get(baseUrl+"/home");
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"),"Not on login page");


    }
    @Test(priority = 2)
    public void  TC_2forbidsVisitsToProfileUrlIfNotAuthenticated () throws InterruptedException {

        driver.get(baseUrl+"/profile");
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"),"Not on login page");


    }

    @Test(priority = 3)
    public void  TC_3forbidsVisitsToAdminCitiesUrlIfNotAuthenticate() throws InterruptedException {

        driver.get(baseUrl+"/admin/cities");
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"),"Not on login page");

    }

    @Test(priority = 4)
    public void  TC_4forbidsVisitsToAdminUsersUrlIfNotAuthenticated() throws InterruptedException {

        driver.get(baseUrl+"/admin/users");
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"),"Not on login page");

    }


}
