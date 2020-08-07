package Basics;
import Basics.iot.Elevator;
import Basics.iot.Lighting;
import Basics.iot.Security;

public class OkJavaGoInHome{
    public static void main(String[] args) {

        String id = "JAVA APT 507";
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

    }
}