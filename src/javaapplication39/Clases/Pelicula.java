/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Clases;

/**
 *
 * @author Usuario Normal
 */
public class Pelicula {
    private int codigo;
    private String genero;
    private String titulo;
    private String formato;
    private String autor;
    private int ejemplares;
    public Pelicula(){};
    public Pelicula(int cod, String gen, String tit, String form, String autor, int ejem){
        this.autor=autor;
        this.codigo=cod;
        this.ejemplares=ejem;
        this.formato=form;
        this.genero=gen;
        this.titulo=tit;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    
}
