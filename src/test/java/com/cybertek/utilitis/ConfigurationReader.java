package com.cybertek.utilitis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();
    static {
        try {
            //load the file into fileInput Stream
            FileInputStream file =new FileInputStream("configuration.properties");
            //load properties objects withthe filee
            properties.load(file);
        } catch (IOException e) {
            System.out.println("File not found in configuration properties.");
        }

    }
    //use the obove created logic to create a Re-usable Static method
    public static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);
    }
}
