package com.bridgelabz.testng.pages;

import com.bridgelabz.testng.Utility.ReadData;
import com.bridgelabz.testng.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseClass {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(id = "loginbutton")
    WebElement submit;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void validationFBLogin(String username, String password) throws IOException {
        //String emailField =ReadData.getCellValue("C:\\Users\\ppatil8\\IdeaProjects\\TestNGGradle\\src\\test\\resources\\Testdata.xlsx","Login",0,0);
        email.sendKeys(username);
        this.password.sendKeys(password);
        submit.click();
        //return new LoginPage();
    }
}
