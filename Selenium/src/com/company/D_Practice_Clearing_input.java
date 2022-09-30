package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Practice_Clearing_input {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:/Users/mario/Javamapp/18TestAutomation/selenium_jar_and_drivers/chrome_drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://start.spring.io/");

        WebElement query = driver.findElement(By.id("input-group"));
        query.clear();
        query.sendKeys("marios");
        //driver.findElement(By.id("input-group")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));

        //driver.findElement(By.name("username")).sendKeys("marios");

        //driver.findElement(By.name("password")).sendKeys("admin123");

        //driver.findElement(By.partialLinkText("Login")).click();

        //driver.close();




    }
}
