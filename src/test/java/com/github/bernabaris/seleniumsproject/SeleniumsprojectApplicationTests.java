package com.github.bernabaris.seleniumsproject;


import com.github.bernabaris.seleniumsproject.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootTest
@Profile("se")
class SeleniumsprojectApplicationTests {

	@Autowired
	private MainPage mainPage;

	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;
	@Test
	void performLoginTest() {


		mainPage.PerformLogin();
	}

}
