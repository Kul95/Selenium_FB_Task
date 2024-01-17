package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {
    public WebDriver driver;

    @Test
    public void keyboardOperation() throws AWTException, InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Robot robot = new Robot();
        Thread.sleep(1000);
        robot.mouseMove(400, 400);
        robot.mouseWheel(6);
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("Sharma");
//        robot.keyPress(KeyEvent.VK_E);
//        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);

        //navigate operations.............................
//        driver.navigate().back();
    }
}
