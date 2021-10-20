package com.bridgelabz.testng;

import com.bridgelabz.testng.Utility.ReadExcelData;
import com.bridgelabz.testng.base.BaseClass;
import com.bridgelabz.testng.pages.LoginPage;
import com.bridgelabz.testng.pages.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseClass {
    LoginPage loginPage;
    String sheetName = "Login";

    @DataProvider
    public Object[][] getLoginTestdata() {
        return ReadExcelData.getTestData(sheetName);
    }

    @Test(priority = 1, dataProvider = "getLoginTestdata")
    public void loginTest(String username, String password) throws IOException {
        driver.get("https://en-gb.facebook.com/login/");
        loginPage = new LoginPage();
        loginPage.validationFBLogin(username, password);
    }

}

