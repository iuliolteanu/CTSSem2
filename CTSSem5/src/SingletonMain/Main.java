package SingletonMain;

import Prototype.Autobuz;
import Prototype.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        //Prototype
        Autobuz autobuz = new Autobuz("Dorian");

        try {
            MijlocTransport autobuz1 = autobuz.copiaza();
            System.out.println(autobuz.toString() + "\n" + autobuz1.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
