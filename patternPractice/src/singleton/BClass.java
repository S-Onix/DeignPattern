package singleton;

public class BClass {
    SocketClient socketClient;
    public BClass(){
        socketClient = SocketClient.getInstance();
    }
    public SocketClient getSocketClient(){
        return socketClient;
    }
}
