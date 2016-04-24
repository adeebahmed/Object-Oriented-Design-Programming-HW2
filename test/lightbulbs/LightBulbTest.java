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
public class LightBulbTest {
    
    public LightBulbTest() {
    }
    
    /**
     * Test of turnLightBulbOn method, of class LightBulb.
     */
    @Test
    public void testTurnLightBulbOn() {
        System.out.println("turnLightBulbOn");
        LightBulb l = new LightBulb();
        l.turnLightBulbOn();
        assertEquals(l.isOn(), true);
        System.out.println("LightBulb ON test PASSED.");
    }

    /**
     * Test of turnLightBulbOff method, of class LightBulb.
     */
    @Test
    public void testTurnLightBulbOff() {
        System.out.println("turnLightBulbOff");
        LightBulb l = new LightBulb();
        l.turnLightBulbOff();
        assertEquals(l.isOn(), false);
        System.out.println("TableLamp OFF test PASSED.");
    }
    
}
