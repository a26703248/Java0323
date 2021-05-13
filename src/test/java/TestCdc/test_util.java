package TestCdc;

import com.cdc.Util;
import org.junit.Test;

public class test_util {
    @Test
    public void test_util() throws Exception{
        String json=Util.getJson();
        System.out.println(json);
    }
    @Test
    public void test_distance(){
        String circle="22.39,114.12";
        String tw="24.0,121.0";
        double m=Util.distance(circle, tw);
        System.out.printf("%.2f km\n",m/1000);
    }
}
