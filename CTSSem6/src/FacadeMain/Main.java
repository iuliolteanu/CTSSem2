package FacadeMain;

import Facade.Autobuz;
import Facade.Facade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        Facade.deschideUsi(autobuz);
        Facade.lasaLiberUsi(autobuz);
    }
}
