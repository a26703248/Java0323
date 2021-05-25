
package com.lab.pork;

import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class util {
    public static String getjson()throws Exception{
        String path="https://data.coa.gov.tw/Service/OpenData/TransService.aspx?UnitId=tR9TIFWlvquB";
        URL url=new URL(path);
        String json=new Scanner(new InputStreamReader(url.openStream(),"UTF-8"))
                .useDelimiter("\\A")
                .next();
        return json;
    }
    
    public static Pork[] getpork()throws Exception{
        String json=getjson();
        Pork[] pork=new Gson().fromJson(json,Pork[].class);
        return pork;
    }
}
