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
public class CalcularMultaTest {
    
    public CalcularMultaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of calcular method, of class CalcularMulta.
     */
    @Test
    public void testCalcular() {
        CalcularMulta cm1= new CalcularMulta("16-05-2013","16-05-2013");
        assertEquals(0, cm1.calcular());
        CalcularMulta cm2= new CalcularMulta("16-05-2013","18-05-2013");
        assertEquals(2, cm2.calcular());
        CalcularMulta cm3= new CalcularMulta("01-05-2013","01-06-2013");
        assertEquals(31, cm3.calcular());
        CalcularMulta cm4= new CalcularMulta("31-12-2013","01-01-2014");
        assertEquals(0, cm4.calcular());
        CalcularMulta cm5= new CalcularMulta("28-02-2013","01-03-2013");
        assertEquals(1, cm5.calcular());
        CalcularMulta cm6= new CalcularMulta("28-02-2016","01-03-2016");
        assertEquals(2, cm6.calcular());
        CalcularMulta cm7= new CalcularMulta("31-12-2013","02-01-2014");
        assertEquals(0, cm7.calcular());
    }
}
