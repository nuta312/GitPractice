package com.digital.driver;

import com.digital.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {

    public static WebDriver loadChromeDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nursultan\\IdeaProjects\\SummerSDET2023\\UI\\src\\main\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");

        if (Boolean.parseBoolean(ConfigReader.getProperty("headless"))){
            options.addArguments("--headless");
        }

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }

}
