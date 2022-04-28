package ObserverMain;

import Observer.Autobuz;
import Observer.Observer;
import Observer.Subiect;
import Observer.Calator;

public class Main {
    public static void main(String[] args) {
        Subiect autobuz = new Autobuz(32);

        Observer calator1 = new Calator("Alexandru");
        Observer calator2 = new Calator("Mihai");
        Observer calator3 = new Calator("George");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.notificareCalator();
        autobuz.adaugaCalator(calator3);
        autobuz.stergeCalator(calator1);
        autobuz.notificareCalator();

    }
}
