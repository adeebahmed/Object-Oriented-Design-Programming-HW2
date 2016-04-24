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
public class PushButton implements IButton{
    boolean buttonstate = false;

    //default constructor
    public void PushButton(){
        
    }
    
    public void switchOn(){
        if (this.buttonstate == false){
            this.buttonstate = true;
            System.out.println("PushButton toggled ON.");
        }
    }
    
    public void switchOff(){    
        if (this.buttonstate == true){
            this.buttonstate = false;  
            System.out.println("PushButton toggled OFF.");
        }
    }
    
    public boolean isOn(){
        return buttonstate;
    }

    @Override
    public String toString() {
        return "PushButton{" + "buttonState=" + buttonstate + '}';
    }
}
