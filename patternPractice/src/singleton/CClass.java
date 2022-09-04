package singleton;

public class CClass {
    SocketClient socketClient;
    public CClass(){
        socketClient = SocketClient.getInstance();
    }
    public SocketClient getSocketClient(){
        return socketClient;
    }
}
