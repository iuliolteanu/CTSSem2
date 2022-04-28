package TemplateMethodMain;

import TemplateMethod.Tramvai;
import TemplateMethod.TramvaiProbe;

public class Main {
    public static void main(String[] args) {
        Tramvai tramvai = new Tramvai();
        tramvai.parcurgeTraseu();
        tramvai.parcurgeTraseuInvers();
    }
}
