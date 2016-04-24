/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttons;

/**
 *
 * @author adeeb
 */
public class Button implements IButton{
    boolean buttonstate;
    //default constructor
    public Button() {
        
    }
    
    public void switchOn() {
        buttonstate = true;
        System.out.println("Button switched ON.");
        //this.l.turnLightBulbOn();
    }

    public void switchOff() {
        buttonstate=false;
        System.out.println("Button switched OFF.");
        //this.l.turnLightBulbOff();
    }
    
    public boolean isOn(){
        return buttonstate;
    }

    @Override
    public String toString() {
        return "Button{" + "buttonstate=" + buttonstate + '}';
    }
}
