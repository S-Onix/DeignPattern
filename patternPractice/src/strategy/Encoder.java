package strategy;

public class Encoder {

    private EncodingStrategy encodingStrategy;

    public String getMessage(String messgae){
        return this.encodingStrategy.encode(messgae);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy){
        this.encodingStrategy = encodingStrategy;
    }

}
