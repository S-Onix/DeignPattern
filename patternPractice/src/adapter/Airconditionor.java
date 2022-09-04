package adapter;

public class Airconditionor implements Electronic220V{
    @Override
    public void turnOn() {
        System.out.println("AirCon Turn on in 220V");
    }
}
