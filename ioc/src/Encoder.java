public class Encoder {
    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;

    }
    public String encode(String msg){
        return iEncoder.encode(msg);
    }
}
