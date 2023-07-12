package com.github.bernabaris.seleniumsproject;

import com.github.bernabaris.seleniumsproject.pages.HomePage;
import com.github.bernabaris.seleniumsproject.pages.LoginPage;
import com.github.bernabaris.seleniumsproject.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumsprojectApplicationTests {

	@Test
	void contextLoads() {
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
		//	LoginPage loginPage = page.ClickLogin();
		//	loginPage.ClickLogin();
		MainPage mainPage = new MainPage(loginPage,homePage);
		mainPage.PerformLogin();
	}

}
