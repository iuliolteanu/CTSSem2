package Prototype;

public class Autobuz implements MijlocTransport {

    private String numeSofer;

    public Autobuz(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }
}
