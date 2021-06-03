package com.baselibrary;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
/**
@author- Shailendra Ps Parihar
 */
public class Capturescreenshots {

    /**
    @captureScreenshots -Capture screenshot is used to take screenshot
    @return -dest is a captureScreenshot destination path
     */

    public static String captureScreenshots(WebDriver driver, String screenshotName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File Source = ts.getScreenshotAs(OutputType.FILE);
        Date d = new Date();
        Timestamp t = new Timestamp(d.getTime());
        String timeStamp = t.toString();
        timeStamp = timeStamp.replace(' ', '_');
        timeStamp = timeStamp.replace(':', '_');
        String dest = ".//ScreenShots//" + screenshotName + "_" + timeStamp + ".png";
        File destFile = new File(dest);
        FileUtils.copyFile(Source, destFile);

        return dest;


    }


}
