package ProxyMain;

import Proxy.Autobuz;
import Proxy.AutobuzNoapte;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Popescu", 50, 23);
        autobuz.opresteInStatie();

        Autobuz autobuz1 = new Autobuz("Popescu", 50, 0);
        autobuz1.opresteInStatie();
        AutobuzNoapte autobuzNoapte = new AutobuzNoapte(autobuz1);
        autobuzNoapte.opresteInStatie();
    }
}
