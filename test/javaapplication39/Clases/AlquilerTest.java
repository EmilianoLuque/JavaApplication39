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
public class AlquilerTest {
    
    public AlquilerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testGetCodClie() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        assertEquals(1, nuevo.getCodClie());
    }
    @Test
    public void testGetFechaAlquiler() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        assertEquals("10-08-2013", nuevo.getFechaAlquiler());
    }
    @Test
    public void testGetMonto() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        assertEquals(7.5f, nuevo.getMonto(),0f);
    }
    @Test
    public void testGetFechaEntrega() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        assertEquals("11-08-2013", nuevo.getFechaEntrega());
    }
    @Test
    public void testGetCodAlq() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        assertEquals(3, nuevo.getCodAlq());
    }
    @Test
    public void testGetActivo() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        assertEquals(1, nuevo.getActivo());
    }
    @Test
    public void testSetCodClie() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        nuevo.setCodClie(2);
        assertEquals(2, nuevo.getCodClie());
    }
    @Test
    public void testSetFechaAlquiler() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        nuevo.setFechaAlquiler("25-08-2013");
        assertEquals("25-08-2013", nuevo.getFechaAlquiler());
    }
    @Test
    public void testSetMonto() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        nuevo.setMonto(8.9f);
        assertEquals(8.9f, nuevo.getMonto(),0f);
    }
    @Test
    public void testSetFechaEntrega() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        nuevo.setFechaEntrega("30-08-2013");
        assertEquals("30-08-2013", nuevo.getFechaEntrega());
    }
    @Test
    public void testSetCodAlq() {
        Alquiler nuevo = new Alquiler(1, "10-08-2013", 7.5f, "11-08-2013", 3);
        nuevo.setCodAlq(8);
        assertEquals(8, nuevo.getCodAlq());
    }
}
