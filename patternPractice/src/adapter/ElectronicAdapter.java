package adapter;

public class ElectronicAdapter implements Electronic110V{
    private Electronic220V electronic220V;

    public ElectronicAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    @Override
    public void turnOn() {
        electronic220V.turnOn();
    }
}
