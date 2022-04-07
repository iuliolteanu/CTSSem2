package Builder;

public class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textRulat;
    private String model;
    private int nrCalatori;

    public AutobuzLinie() {
        this.nrLinie = 1;
        this.numeSofer = "Andrei";
        this.deschideUsile = true;
        this.areOprire = true;
        this.textRulat = "Welcome";
        this.model = "Renault";
        this.nrCalatori = 60;
    }

    void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    void setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
    }

    void setTextRulat(String textRulat) {
        this.textRulat = textRulat;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", deschideUsile=").append(deschideUsile);
        sb.append(", areOprire=").append(areOprire);
        sb.append(", textRulat='").append(textRulat).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrCalatori=").append(nrCalatori);
        sb.append('}');
        return sb.toString();
    }
}
