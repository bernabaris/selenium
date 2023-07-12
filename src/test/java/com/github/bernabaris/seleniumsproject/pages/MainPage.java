package com.github.bernabaris.seleniumsproject.pages;

public class MainPage {

    private LoginPage loginPage;
    public HomePage homePage;

    public MainPage(LoginPage loginPage, HomePage homePage) {
        this.loginPage = loginPage;
        this.homePage = homePage;
    }

    public void PerformLogin() {
        homePage.ClickLogin();
        loginPage.Login("admin","password1234");
        loginPage.ClickLogin();
    }
}
