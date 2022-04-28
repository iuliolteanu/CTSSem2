package Observer;

public class Autobuz extends Subiect{
    private int nrLinie;

    public Autobuz(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void notificareCalator() {
        for(Observer calator:calatori){
            calator.primesteMesaj("Autobuzul 383 a plecat de la capat de linie.");
        }
    }
}
