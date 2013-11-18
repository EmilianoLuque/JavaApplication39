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
public class MultaTest {
    
    public MultaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testSetMont() {
        Multa a= new Multa(4, 7.5f, 8);
        a.setMont(8.5f);
        assertEquals(8.5f, a.getMonto(),0f);
    }
    @Test
    public void testSetCod() {
        Multa a= new Multa(4, 7.5f, 8);
        a.setCod(6);
        assertEquals(6, a.getCod());
    }
    @Test
    public void testSetCodMul() {
        Multa a= new Multa(4, 7.5f, 8);
        a.setCodMul(15);
        assertEquals(15, a.getCodMul());
    }
    @Test
    public void testGetMonto() {
        Multa a= new Multa(4, 7.5f, 8);
        assertEquals(7.5f, a.getMonto(),0f);
    }
    @Test
    public void testGetCod() {
        Multa a= new Multa(4, 7.5f, 8);
        assertEquals(4, a.getCod());
    }
    @Test
    public void testGetActivo() {
        Multa a= new Multa(4, 7.5f, 8);
        assertEquals(1, a.getActivo());
    }
    @Test
    public void testGetCodMul() {
        Multa a= new Multa(4, 7.5f, 8);
        assertEquals(8, a.getCodMul());
    }
}
