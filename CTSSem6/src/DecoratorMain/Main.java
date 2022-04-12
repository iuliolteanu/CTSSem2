package DecoratorMain;

import Decorator.DecoratorAbstract;
import Decorator.DecoratorConcret;
import Decorator.PrintBilet;
import Decorator.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrintBilet();
        printer.print();

        DecoratorAbstract decoratorAbstract = new DecoratorConcret(printer, "La multi ani CTS");
        decoratorAbstract.print();
        decoratorAbstract.printeazaMesaj();
    }
}
