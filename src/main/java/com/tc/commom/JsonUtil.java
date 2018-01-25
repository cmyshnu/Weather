package com.tc.commom;

import com.alibaba.fastjson.JSON;

import java.util.Map;

public class JsonUtil {
   public static String object2JsonString(Map<String, String> params)
   {
       String jsonObjectString = JSON.toJSONString(params);
       //JSONObject jsonObject = JSONObject.fromObject(smallMap);
       return jsonObjectString;

   }
}
