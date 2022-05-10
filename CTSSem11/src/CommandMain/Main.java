package CommandMain;

import Command16.Autobuz;
import Command16.ComandaPlecareTraseu;
import Command16.Command;
import Command16.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz1 = new Autobuz("bmw");
        Autobuz autobuz2 = new Autobuz("audi");

        ComandaPlecareTraseu comandaPlecareTraseu = new ComandaPlecareTraseu(1, autobuz1);
        operator.invoca(comandaPlecareTraseu);

        operator.invoca(new ComandaPlecareTraseu(2, autobuz2));
        operator.invoca(new ComandaPlecareTraseu(3, autobuz1));
        operator.invoca(new ComandaPlecareTraseu(4, autobuz1));
        operator.invoca(new ComandaPlecareTraseu(2, autobuz2));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
