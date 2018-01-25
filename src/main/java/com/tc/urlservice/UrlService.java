package com.tc.urlservice;

import java.io.*;
import java.util.Properties;

public class UrlService {
    public static String getUrl(String urlStr) throws IOException {
        Properties prop = new Properties();
        InputStream in = null;
        File directory = new File(".");
        File file = new File(directory.getCanonicalPath() +"\\src\\main\\resources\\url.properties");

        try {
            in = new BufferedInputStream(new FileInputStream(file));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        prop.load(in);
        String url = prop.getProperty(urlStr).trim();
        return url;
    }
}
