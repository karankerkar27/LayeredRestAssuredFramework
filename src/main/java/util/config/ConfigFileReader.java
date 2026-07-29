package util.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;

    private final String filePath = "C:\\Users\\krupa\\Dev\\API Automation\\SimpleRestAssuredFramework\\LayeredRestAssuredFramework\\LayeredRestAssuredFramework\\src\\main\\resources\\config\\config.properties";

    public ConfigFileReader(){

        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(filePath));
            properties = new Properties();
                try{
                    properties.load(reader);
                }catch(IOException e){
                    e.printStackTrace();
                }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public String getProperty(String propertyName){
        String property = properties.getProperty(propertyName);
        if(property !=null) return property;
        else throw new RuntimeException("Property Not Found");
    }

}