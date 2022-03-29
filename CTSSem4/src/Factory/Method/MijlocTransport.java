package Factory.Method;

public abstract class MijlocTransport {
    String nrInmatriculare;

    protected MijlocTransport(String nrInmatriculare){
        this.nrInmatriculare = nrInmatriculare;
    };
}
