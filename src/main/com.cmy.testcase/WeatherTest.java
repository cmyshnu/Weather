package main.com.cmy.testcase;

import com.alibaba.fastjson.JSON;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class WeatherTest {
     public  WeatherVO getWeatherResponse(Map<String , String> data) throws IOException {
       String weatherResponse1 = Wearesponse.getResponse(data);
        WeatherVO weatherVO= new WeatherVO();
        weatherVO = JSON.parseObject(weatherResponse1, WeatherVO.class);
        System.out.println(weatherVO.getCity());
        return weatherVO;
    }
}
