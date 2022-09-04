package adapter;

public class AdpaterMain {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Airconditionor airconditionor = new Airconditionor();
        //Adapter를 통해서 220V 제품을 110V로 연결 가능
        ElectronicAdapter electronicAdapter = new ElectronicAdapter(airconditionor);
        connect(electronicAdapter);

        Cleaner cleaner = new Cleaner();
        ElectronicAdapter electronicAdapter2 = new ElectronicAdapter(cleaner);
        connect(electronicAdapter2);

    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.turnOn();
    }
}
