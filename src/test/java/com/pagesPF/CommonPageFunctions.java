package com.pagesPF;

import com.managersUtilities.CommonFunction;
import org.openqa.selenium.WebDriver;

public class CommonPageFunctions {
    WebDriver driver;

    public CommonPageFunctions(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterUrl(String url ) throws InterruptedException {
        driver.get(url);
        CommonFunction.deleteAllCookies(driver);
        CommonFunction.maximiseBrowser(driver);

    }
}
