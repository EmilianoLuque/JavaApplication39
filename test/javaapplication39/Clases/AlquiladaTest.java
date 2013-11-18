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
public class AlquiladaTest {
    public AlquiladaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testSetCodAlq() {
        Alquilada nueva= new Alquilada(5,2,"16-05-2013");
        nueva.setCodAlq(1);
        assertEquals(1, nueva.getCodAlq());
    }
    @Test
    public void testSetCodPeli() {
        Alquilada nueva= new Alquilada(5,2,"16-05-2013");
        nueva.setCodPeli(1);
        assertEquals(1, nueva.getCodPeli());
    }
    @Test
    public void testSetFech() {
        Alquilada nueva= new Alquilada(5,2,"16-05-2013");
        nueva.setFech("30-08-2013");
        assertEquals("30-08-2013", nueva.getFecha());
    }
    public void testGetCodAlq() {
        Alquilada nueva= new Alquilada(5,2,"16-05-2013");
        assertEquals(5,nueva.getCodAlq());
    }
    @Test
    public void testGetCodPeli() {
        Alquilada nueva= new Alquilada(5,2,"16-05-2013");
        assertEquals(2,nueva.getCodPeli());
    }
    @Test
    public void testGetActivo() {
        Alquilada nueva= new Alquilada(5,2,"16-05-2013");
        assertEquals(1,nueva.getActivo());
    }
    @Test
    public void testGetFecha() {
        Alquilada nueva= new Alquilada(5,2,"16-05-2013");
        assertEquals("16-05-2013",nueva.getFecha());
    }
}
