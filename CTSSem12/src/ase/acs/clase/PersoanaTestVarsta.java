package ase.acs.clase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTestVarsta {
    private Persoana persoana;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getVarstaRight() {
        persoana = new Persoana("Iuliana", "6001001134121");
        int varsta = persoana.getVarsta();
        assertEquals(21, varsta);
    }

    @Test
    public void getVarstaBoundary1800() {
        persoana = new Persoana("Iuliana", "3000112343212");
        int varsta = persoana.getVarsta();
        assertEquals(222, varsta);
    }

    @Test
    public void getVarstaBoundary1900() {
        persoana = new Persoana("Iuliana", "3991231343212");
        int varsta = persoana.getVarsta();
        assertEquals(122, varsta);
    }

    //@Test
    public void getVarstaBoundaryZiCurenta() {
        persoana = new Persoana("Iuliana", "5220517343212");
        int varsta = persoana.getVarsta();
        assertEquals(0, varsta);
    }

    @Test
    public void getVarstaBoundaryZiUrmatoare() {
        persoana = new Persoana("Iuliana", "5040518343212");
        int varsta = persoana.getVarsta();
        assertEquals(17, varsta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getVarstaErrorConditionVarsta() {
        persoana = new Persoana("Iuliana", "5220518343212");
        int varsta = persoana.getVarsta();
    }

    @Test(expected = NullPointerException.class)
    public void getVarstaErrorCondition() {
        persoana = new Persoana("Iuliana", null);
        int varsta = persoana.getVarsta();
    }

    @Test
    public void getVarstaPerformance() {
        persoana = new Persoana("Iuliana", "6001001134121");
        int varsta = persoana.getVarsta();
    }

    @Test
    public void getVarstaOrder() {
        persoana = new Persoana("Iuliana", "6001001134121");
        Persoana persoana2 = new Persoana("Dan", "6011203134121");
        assertTrue(persoana.getVarsta()>persoana2.getVarsta());
    }
}