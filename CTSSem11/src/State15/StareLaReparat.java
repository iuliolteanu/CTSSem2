package State15;

public class StareLaReparat implements Stare{
    @Override
    public void actualizeazaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareLaCapatDeLinie) {
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" este la reparat");
            autobuz.setStare(this);
        }else {
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" NU poate intra in service");
        }
    }
}
