package ChainOfResponsibility12;

public abstract class Handler {
    Handler nextHandler;
    protected int limita;

    public Handler(int limita) {
        this.nextHandler = null;
        this.limita = limita;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void afisareRecomandare(int distanta);
}
