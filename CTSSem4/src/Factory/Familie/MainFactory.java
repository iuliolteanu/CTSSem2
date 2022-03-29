package Factory.Familie;

public class MainFactory {
    public static void main(String[] args) {
        Factory fabrica = new Factory();
        MijlocTransport a = fabrica.createObject(TipTransport.AUTOBUZ, "B100");
        MijlocTransport b = fabrica.createObject(TipTransport.TRAMVAI, "B200");
        MijlocTransport c = fabrica.createObject(TipTransport.TROLEIBUZ, "B300");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
