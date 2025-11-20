package bad_Example;

public class HomeController {

    private LightBulb lightBulb=new LightBulb();

    public void switchOnLights(){
        lightBulb.turnOn();
    }
//Start question to the next session is it possible to make the HomeController inherint the LightBulb clas
    //i don't speak its about the logic just as alternative for that line private LightBulb lightBulb = new LightBulb();
    //it's new thing to me that class use another class as a variable
}
