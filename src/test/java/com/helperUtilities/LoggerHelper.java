
package com.helperUtilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author Shailendra PS Parihar
 */
public class LoggerHelper {

    private static boolean root = false;

    /**
     * @getlogger method is used to return Logger class object
     */

    public static Logger getLogger(Class cls) {
        if (root) {
            return Logger.getLogger(cls);
        }
        PropertyConfigurator.configure("log4j.properties");
        root = true;
        return Logger.getLogger(cls);
    }


}
