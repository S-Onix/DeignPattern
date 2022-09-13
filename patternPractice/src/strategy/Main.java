package strategy;

public class Main {

    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        EncodingStrategy base64 = new Base64Strategy();
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello world";
        encoder.setEncodingStrategy(base64);
        System.out.println(encoder.getMessage(message));

        encoder.setEncodingStrategy(normal);
        System.out.println(encoder.getMessage(message));
    }
}
