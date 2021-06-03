package com.helperUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author Shailendra PS Parihar
 */
public class DatesHelper {
    /**
     * @getTodayDateWithSeconds returns date with given format
     */
    public static String getTodayDateWithSeconds() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-"+"ss");
        String givenDate = sdf.format(date);
        return givenDate;
    }

}
