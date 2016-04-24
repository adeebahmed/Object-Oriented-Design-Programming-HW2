/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttons;

import lightbulbs.*;

/**
 *
 * @author adeeb
 */
public class PushButton implements IButton{
    boolean buttonState = false;
    LightBulb l;
    
    //default constructor
    public void PushButton(){
    
    }
    
    public void switchOn(){
        if (this.buttonState == false){
            this.buttonState = true;
            System.out.println("PushButton toggled ON.");
        }
    }
    
    public void switchOff(){    
        if (this.buttonState == true){
            this.buttonState = false;  
            System.out.println("PushButton toggled OFF.");
        }
    }
}
