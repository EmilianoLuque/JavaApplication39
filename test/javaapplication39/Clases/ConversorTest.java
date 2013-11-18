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
public class ConversorTest {
    
    public ConversorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testGetMa() {
        Conversor a= new Conversor("18","6","2013");
        assertEquals("06", a.getMa());
        Conversor a2= new Conversor("18","11","2013");
        assertEquals("11", a2.getMa());
    }
    @Test
    public void testGetDa() {
        Conversor a= new Conversor("5","11","2013");
        assertEquals("05", a.getDa());
        Conversor a2= new Conversor("18","11","2013");
        assertEquals("18", a2.getDa());
    }
    @Test
    public void testGetFecha() {
        Conversor a= new Conversor("5","6","2013");
        assertEquals("05-06-2013", a.getFecha());
        Conversor a2= new Conversor("18","11","2013");
        assertEquals("18-11-2013", a2.getFecha());
    }
}
