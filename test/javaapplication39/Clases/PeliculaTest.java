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
public class PeliculaTest {
    
    public PeliculaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Test
    public void testGetCodigo() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        assertEquals(5,a.getCodigo());
    }
    @Test
    public void testSetCodigo() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        a.setCodigo(8);
        assertEquals(8,a.getCodigo());
    }
    @Test
    public void testGetGenero() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        assertEquals("Acción", a.getGenero());
    }
    @Test
    public void testSetGenero() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        a.setGenero("Comedia");
        assertEquals("Comedia", a.getGenero());
    }
    @Test
    public void testGetTitulo() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        assertEquals("Kill Bill", a.getTitulo());
    }
    @Test
    public void testSetTitulo() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        a.setTitulo("Paranorman");
        assertEquals("Paranorman", a.getTitulo());
        
    }
    @Test
    public void testGetFormato() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        assertEquals("DVD", a.getFormato());
    }
    @Test
    public void testSetFormato() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        a.setFormato("Blu-Ray");
        assertEquals("Blu-Ray", a.getFormato());
    }
    @Test
    public void testGetAutor() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        assertEquals("Tarantino", a.getAutor());
    }
    @Test
    public void testSetAutor() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        a.setAutor("Cameron");
        assertEquals("Cameron", a.getAutor());
    }
    @Test
    public void testGetEjemplares() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        assertEquals(1, a.getEjemplares());
    }
    @Test
    public void testSetEjemplares() {
        Pelicula a= new Pelicula(5, "Acción", "Kill Bill", "DVD", "Tarantino", 1);
        a.setEjemplares(60);
        assertEquals(60, a.getEjemplares());
    }
}
