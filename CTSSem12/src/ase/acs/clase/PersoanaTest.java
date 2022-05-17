package ase.acs.clase;

import static org.junit.Assert.*;

public class PersoanaTest {
    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void getSex() {
        persoana = new Persoana("Iuliana", "2222222222222");
        String sex = persoana.getSex();
        assertEquals("F", sex);
    }

    @org.junit.Test
    public void getSexBoundary() {
        persoana = new Persoana("Iuliana", "5222222222222");
        String sex = persoana.getSex();
        assertEquals("M", sex);
    }

    @org.junit.Test
    public void getSexCrossCheck() {
        persoana = new Persoana("Iuliana", "6001001134121");
        int primaCifra = persoana.CNP.charAt(0);
        String sex = persoana.getSex();
        int cifra;
        if (sex == "M") {
            cifra = 1;
        }
        else {
            cifra = 2;
        }
        assertEquals(cifra % 2 == 1, primaCifra % 2 == 1);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition() {
        persoana = new Persoana("Iuliana", "0001001134121");
        String sex = persoana.getSex();
    }

    @org.junit.Test(timeout = 10)
    public void getSexPerformance() {
        persoana = new Persoana("Iuliana", "6001001134121");
        String sex = persoana.getSex();
    }

    @org.junit.Test
    public void getSexOutputFormat() {
        persoana = new Persoana("Iuliana", "6001001134121");
        String sex = persoana.getSex();
        assertEquals(1, sex.length());
    }

    @org.junit.Test
    public void getSexRangeBetween1800and1899() {
        persoana = new Persoana("Iuliana", "3001001134121");
        String sex = persoana.getSex();
        assertEquals("M", sex);
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistence() {
        persoana = new Persoana("Iuliana", null);
        String sex = persoana.getSex();
    }
}