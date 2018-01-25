package com.tc.requestservice;

import java.util.Map;

public class WeatherRequest {
    public static String getRequest(Map<String,String> param)
    {
    String params = "city="+param.get("city");
        return params ;
    }
}
