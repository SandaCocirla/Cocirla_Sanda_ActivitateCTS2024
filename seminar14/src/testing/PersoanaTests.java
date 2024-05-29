package testing;

import model.IPersoana;
import model.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTests {

    @org.junit.Test
    public void testGetSex(){
        IPersoana persoana1 = new Persoana("Mihai","502");
        assertEquals("M",persoana1.getSex());
    }
    @org.junit.Test
    public void testGetSexFeminin(){
        IPersoana persoana1 = new Persoana("Alin","202");
        assertEquals("F",persoana1.getSex());
    }

    @org.junit.Test
    public void testGetBoundariesMin(){
        IPersoana persoana1 = new Persoana("Mihai","102");
        assertEquals("M",persoana1.getSex());
    }

    @org.junit.Test
    public void testGetBoundariesMax(){
        IPersoana persoana1 = new Persoana("Alin","602");
        assertEquals("F",persoana1.getSex());
    }

    @org.junit.Test
    public void testCrossCHeck(){
        Persoana persoana1 = new Persoana("Alin","002");
        int cifra = persoana1.CNP.charAt(0);
        String caracter = (cifra%2==0? "F":"M");
        assertEquals(caracter,persoana1.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testErrorGetSex(){
        Persoana persoana1 = new Persoana("Mihai","002");
        persoana1.getSex();
    }

    @Test
    public void testOrderSex(){
        Persoana persoana1 = new Persoana("Mihai","502");
        Persoana persoana2 = new Persoana("Alin","602");
        assertTrue(persoana1.getSex().compareTo(persoana2.getSex())>0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExistenceSex(){
        Persoana persoana1 = new Persoana("Mihai",null);
        persoana1.getSex();
    }

}
