package com.cdc;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

/*工具程式
1抓取Json資料
2.建立Json物件entry
3.匯入Json資料到陣列(利用Gson)
4.分析陣列資料
 */
public class Util {

    public static String getJson() throws Exception {
        //資料來源
        String path = "https://www.cdc.gov.tw/TravelEpidemic/ExportJSON";
        //建立URL物件
        URL url = new URL(path);
        //取得Json文字資料("\\A"全部選擇)
        String json = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"))
                .useDelimiter("\\A")
                .next();
        return (json.charAt(0) == '?') ? json.substring(1) : json;
    }

    public static CDC[] getCdcs() throws Exception {
        String json = getJson();
        CDC[] cdcs = new Gson().fromJson(json, CDC[].class);
        return cdcs;
    }
    //點到點之間圓弧距離
    public static double distance(String p1,String p2) {
        //p1="-35.17,-65.91"
        //p1.split(",")[0]得到-35.17
        //p1.split(",")[1]得到-65.91
        double lat1=Double.parseDouble(p1.split(",")[0]);
        double long1=Double.parseDouble(p1.split(",")[1]);
        double lat2=Double.parseDouble(p2.split(",")[0]);
        double long2=Double.parseDouble(p2.split(",")[1]);
        double a, b, R;
        R = 6378137; // 地球半径
        lat1 = lat1 * Math.PI / 180.0;
        lat2 = lat2 * Math.PI / 180.0;
        a = lat1 - lat2;
        b = (long1 - long2) * Math.PI / 180.0;
        double d;
        double sa2, sb2;
        sa2 = Math.sin(a / 2.0);
        sb2 = Math.sin(b / 2.0);
        d = 2* R* Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1)
                        * Math.cos(lat2) * sb2 * sb2));
        return d;
    }
    
    
}
