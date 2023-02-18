package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocaleTests extends BasicTest{

    @Test(priority = 1)
    public void  TC_1setlocaletoES() throws InterruptedException {

        navPage.getLanguageButton().click();
        navPage.getLanguageESButton().click();
       Assert.assertEquals(navPage.getH1P().getText(),"Página de aterrizaje",
               "Header text is not expected value");

    }
    @Test(priority = 2)
    public void  TC_2setlocaletoEN() throws InterruptedException {

        navPage.getLanguageButton().click();
        navPage.getLanguageENButton().click();
        Assert.assertEquals(navPage.getH1P().getText(),"Landing",
                "Header text is not expected value");

    }
    @Test(priority = 2)
    public void  TC_2setlocaletoFR() throws InterruptedException {

        navPage.getLanguageButton().click();
        navPage.getLanguageFRButton().click();
        Assert.assertEquals(navPage.getH1P().getText(),"Page d'atterrissage",
                "Header text is not expected value");

    }
    @Test(priority = 3)
    public void  TC_3setlocaletoCN() throws InterruptedException {

        navPage.getLanguageButton().click();
        navPage.getLanguageCNButton().click();
        Assert.assertEquals(navPage.getH1P().getText(),"首页",
                "Header text is not expected value");

    }



}
