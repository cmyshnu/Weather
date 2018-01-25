package com.cmy.requestservice;

import java.util.Map;

public class WeaRequest {
    public static String getRequest(Map<String,String> param)
    {
    String params = "city="+param.get("city");
        return params ;
    }
}
