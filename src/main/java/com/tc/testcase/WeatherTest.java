package com.tc.testcase;

import com.alibaba.fastjson.JSON;
import com.tc.dataprovide.DataProviderSet;
import com.tc.responseVO.WeatherVO;
import com.tc.responseservice.WeatherResponse;
import org.testng.annotations.Test;
import sun.reflect.generics.tree.VoidDescriptor;

import java.io.IOException;
import java.util.Map;

public class WeatherTest {

    @Test(dataProvider = "weather",dataProviderClass =DataProviderSet.class)
    public void getWeatherResponse(Map<String , String> data) throws IOException {
        String weatherResponse1 = WeatherResponse.getResponse(data);
        WeatherVO weatherVO= new WeatherVO();
        weatherVO = JSON.parseObject(weatherResponse1, WeatherVO.class);
        System.out.println(weatherVO.getCity());
    }
}
