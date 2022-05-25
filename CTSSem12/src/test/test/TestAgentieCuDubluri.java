package test.test;

import agentie.AgentieTurism;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.categorii.CategorieBoundary;
import test.categorii.CategorieUtilizareFake;
import test.dubluri.PachetDummy;
import test.dubluri.PachetFake;

import static org.junit.Assert.assertEquals;

public class TestAgentieCuDubluri {
    @Test
    public void testAdaugaPachet(){
        PachetDummy pachetDummy = new PachetDummy();
        AgentieTurism agentieTurism = new AgentieTurism();

        agentieTurism.adaugaPachet(pachetDummy);
        assertEquals(1, agentieTurism.getNrPacheteTuristice());
    }

    @Test
    public void testCalculeazaPretTotal(){
        PachetFake pachetFake1 = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();

        pachetFake1.setValoareGetPret(1000);
        pachetFake2.setValoareGetPret(2000);

        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);

        assertEquals(3000, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testInverseazaCalculeazaPretTotal(){
        PachetFake pachetFake1 = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();

        pachetFake1.setValoareGetPret(1000);
        pachetFake2.setValoareGetPret(800);

        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);

        double total = agentieTurism.calculareSumaTotalaPachete();
        assertEquals(pachetFake1.getPret(), total - pachetFake2.getPret(), 0.01);
    }

    @Test
    @Category(CategorieBoundary.class)
    public void testBoundaryCalculeazaPretTotal(){
        AgentieTurism agentieTurism = new AgentieTurism();
        assertEquals(0, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

    @Test(timeout = 100)
    @Category(CategorieUtilizareFake.class)
    public void testPerformanceCalculeazaPretTotal(){
        AgentieTurism agentieTurism = new AgentieTurism();
        for (int i = 0; i < 100; i++){
            PachetFake pachetFake = new PachetFake();
            pachetFake.setValoareGetPret(1000);
            agentieTurism.adaugaPachet(pachetFake);
        }
        double suma = agentieTurism.calculareSumaTotalaPachete();
    }

}
