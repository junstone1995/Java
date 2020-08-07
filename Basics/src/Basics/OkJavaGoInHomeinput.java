package Basics;
import javax.swing.JOptionPane;

import Basics.iot.DimmingLights;
import Basics.iot.Elevator;
import Basics.iot.Lighting;
import Basics.iot.Security;

public class OkJavaGoInHomeinput{
    public static void main(String[] args) {

        String id = JOptionPane.showInputDialog("Enter a ID");
        String bright = JOptionPane.showInputDialog("Enter a Bright level");
        //Elevator call
         Elevator myElevator = new Elevator(id);
         myElevator.callForUp(1);
        //Security off
        Security mySecurity = new Security(id);
        mySecurity.off();
        //Light on
        Lighting hallLamp = new Lighting(id + "/ Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id+"/ floor Lamp");
        floorLamp.on();
        DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
    }
}