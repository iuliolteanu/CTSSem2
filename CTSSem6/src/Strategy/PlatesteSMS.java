package Strategy;

public class PlatesteSMS implements ModalitatePlata {

    @Override
    public void plateste(float SumaDePlata) {
        System.out.println("S-a platit prin SMS suma de " + SumaDePlata + " lei");
    }
}
