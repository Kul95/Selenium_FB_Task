package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.zip.ZipEntry;

public class FacebookLogin {
    public WebDriver driver;

    @Test
    public void login() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

//......Maximize window.........

        driver.manage().window().maximize();
        Thread.sleep(4000);
        //............User name..........

        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("kuldeep@gmail.com");
        Thread.sleep(4000);

        //..............Password................
        WebElement element1 = driver.findElement(By.name("pass"));
        element1.sendKeys("KUl788@jhsdk");
        Thread.sleep(4000);

        //..............Button login clik............
        driver.findElement(By.name("login")).click();

//linkText......
        driver.findElement(By.linkText("Forgotten password?")).click();
        Thread.sleep(4000);
//
//    WebElement element3=driver.findElement(By.id("identify_email"));
//    element3.sendKeys("swapnil@gmail.com");
//
//    WebElement element4=driver.findElement(By.name("did_submit"));
//    element4.click();
//driver.findElement(By.partialLinkText("Create new account")).click();
//Thread.sleep(5000);
//
//    WebElement element5=driver.findElement(By.name("firstname"));
//    element5.sendKeys("Kuldeep");
//
//    WebElement element6=driver.findElement(By.name("lastname"));
//    element6.sendKeys("Sharma");
//
//    WebElement element7=driver.findElement(By.name("reg_email__"));
//    element7.sendKeys("5689754858");
//
//    driver.findElement(By.name("reg_passwd__")).sendKeys("5689754858");
//
//
//   driver.findElement(By.name("birthday_month")).sendKeys("Jun");

//    driver.findElement(By.name("birthday_year")).sendKeys("2021");
//
//    driver.findElement(By.name("birthday_day")).sendKeys("13");
//
//    driver.findElement(By.xpath("Female"));


        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(4000);

        WebElement unTB = driver.findElement(By.name("firstname"));
        unTB.sendKeys("Kuldeep");

//Width and height....................
        int un_width = unTB.getSize().getWidth();
        System.out.println(un_width);
        int un_height = unTB.getSize().getHeight();
        System.out.println(un_height);

        //Location...........
        int location = unTB.getLocation().getX();
        System.out.println(location);
        Thread.sleep(3000);

// cssSelector....type/id/class/value.........
        driver.findElement(By.cssSelector("input[value='2']")).click();

//.......Absolute xpath.................
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();

    }
}
