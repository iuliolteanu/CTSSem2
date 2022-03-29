package Factory.Method;

public class MainFactoryMethod {
    public static void main(String[] args) {
        MijlocTransport autobuz = new AutobuzFactory().createObject("444");
        System.out.println(autobuz.toString());

        MijlocTransport tramvai = new TramvaiFactory().createObject("555");
        System.out.println(tramvai.toString());

        MijlocTransport troleibuz = new TroleibuzFactory().createObject("666");
        System.out.println(troleibuz.toString());
    }
}
