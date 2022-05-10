package StateMain;

import State15.Autobuz;
import State15.Stare;
import State15.StareInCursa;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz(120);
        autobuz.pleacaInCursa();
        autobuz.ieseDinService();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.intraInService();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.ieseDinService();
    }
}
