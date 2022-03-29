package Factory.Familie;

public class Factory {
    public MijlocTransport createObject(TipTransport tip, String nr) {
        switch (tip) {
            case AUTOBUZ:
                return new Autobuz(nr);
            case TRAMVAI:
                return new Tramvai(nr);
            case TROLEIBUZ:
                return new Troleibuz(nr);
            default:
                return null;
        }
    }
}
