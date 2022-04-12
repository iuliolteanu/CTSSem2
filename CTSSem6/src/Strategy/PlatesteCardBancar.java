package Strategy;

public class PlatesteCardBancar implements ModalitatePlata{

    @Override
    public void plateste(float SumaDePlata) {
        System.out.println("S-a platit prin card bancar suma de " + SumaDePlata + " lei");

    }
}
