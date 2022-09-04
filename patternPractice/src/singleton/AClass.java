package singleton;

public class AClass {
    SocketClient socketClient;
    public AClass(){
        socketClient = SocketClient.getInstance();
    }
    public SocketClient getSocketClient(){
        return socketClient;
    }
}
