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
public class IButtonTest {
    
    public IButtonTest() {
    }
    
    /**
     * Test of switchOn method, of class IButton.
     */
    @Test
    public void testSwitchOn() {
        System.out.println("switchOn");
        IButton instance = new IButtonImpl();
        instance.switchOn();
        assertEquals(instance.isOn(), true);
        System.out.println("IButton ON test PASSED.");
    }

    /**
     * Test of switchOff method, of class IButton.
     */
    @Test
    public void testSwitchOff() {
        System.out.println("switchOff");
        IButton instance = new IButtonImpl();
        instance.switchOff();
        assertEquals(instance.isOn(), false);
        System.out.println("IButton OFF test PASSED.");
    }

    public class IButtonImpl implements IButton {
        boolean buttonstate;
        public void switchOn() {
            buttonstate=true;
        }

        public void switchOff() {
            buttonstate=false;
        }

        public boolean isOn() {
            return buttonstate;
        }
    }
    
}
