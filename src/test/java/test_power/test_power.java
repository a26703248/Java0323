
package test_power;

import com.ocp.Day29_assert.Power;
import junit.framework.Assert;
import org.junit.Test;

public class test_power {
    Power power = new Power();
    @Test
    public void t1(){
        int v = 220;
        int a = 100;
        //期望
        int exp = 22000;
        //實際
        int act = power.getW(v, a);
        Assert.assertEquals(exp, act);
    }
    
    @Test
    public void t2(){
        int w = 22000;
        int a = 100;
        //期望
        int exp = 220;
        //實際
        int act = power.getV(w, a);
        Assert.assertEquals(exp, act);
    }
    
    @Test
    public void t3(){
        int w = 22000;
        int v = 220;
        //期望
        int exp = 100;
        //實際
        int act = power.getA(w, v);
        Assert.assertEquals(exp, act);
    }
}
