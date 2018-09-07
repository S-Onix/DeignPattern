package singleton;

public class SingletonEx {
    private static SingletonEx singleton = new SingletonEx();

    private SingletonEx(){

    }

    static SingletonEx getInstance(){
        return singleton;
    }
}
