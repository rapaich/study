public class Dachshund extends Dog {

    private String wool = "short";
    private byte length = 50;

    String getWool() {
        return wool;
    }
    void setWool(String wool) {
        if (wool.equals("long"))
            this.wool = "long";
    }

    byte getLength() {
        return length;
    }
    void setLength(byte length) {
        this.length = length;
    }

}
