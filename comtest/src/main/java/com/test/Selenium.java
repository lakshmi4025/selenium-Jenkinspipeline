package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {
      [...]
public Map initCrawler(Things that I give as input) throws InterruptedException, ApiException, IOException {
    System.setProperty("webdriver.chrome.driver",  BackEndProperties.getProperty("chrome_driver_path") );
    final ChromeOptions chromeOptions = new ChromeOptions();
    //chromeOptions.setBinary("/usr/bin/chromium-browser"); 
    chromeOptions.addArguments("--headless");
    chromeOptions.addArguments("--disable-extensions");
    chromeOptions.addArguments("--disable-gpu");
    chromeOptions.addArguments("--no-sandbox");
    [...]

        driver.get(baseUrl);
        actualTitle = driver.getTitle();
		System.out.println(actualTitle);
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED");
        }
        driver.close();
    }
}
