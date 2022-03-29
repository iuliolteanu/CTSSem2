package main;

import Factory.Familie.Autobuz;
import Factory.Familie.Factory;
import Factory.Familie.MijlocTransport;
import Factory.Familie.TipTransport;
import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s);
        System.out.println(s2);
    }
}
