package adapter;

public class Cleaner implements Electronic220V{
    @Override
    public void turnOn() {
        System.out.println("Cleaner Turn on in 220V");
    }
}
