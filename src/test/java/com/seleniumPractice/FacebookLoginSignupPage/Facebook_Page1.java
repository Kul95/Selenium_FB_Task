package com.seleniumPractice.FacebookLoginSignupPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class Facebook_Page1 {
    public WebDriver driver;

    @Test
    public void fb_Page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("firstname")).sendKeys("Kuldeep");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Sharma");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("kuldeepsharma17feb@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kuldeepsharma17feb@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Admin@123");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_day")).sendKeys("25");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_month")).sendKeys("April");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
    }

    @Test
    public void login() throws InterruptedException, IOException, AWTException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("kuldeepkumar93203@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("admin@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(8000);
        WebElement menu = driver.findElement(By.xpath("//a[@aria-label='Home']"));
        menu.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Photo/video']")).click();
        Thread.sleep(6000);
        WebElement photoVideoUpload = driver.findElement(By.xpath("//span[text()='Add photos/videos']"));
        photoVideoUpload.click();
        Thread.sleep(8000);
        Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\krishna2.exe");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Post']")).click();
        Thread.sleep(6000);
//       driver.findElement(By.xpath("//input[@aria-label='Search Facebook']")).sendKeys("Swapnil Patill");
//
//        driver.findElement(By.xpath("//span//a[@aria-label='Friends']")).sendKeys("Swapnil Patill");
//        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@aria-label='Friends']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='All Friends']")).click();
//        Thread.sleep(5000);
//        WebElement element1 = driver.findElement(By.xpath("//input[@aria-label='Search bar for friend search']"));
////        element1.sendKeys("Swapnill Patill");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//input[@placeholder='Search Friends']")).sendKeys("Happy Jadhav");
        Thread.sleep(5000);
        WebElement fr = driver.findElement(By.xpath("//span[text()='Happy Jadhav']"));
        fr.click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a/div/div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][1]"));
//        Thread.sleep(3000);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        for (int i = 0; i < 8; i++) {
            executor.executeScript("window.scrollBy(0,600)");
            Thread.sleep(1000);
        }
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@aria-label='Like']")).click();

        Thread.sleep(4000);
        for (int i = 0; i < 8; i++) {
            executor.executeScript("window.scrollBy(0,-600)");
            Thread.sleep(2000);
        }
        Thread.sleep(2000);
        menu.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@aria-label=\"Kuldeep Sharma's timeline\"]")).click();
        Thread.sleep(2000);
        for (int i = 0; i < 8; i++) {
            executor.executeScript("window.scrollBy(0,600)");
            Thread.sleep(1000);
        }
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@aria-label='Like']")).click();
    }
}
