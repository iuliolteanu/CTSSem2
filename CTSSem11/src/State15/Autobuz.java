package State15;

public class Autobuz {
    private int nrAutobuz;
    private Stare stare;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        stare = new StareLaCapatDeLinie();
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void pleacaInCursa() {
        StareInCursa inCursa = new StareInCursa();
        inCursa.actualizeazaStare(this);
    }

    public void intraInService() {
        new StareLaReparat().actualizeazaStare(this);
    }

    public void ieseDinService() {
        new StareLaCapatDeLinie().actualizeazaStare(this);
    }

    public void ajungeLaCapatDeLinie() {
        new StareLaCapatDeLinie().actualizeazaStare(this);
    }
}
