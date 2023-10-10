package com.tesla;

import com.digital.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.time.Duration;

public class Hello {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Iphone");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }
}
