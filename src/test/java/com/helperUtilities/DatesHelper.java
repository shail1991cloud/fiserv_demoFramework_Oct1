package com.helperUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesHelper {

    public static String getTodayDateWithHMS() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("--dd 'at' hh-mm-ss");
        String givenDate = sdf.format(date);
        return givenDate;
    }

}
