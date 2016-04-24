/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightbulbs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adeeb
 */
public class ILightBulbTest {
    
    public ILightBulbTest() {
    }
    
    /**
     * Test of turnLightBulbOn method, of class ILightBulb.
     */
    @Test
    public void testTurnLightBulbOn() {
        System.out.println("turnLightBulbOn");
        ILightBulb instance = new ILightBulbImpl();
        instance.turnLightBulbOn();
        assertEquals(instance.isOn(), true);
        System.out.println("ILightBulb ON test PASSED.");
    }

    /**
     * Test of turnLightBulbOff method, of class ILightBulb.
     */
    @Test
    public void testTurnLightBulbOff() {
        System.out.println("turnLightBulbOff");
        ILightBulb instance = new ILightBulbImpl();
        instance.turnLightBulbOff();
        assertEquals(instance.isOn(), false);
        System.out.println("ILightBulb OFF test PASSED.");
    }

    public class ILightBulbImpl implements ILightBulb {
        boolean lightbulbstate;
        public void turnLightBulbOn() {
            lightbulbstate = true;
        }

        public void turnLightBulbOff() {
            lightbulbstate = false;
        }

        public boolean isOn() {
            return lightbulbstate;
        }
    }
    
}
