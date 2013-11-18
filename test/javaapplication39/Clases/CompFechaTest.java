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
public class CompFechaTest {
    
    public CompFechaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testComprobar() {
        CompFecha a1= new CompFecha("18","11","2013");
        assertEquals(0, a1.comprobar());
        CompFecha a2= new CompFecha("42","11","2013");
        assertEquals(1, a2.comprobar());
        CompFecha a3= new CompFecha("18","24","2013");
        assertEquals(2, a3.comprobar());
        CompFecha a4= new CompFecha("18","11","2005");
        assertEquals(3, a4.comprobar());
        CompFecha a5= new CompFecha("29","02","2016");
        assertEquals(0, a5.comprobar());
        CompFecha a6= new CompFecha("29","02","2014");
        assertEquals(1, a6.comprobar());
        CompFecha a7= new CompFecha("31","11","2013");
        assertEquals(1, a7.comprobar());
    }
}
