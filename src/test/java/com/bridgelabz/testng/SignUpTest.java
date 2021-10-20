package com.bridgelabz.testng;

import com.bridgelabz.testng.base.BaseClass;
import com.bridgelabz.testng.pages.LoginPage;
import com.bridgelabz.testng.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseClass {
    SignUpPage signUp;

    @Test
    public void launchFB_SignUp() throws InterruptedException {
        driver.get("https://en-gb.facebook.com/signup");
        Thread.sleep(500);
        System.out.println(driver);
        signUp = new SignUpPage();
        signUp.validationFBSignUp();
        String actualTitle = "Sign up for Facebook | Facebook";
        String title = driver.getTitle();
        Assert.assertEquals(actualTitle, title);
    }

}

