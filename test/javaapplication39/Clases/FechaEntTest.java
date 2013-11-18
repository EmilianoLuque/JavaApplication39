/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Clases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario Normal
 */
public class FechaEntTest {
    
    public FechaEntTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testCalc() {
        FechaEnt a= new FechaEnt("18", "11", "2013");
        assertEquals("19-11-2013",a.calc());
        FechaEnt a2= new FechaEnt("31", "12", "2013");
        assertEquals("01-01-2014",a2.calc());
        FechaEnt a3= new FechaEnt("30", "11", "2013");
        assertEquals("01-12-2013",a3.calc());
        FechaEnt a4= new FechaEnt("28", "02", "2013");
        assertEquals("01-03-2013",a4.calc());
        FechaEnt a5= new FechaEnt("28", "02", "2016");
        assertEquals("29-02-2016",a5.calc());
        FechaEnt a6= new FechaEnt("31", "10", "2013");
        assertEquals("01-11-2013",a6.calc());
    }
}
