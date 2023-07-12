package com.github.bernabaris.seleniumsproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    public LoginPage ClickLogin(){
        // lnkLogin.click();
        System.out.println("Click the home page login");
        return new LoginPage();
    }

    public void ClickEmployeeList()  {
        lnkEmployeeList.click();
    }
}
