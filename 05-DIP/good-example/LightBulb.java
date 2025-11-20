package good_Example;

public class LightBulb implements SmartDevice{

    @Override
    public void turnOn(){
        System.out.println("LightBulb is ON");

    }

    @Override
    public void turnOff(){
        System.out.println("LightBulb is Off");
    }


}
