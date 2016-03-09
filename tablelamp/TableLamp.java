/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablelamp;

import lightbulbs.LightBulb;
import buttons.Button;

/**
 *
 * @author adeeb
 */
public class TableLamp {
    Button b;
    LightBulb l;
    
    public TableLamp(Button b, LightBulb l) {
        this.b = b;
        this.l = l;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Button testButton = new Button();
        
        testButton.switchOn();
        
        testButton.switchOff();

    }
}
