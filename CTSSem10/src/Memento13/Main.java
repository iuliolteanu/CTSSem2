package Memento13;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("John", 11.7, 40, "Audi", 2010);
        System.out.println(autobuz.toString());

        ManagerAutobaza manager = new ManagerAutobaza();
        manager.addMemento(autobuz.creeazaMemento());

        autobuz.setNumeSofer("Mihai");
        autobuz.setConsumMediu(13.5);

        manager.addMemento(autobuz.creeazaMemento());
        System.out.println(autobuz.toString());

        autobuz.setNumeSofer("Eugen");
        System.out.println(autobuz.toString());

        autobuz.restaurareMemento(manager.getMemento(0));
        System.out.println(autobuz.toString());
    }
}

