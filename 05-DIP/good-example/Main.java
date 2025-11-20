import good_Example.HomeController;
import good_Example.LightBulb;
import good_Example.Thermostat;

public class Main {
    public static void main(String[] args) {
        HomeController homeController1=new HomeController(new LightBulb());

        homeController1.switchOnDevice();

        HomeController homeController2=new HomeController(new Thermostat());

        homeController2.switchOffDevice();
    }
}