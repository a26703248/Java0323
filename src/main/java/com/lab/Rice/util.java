
package com.lab.Rice;

import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class util {
    public static String getjson()throws Exception{
        String path="https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        URL url=new URL(path);
        String json=new Scanner(new InputStreamReader(url.openStream(),"UTF-8"))
                .useDelimiter("\\A")
                .next();
        return json;
    }
    
    public static Rice[] getRice()throws Exception{
        String json=getjson();
        Rice[] rice=new Gson().fromJson(json,Rice[].class);
        return rice;
    }
    
    
    
}
