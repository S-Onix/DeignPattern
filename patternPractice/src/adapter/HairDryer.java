package adapter;

public class HairDryer implements Electronic110V{
    @Override
    public void turnOn() {
        System.out.println("Hair Dryer Turn on in 110V");
    }
}
