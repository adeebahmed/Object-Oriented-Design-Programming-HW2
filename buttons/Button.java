/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttons;

import lightbulbs.LightBulb;

/**
 *
 * @author adeeb
 */
public class Button {
    LightBulb l = new LightBulb(); //true == on, false == off

    //default constructor
    public Button() {
        
    }
    
    public void switchOn() {
        System.out.println("Button switched ON.");
        l.turnLightBulbOn();
    }

    public void switchOff() {
        System.out.println("Button switched OFF.");
        l.turnLightBulbOff();
    }
}
