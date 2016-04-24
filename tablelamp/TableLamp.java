/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablelamp;

import lightbulbs.*;
import buttons.*;

/**
 *
 * @author adeeb
 */
public class TableLamp {
    IButton b;
    LightBulb l;
    
    public TableLamp(IButton b, LightBulb l) {
        this.b = b;
        this.l = l;
    }
    
    public void turnTableLampOn(){
        b.switchOn();
        l.turnLightBulbOn();
        System.out.println("Table lamp has been turned ON.");
    }
    
    public void turnTableLampOff(){
        b.switchOff();
        l.turnLightBulbOff();
        System.out.println("Table lamp has been turned OFF.");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Button testButton = new Button();
        testButton.switchOn();
        testButton.switchOff();*/
        
        Button b = new Button();
        LightBulb l = new LightBulb();
        TableLamp tl = new TableLamp(b,l);
        
        tl.turnTableLampOn();
        System.out.println("");
        tl.turnTableLampOff();
        
        System.out.println("");
        System.out.println("");
        PushButton pb = new PushButton();
        LightBulb pl = new LightBulb();
        TableLamp ptl = new TableLamp(pb,pl);
        
        ptl.turnTableLampOn();
        System.out.println("");
        ptl.turnTableLampOff();

    }
}
