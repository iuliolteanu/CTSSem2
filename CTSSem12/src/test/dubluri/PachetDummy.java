package test.dubluri;

import agentie.IPachetTuristic;
import agentie.PachetTuristic;
import ase.acs.clase.IPersoana;

public class PachetDummy implements IPachetTuristic {
    PachetTuristic pachetTuristic;

    @Override
    public boolean poateRezerva() {
        return pachetTuristic.poateRezerva();
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return pachetTuristic.getPret();
    }
}
