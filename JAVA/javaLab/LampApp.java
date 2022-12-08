class Lamp{
    boolean lampOn=false;
    void toggleLamp(){
        lampOn=!lampOn;
    }
    boolean getLampState(){
        return lampOn;
    }
    void reportStatus(){
        if(getLampState())
            System.out.println("the lamp is on");
        else
            System.out.println("the lamp is off");
    }
}
public class LampApp {

    
}
