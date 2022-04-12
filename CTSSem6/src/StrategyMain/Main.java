package StrategyMain;

import Strategy.PlatesteCardBancar;
import Strategy.PlatesteCardCalatorii;
import Strategy.PlatesteSMS;
import Strategy.Validator;

public class Main {
    public static void main(String[] args) {
        PlatesteCardBancar cardBancar = new PlatesteCardBancar();
        Validator validator = new Validator(new PlatesteCardCalatorii(), 100);
        validator.platesteCalatorie();
        validator.setModalitatePlata(cardBancar);
        validator.platesteCalatorie();
        Validator validator1 = new Validator(new PlatesteCardBancar(), 50);
        validator1.platesteCalatorie();
        Validator validator2 = new Validator(new PlatesteSMS(), 40);
        validator2.platesteCalatorie();
    }
}
