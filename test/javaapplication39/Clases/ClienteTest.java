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
public class ClienteTest {
    
    public ClienteTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testSetNomb() {
        Cliente nuevo= new Cliente("Luque Emiliano", "Chacabuco 89", 1234567, 37089182, 47);
        nuevo.setNomb("Roque Gomez");
        assertEquals("Roque Gomez", nuevo.getNomb());
    }
    @Test
    public void testSetDir() {
        Cliente nuevo= new Cliente("Luque Emiliano", "Chacabuco 89", 1234567, 37089182, 47);
        nuevo.setDir("Carlos Quiroga 3207");
        assertEquals("Carlos Quiroga 3207", nuevo.getDir());
    }
    @Test
    public void testSetTel() {
        Cliente nuevo= new Cliente("Luque Emiliano", "Chacabuco 89", 1234567, 37089182, 47);
        nuevo.setTel(4444170);
        assertEquals(4444170, nuevo.getTel());
        
    }
    @Test
    public void testSetDni() {
        Cliente nuevo= new Cliente("Luque Emiliano", "Chacabuco 89", 1234567, 37089182, 47);
        nuevo.setDni(37180089);
        assertEquals(37180089, nuevo.getDni());
    }
    @Test
    public void testGetNomb() {
        Cliente nuevo= new Cliente("Luque Emiliano", "Chacabuco 89", 1234567, 37089182, 47);
        assertEquals("Luque Emiliano", nuevo.getNomb());
    }
    @Test
    public void testGetDir() {
        Cliente nuevo= new Cliente("Luque Emiliano", "Chacabuco 89", 1234567, 37089182, 47);
        assertEquals("Chacabuco 89", nuevo.getDir());
    }
    @Test
    public void testGetTel() {
        Cliente nuevo= new Cliente("Luque Emiliano", "Chacabuco 89", 1234567, 37089182, 47);
        assertEquals(1234567, nuevo.getTel());
    }
    @Test
    public void testGetDni() {
        Cliente nuevo= new Cliente("Luque Emiliano", "Chacabuco 89", 1234567, 37089182, 47);
        assertEquals(37089182, nuevo.getDni());
    }
    @Test
    public void testGetCod() {
        Cliente nuevo= new Cliente("Luque Emiliano", "Chacabuco 89", 1234567, 37089182, 47);
        assertEquals(47, nuevo.getCod());
    }
    @Test
    public void testSetCod() {
        Cliente nuevo= new Cliente("Luque Emiliano", "Chacabuco 89", 1234567, 37089182, 47);
        nuevo.setCod(60);
        assertEquals(60, nuevo.getCod());
    }
}
