package com.baselibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.util.concurrent.TimeUnit;

/**
 * @autho- Shailendra PS Parihar
 */
public class Baseclass {


    public static WebDriver driver;

    /**
     * @param browser is the name of browser that we can pas from enums
     * @return this method returns WebDriver instance
     * @method selectBrowser is used provide driver instance
     */

    public static WebDriver selectBrowser(String browser) {


        if (browser.equalsIgnoreCase(com.config.enums.Browsers.CHROME.name())) {
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } else if (browser.equalsIgnoreCase(com.config.enums.Browsers.IE.name())) {

            InternetExplorerOptions ieOptions = new InternetExplorerOptions();
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver(ieOptions);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }


        return driver;
    }

}
