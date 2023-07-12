package com.github.bernabaris.seleniumsproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUsername;
    @FindBy(how=How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.CSS, using = ".btn-default")
    public WebElement btnLogin;

    public void Login(String userName, String password){
        //txtUsername.sendKeys(userName);
        //txtPassword.sendKeys(password);
        System.out.println("Username and password"+ userName +"---"+password);
    }

    public HomePage ClickLogin() {
        System.out.println("Click login from login page");
        return new HomePage();
    }
}
