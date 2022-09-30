package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel05_GettingUrlAndTitle {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:/Users/mario/Javamapp/18TestAutomation/selenium_jar_and_drivers/chrome_drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.vina.se/");



        driver.findElement(By.linkText("LEDIGA TJÄNSTER")).click();
        String act_url= driver.getCurrentUrl();
        String expected_url="https://www.vina.se/lediga#top";

        if (act_url.equals(expected_url)) {
            System.out.println("Url Test Passed");
        }
        else {
            System.out.println("Url Test Failed");
        }


        String act_title= driver.getTitle();
        String expected_title="Vina";

        if (act_title.equals(expected_title)) {
            System.out.println("Title Test Passed");
        }
        else {
            System.out.println("Title Test Failed");
        }

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);




        //driver.findElement(By.id("input-group")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));

        //driver.findElement(By.name("username")).sendKeys("marios");

        //driver.findElement(By.name("password")).sendKeys("admin123");

        //driver.findElement(By.partialLinkText("Login")).click();

        driver.close();




    }
}
