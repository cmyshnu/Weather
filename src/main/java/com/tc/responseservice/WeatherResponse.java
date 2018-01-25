package com.tc.responseservice;



import com.tc.httpservice.HttpService;
import com.tc.requestservice.WeatherRequest;
import com.tc.urlservice.UrlService;

import java.io.IOException;
import java.util.Map;

public class WeatherResponse {
    public static String weatherResponse;
    public static String getResponse(Map<String,String> data) throws IOException {
        weatherResponse= "";
        //获取url
        String url= UrlService.getUrl("weather");
        //获取request
        String param= WeatherRequest.getRequest(data);
        //获取response
        String weatherResponse= HttpService.get(url,param);
        //返回response
        System.out.println(weatherResponse);
        return weatherResponse ;
    }
}
