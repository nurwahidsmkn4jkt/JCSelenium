package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\SQA RPA Batch 10 - Juaracoding\\MyTools\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Open Browser, Open URL");
        driver.findElement(By.name("q")).sendKeys("JuaraCoding" + Keys.ENTER);
        System.out.println("input Search + enter");
        try {
            Thread.sleep(3000);        // Delay 3 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browers");

    }
}