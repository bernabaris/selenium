package com.github.bernabaris.seleniumsproject.pages;

import com.github.bernabaris.seleniumsproject.libraries.WebDriverLibrary;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage {
    public MainPage() {

        System.out.println("In Main page");
    }
    @Autowired
    private LoginPage loginPage;
    @Autowired
    public HomePage homePage;

    @Value("${app.url}")
    private String appUrl;

     @Autowired
     private WebDriver webDriver;

    public void PerformLogin() {

        webDriver.navigate().to(appUrl);
        System.out.println("Login" + appUrl);
        homePage.ClickLogin();
        loginPage.Login("admin","adminpassword23432");
        loginPage.ClickLogin();
    }
}
