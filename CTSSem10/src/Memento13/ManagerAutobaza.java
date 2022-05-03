package Memento13;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobaza {
    private List<MementoAutobuz> listaMemento;

    public ManagerAutobaza() {
        this.listaMemento = new ArrayList<>();
    }

    public void addMemento(MementoAutobuz memento) {
        this.listaMemento.add(memento);
    }

    public MementoAutobuz getMemento(int index) {
        return listaMemento.get(index);
    }
}
