package Strategy;

public class Validator {
    private ModalitatePlata modalitatePlata;
    private float sumaDePlata;

    public void setModalitatePlata(ModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public Validator(ModalitatePlata modalitatePlata, float sumaDePlata) {
        this.modalitatePlata = modalitatePlata;
        this.sumaDePlata = sumaDePlata;
    }

    public void platesteCalatorie() {
        modalitatePlata.plateste(sumaDePlata);
    }
}
