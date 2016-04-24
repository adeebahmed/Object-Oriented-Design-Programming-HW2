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
public class ButtonTest {
    
    public ButtonTest() {
    }

    /**
     * Test of switchOn method, of class Button.
     */
    @Test
    public void testSwitchOn() {
        System.out.println("switchOn");
        Button instance = new Button();
        instance.switchOn();
        assertEquals(instance.isOn(), true);
        System.out.println("Button ON test PASSED.");
    }

    /**
     * Test of switchOff method, of class Button.
     */
    @Test
    public void testSwitchOff() {
        System.out.println("switchOff");
        Button instance = new Button();
        instance.switchOff();
        assertEquals(instance.isOn(), false);
        System.out.println("Button OFF test PASSED.");
    }
}
