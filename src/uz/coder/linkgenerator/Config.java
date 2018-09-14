package uz.coder.linkgenerator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class Config {
    String result = "";
    InputStream inputStream;

    public String getPropValues() throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = "config.cfg";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            Date time = new Date(System.currentTimeMillis());

            String count = prop.getProperty("count");
            String url = prop.getProperty("url");
            result = count + " " + url;

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return result;
    }

}
