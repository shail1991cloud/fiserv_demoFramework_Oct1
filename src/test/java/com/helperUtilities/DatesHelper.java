package com.helperUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesHelper {

    public static String getTodayDateWithSeconds() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-"+"ss");
        String givenDate = sdf.format(date);
        return givenDate;
    }

}
