package good_Example;

public class Thermostat implements SmartDevice{

    @Override
    public void turnOn() {
        System.out.println("Thermostat is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is Off");
    }
}

