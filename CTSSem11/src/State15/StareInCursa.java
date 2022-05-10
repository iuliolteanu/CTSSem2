package State15;

public class StareInCursa implements Stare{
    @Override
    public void actualizeazaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareLaCapatDeLinie) {
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" a plecat in cursa");
            autobuz.setStare(this);
        }else {
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" NU poate pleca in cursa");
        }
    }
}
