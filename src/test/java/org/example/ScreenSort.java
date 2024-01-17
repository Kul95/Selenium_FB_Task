package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class ScreenSort {
    public WebDriver driver;

    @Test
    public void ScreenSort() throws InterruptedException, IOException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File file1 = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File file2 = new File("C:\\Users\\Admin\\Desktop\\JavaProgramsList\\FacebookLogin\\myScreenSort1\\img1.jpg");
        FileHandler.copy(file1, file2);

    }

    @Test
    public void mouse_Keyboard() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        Robot robot = new Robot();
//        Robot robot = new Robot();
        Thread.sleep(3000);
        //mouseMove............
        robot.mouseMove(600, 600);
        //mouseWheel............
        robot.mouseWheel(5);
        //keyPress and keyRelease..............
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
    }

    @Test
    public void scrollUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,50)");
    }

    @Test
    public void desable_enable_Input() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/Admin/Desktop/Selenium/index1.html");
        driver.manage().window().maximize();
//Enable.....
        driver.findElement(By.id("1")).sendKeys("Sharma");
        Thread.sleep(2000);
//Disable.............
        driver.findElement(By.id("2")).sendKeys("Sharma");
        Thread.sleep(2000);
    }

    @Test
    public void actionClass() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/Admin/Desktop/Selenium/demo2.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
//        driver.findElement(By.id("t1")).sendKeys("Santosh");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("Sharma");
    }

    @Test
    public void using_Drag_and_drop() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        WebElement des = driver.findElement(By.id("draggable"));
        WebElement element2 = driver.findElement(By.xpath("//p[text()='Drop here']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(des, element2).perform();
    }

    @Test
    public void facebook_Login_Operations() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");

        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kuldeepkumar17feb@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("KULfacebook6386@#");
        Thread.sleep(2000);
//        driver.findElement(By.partialLinkText("Log in")).click();
        driver.findElement(By.linkText("Forgotten account?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("kuldeepkumar17feb@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("did_submit")).click();
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,200)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div/div[3]/div/div[1]/button")).click();
    }

    @Test
    public void form() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("firstName")).sendKeys("Kuldeep");
        Thread.sleep(2000);
        driver.findElement(By.id("lastName")).sendKeys("Sharma");
        Thread.sleep(2000);
        driver.findElement(By.id("userEmail")).sendKeys("kuldeepkumar@gmail.com");
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.id("gender-radio-1"));
        driver.findElement(By.id("userNumber")).sendKeys("9658741230");
        Thread.sleep(2000);
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("23 Mar 2017");
    }
}
