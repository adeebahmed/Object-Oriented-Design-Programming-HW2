/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightbulbs;

/**
 *
 * @author adeeb
 */
public class LightBulb implements ILightBlub{
    boolean lightBulbState; //true == on, false == off

    public LightBulb() {
        
    }

    public void turnLightBulbOn() {
        this.lightBulbState = true;
        System.out.println("LightBulb switched ON.");
    }

     public void turnLightBulbOff() {
        this.lightBulbState = false;
        System.out.println("LightBulb switched OFF.");
    }
}
