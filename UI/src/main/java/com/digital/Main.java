package com.digital;

import com.digital.driver.Driver;
import com.digital.helper.ScreenShotMethods;
import com.digital.models.Student;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class Main {


    public static void main(String[] args) {
        Student john = new Student("Jonh", "Doe", "john@gmail.com", "+996555444222", "Bishkek312");
        System.out.println(john.getLastName());
        sayHello();

    }


    public static void sayHello() {
        System.out.println("Hello");
    }


    WebDriver driver;


    @BeforeClass
    public void setIp() {
        driver = Driver.getDriver();
    }

    @Test
    void test1() throws InterruptedException, IOException {
        ScreenShotMethods screenShotMethods = new ScreenShotMethods();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        driver.findElement(By.id("timerAlertButton")).click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        screenShotMethods.takeScreenShot();

        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();

        driver.findElement(By.id("promtButton")).click();

        alert.sendKeys("Nuta");
        alert.accept();


    }

    @Test
    void test12() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        WebElement div = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div.getText());

    }

    @Test
    void test13() {
        driver.get("https://demoqa.com/nestedframes");
        //first go to parent frame
        driver.switchTo().frame("frame1");
        // then go to child frame
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();

    }

    @Test
    void test14() {
        driver.get("https://www.google.com/");
    }

    @Test
    void test15() {
        driver.get("https://www.google.com/");
    }

    @Test
    void test16() {
        driver.get("https://www.google.com/");
    }
}