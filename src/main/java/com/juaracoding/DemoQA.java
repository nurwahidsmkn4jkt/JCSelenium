package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
    public static void main(String[] args) {
        String path = "D:\\SQA RPA Batch 10 - Juaracoding\\MyTools\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        System.out.println("Open Browser, Open URL");
        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        driver.findElement(By.id("userEmail")).sendKeys("muhammadnurwahid184@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        js.executeScript("window.scrollBy(0,500)"); // scroll vertical 500px
        driver.findElement(By.id("submit")).click();
        delay();
        driver.quit();
        System.out.println("Quit Browers");
    }

    public static void delay(){
        try {
            Thread.sleep(3000);  // Delay 3 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
