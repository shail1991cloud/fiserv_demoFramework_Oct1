package com.managersUtilities;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;

public class Commonfunction {


    public static void maximiseBrowser(WebDriver driver) {
        driver.manage().window().maximize();

    }

    public static void scrollToAxis(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void selectFromDropDownWithValue(WebElement dropDown, String value) {
        Select select = new Select(dropDown);
        select.selectByValue(value);
    }

    public static void submitDetails(WebElement element) {

        element.click();
    }

    public static void clickForceFully(WebDriver driver,WebElement element)
    {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public static String generateRandomString(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static void clickOnShadowElement(WebDriver driver, String elementJSPath) throws InterruptedException {
        Commonfunction.waitForSomeTime();
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        WebElement elementToClick=(WebElement) jse.executeScript(elementJSPath);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elementToClick);

    }

    public static void waitForElementToAppear(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void clickByHoveringMouse(WebDriver driver, WebElement element) throws InterruptedException {

        waitForSomeTime();
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }

    public static void navigateBackward(WebDriver driver) {
        driver.navigate().back();
    }

    public static void waitForSomeTime() throws InterruptedException {
        Thread.sleep(5000);
    }
    public static void waitForMinimalTime() throws InterruptedException {
        Thread.sleep(200);
    }
    public static List<WebElement> getCustomisedWebElements(WebDriver driver,String stringXpath, String stringToAdd)
    {
        List<WebElement> customisedElements= driver.findElements(org.openqa.selenium.By.xpath(String.format(stringXpath,stringToAdd)));
        return customisedElements;
    }

    public static WebElement getCustomisedWebElement(WebDriver driver,String stringXpath, String stringToAdd)
    {
        WebElement customisedElement= driver.findElement(org.openqa.selenium.By.xpath(String.format(stringXpath,stringToAdd)));
        return customisedElement;
    }

    public static void getScreenShots(WebDriver driver, Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                //This takes a screenshot from the driver at save it to the specified location
                TakesScreenshot ts = (TakesScreenshot) driver;
                File sourcePath = ts.getScreenshotAs(OutputType.FILE);

                //Building up the destination path for the screenshot to save
                //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
                Date d = new Date();
                Timestamp t = new Timestamp(d.getTime());
                String timeStamp = t.toString();
                timeStamp = timeStamp.replace(' ', '_');
                timeStamp = timeStamp.replace(':', '_');

                String dest = System.getProperty("user.dir") + "/test-output/ScreenShots/failScreen" + timeStamp + ".png";
                System.out.println(dest);
                File destinationPath = new File(dest);

                //Copy taken screenshot from source location to destination location
                Files.copy(sourcePath, destinationPath);

                //This attach the specified screenshot to the test
                Reporter.addScreenCaptureFromPath(destinationPath.toString());
            } catch (IOException e) {
            }
        }


    }


}
