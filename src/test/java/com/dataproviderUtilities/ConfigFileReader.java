package com.dataproviderUtilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Shailendra PS Parihar
 */
public class ConfigFileReader {
    /**
     * @properties is a Properties class instance
     * @propertyFilePath is path of configuration properties file
     */

    private Properties properties;
    private final String propertyFilePath = "src/test/java/configs/configuration.properties";

    /**
     * @ileReder() constructor to initialise properties class
     */
    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    /**
     * @getDriver method  is a is to fetch driverPath
     */

    public String getDriverPath() {
        String driverPath = properties.getProperty("driverPath");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    /**
     * @getProperties method  to get properties object set by @setProperties method
     */

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * @getImplicitlyWait method  to set wait
     */

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }

    /**
     * @getApplicationUrl method  to get url
     */

    public String getApplicationUrl() {
        String url = properties.getProperty("dil_Url");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    /**
     * @getBrowserName method  to get browserName return type
     */
    public String getBrowserName() {
        String browserName = properties.getProperty("Browser");
        return browserName;
    }

    /**
     * @getReportConfigPath method  to return reportConfigPath return type
     */
    public String getReportConfigPath() {
        String reportConfigPath = properties.getProperty("reportConfigPath");
        if (reportConfigPath != null) return reportConfigPath;
        else
            throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

}