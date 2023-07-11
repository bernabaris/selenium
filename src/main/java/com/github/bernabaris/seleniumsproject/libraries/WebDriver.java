package com.github.bernabaris.seleniumsproject.libraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriver {
    @Bean
    @ConditionalOnProperty(name = "browser",havingValue = "Chrome")

    public ChromeDriver getChromeDriver() {
       WebDriverManager.chromedriver().setup();
       return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(name="browser", havingValue = "Edge")
    public FirefoxDriver getEdgeChromeDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

}
