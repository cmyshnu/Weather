package com.tc.dataprovide;


import jxl.read.biff.BiffException;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public  class DataProviderSet {
    @DataProvider(name="weather")
    public  static   Object[][] Numbers() throws BiffException, IOException {
      ExcelData e=new ExcelData("weather", "weather");
        return e.getExcelData();
    }
}
