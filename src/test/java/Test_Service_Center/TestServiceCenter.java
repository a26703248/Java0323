package Test_Service_Center;

import com.lab.OrderSystem.ServiceCenter;
import org.junit.Test;

public class TestServiceCenter {
    @Test
    public void test_printCatalog(){
        ServiceCenter sc=new ServiceCenter();
        sc.printCatalog();
    }
}
