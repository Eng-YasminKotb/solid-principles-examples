package good_Example;

public class HomeController {

    private final SmartDevice device;

    public HomeController(SmartDevice device){
        this.device=device;
    }

    public void switchOnDevice(){
        device.turnOn();
    }

    public void switchOffDevice(){
        device.turnOff();
    }



}
