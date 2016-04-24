/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablelamp;

import buttons.Button;
import buttons.PushButton;
import lightbulbs.LightBulb;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adeeb
 */
public class TableLampTest {
    
    public TableLampTest() {
    }

    /**
     * Test of turnTableLampOn method, of class TableLamp.
     */
    @Test
    public void testTurnTableLampOn() {
        System.out.println("turnTableLampOn");
        
        Button b = new Button();
        LightBulb l = new LightBulb();
        TableLamp tl = new TableLamp(b,l);
        tl.turnTableLampOn();
        assertEquals(tl.l.isOn(), true);
        System.out.println("TableLamp ON test PASSED.");
    }

    /**
     * Test of turnTableLampOff method, of class TableLamp.
     */
    @Test
    public void testTurnTableLampOff() {
        System.out.println("turnTableLampOff");
        Button b = new Button();
        LightBulb l = new LightBulb();
        TableLamp tl = new TableLamp(b,l);
        tl.turnTableLampOff();
        assertEquals(tl.l.isOn(), false);
        System.out.println("TableLamp OFF test PASSED.");
    }
    
        /**
     * Test of turnTableLampOn method, of class TableLamp.
     */
    @Test
    public void testTurnTableLampOnPushButton() {
        System.out.println("turnTableLampOnPushButton");
        
        PushButton pb = new PushButton();
        LightBulb l = new LightBulb();
        TableLamp tl = new TableLamp(pb,l);
        tl.turnTableLampOn();
        assertEquals(tl.l.isOn(), true);
        System.out.println("TableLamp ON test PASSED.");
    }

    /**
     * Test of turnTableLampOff method, of class TableLamp.
     */
    @Test
    public void testTurnTableLampOffPushButton() {
        System.out.println("turnTableLampOffPushButton");
        PushButton pb = new PushButton();
        LightBulb l = new LightBulb();
        TableLamp tl = new TableLamp(pb,l);
        tl.turnTableLampOff();
        assertEquals(tl.l.isOn(), false);
        System.out.println("TableLamp OFF test PASSED.");
    }
    
}
