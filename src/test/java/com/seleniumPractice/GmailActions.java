package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailActions {
    public WebDriver driver;
@Test
    public void actions() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://mail.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("kuldeepkumar17feb@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Next")).click();
    }
}
