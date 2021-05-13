
package Test_pork;

import com.lab.pork.util;
import org.junit.Test;


public class pork {
    @Test
    public void test_getJson()throws Exception{
        String json=util.getjson();
        System.out.println(json);
    }
}
