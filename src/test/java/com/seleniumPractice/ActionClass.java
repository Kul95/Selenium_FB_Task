package com.seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionClass {
    public WebDriver driver;

    @Test
    public void action() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement link = driver.findElement(By.linkText("Create new account"));
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("kuldeepkumar17feb@gmail.come");
        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Admin@123");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.cssSelector("input[id='identify_email']")).sendKeys("kuldeepkumar17feb@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("Button[value='1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("Button[type='submit']")).click();
        driver.findElement(By.linkText("uiButtonText")).click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.contextClick(link).perform();
        Thread.sleep(2000);
        Robot r = new Robot();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        driver.quit();
    }
    }
