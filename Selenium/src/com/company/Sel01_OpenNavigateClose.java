package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel01_OpenNavigateClose {

    public static void main(String[] args) {
	// write your code here
      /*
        System.setProperty("webdriver.chrome.driver","C:/Users/mario/Javamapp/18TestAutomation/selenium_jar_and_drivers/chrome_drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gazzetta.it");

        driver.close();

       */


        System.setProperty("webdriver.gecko.driver","C:/Users/mario/Javamapp/18TestAutomation/selenium_jar_and_drivers/firefox_drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.gazzetta.it");

        driver.close();
    }
}
