package Proxy;

public class Autobuz implements MijlocTransport{

    private String numeSofer;
    private int nrLocuri;
    private int nrCalatori;

    public int getNrCalatori() {
        return nrCalatori;
    }

    public Autobuz(String numeSofer, int nrLocuri, int nrCalatori) {
        this.numeSofer = numeSofer;
        this.nrLocuri = nrLocuri;
        this.nrCalatori = nrCalatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", nrCalatori=").append(nrCalatori);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit in statie cu " + this.nrCalatori + " calatori");
    }
}
