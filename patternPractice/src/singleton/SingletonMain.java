package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        AClass a = new AClass();
        BClass b = new BClass();
        CClass c = new CClass();

        System.out.println(a.getSocketClient().equals(b.getSocketClient()));
        System.out.println(a.getSocketClient().equals(c.getSocketClient()));
    }

}
