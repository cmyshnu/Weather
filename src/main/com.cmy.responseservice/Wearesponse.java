package src.com.cmy.responseservice;


import com.cmy.httpservice.HttpRequest;
import com.cmy.requestservice.WeaRequest;

import java.io.IOException;
import java.util.Map;

public class Wearesponse {
    public static String weatherResponse;
    public static String getResponse(Map<String,String> data) throws IOException {
        weatherResponse= "";
        //获取url
        String url= src.com.cmy.urlservice.UrlService.getUrl("weather");
        //获取request
        String param= WeaRequest.getRequest(data);
        //获取response
        String weatherResponse= HttpRequest.get(url,param);
        //返回response
        System.out.println(weatherResponse);
        return weatherResponse ;
    }
}
