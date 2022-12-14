package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sel02_FindElement_SendKeys {

    public static void main(String[] args) {

        //open the browser
        System.setProperty("webdriver.chrome.driver","C:/Users/mario/Javamapp/18TestAutomation/selenium_jar_and_drivers/chrome_drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //maximize the chrome browser
        driver.manage().window().maximize();

        //navigate
        driver.get("https://sv.glosbe.com/");

        //find element

        // by ID
        //driver.findElement(By.id("dictionary-search")).sendKeys("dog");
        // OR
        //WebElement search = driver.findElement(By.id("dictionary-search")) ;
        //search.sendKeys("cat");

        //by Name
        //driver.findElement(By.name("q")).sendKeys("mouse");

        //by LinkText and partialLinkText
        //driver.findElement(By.linkText("engelska")).click();
        driver.findElement(By.partialLinkText("gelska")).click();

        // class is not unique you shouldn't use to find one element... but many?





        //close the browser
        //driver.close();



    }
}
