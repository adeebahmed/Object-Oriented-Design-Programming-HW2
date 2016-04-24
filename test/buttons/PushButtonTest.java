/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttons;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adeeb
 */
public class PushButtonTest {
    
    public PushButtonTest() {
    }

    /**
     * Test of switchOn method, of class PushButton.
     */
    @Test
    public void testSwitchOn() {
        System.out.println("switchOn");
        PushButton instance = new PushButton();
        instance.switchOn();
        assertEquals(instance.isOn(), true);
        System.out.println("PushButton ON test PASSED.");
    }

    /**
     * Test of switchOff method, of class PushButton.
     */
    @Test
    public void testSwitchOff() {
        System.out.println("switchOff");
        PushButton instance = new PushButton();
        instance.switchOff();
        assertEquals(instance.isOn(), false);
        System.out.println("PushButton OFF test PASSED.");
    }
    
}
