/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Clases;

/**
 *
 * @author Usuario Normal
 */
public class Alquilada {
    private int codalq;
    private int codpeli;
    private int activo;
    private String fecha;
    public Alquilada(){
        this.activo=1;
    }
    public Alquilada(int codalq, int codpeli, String fecha){
        this.codalq=codalq;
        this.codpeli=codpeli;
        this.activo=1;
        this.fecha= fecha;
    }
    public void setCodAlq(int cod){
        this.codalq=cod;
    }
    public void setCodPeli(int cod){
        this.codpeli=cod;
    }
    public void setFech(String fecha){
        this.fecha=fecha;
    }
    public int getCodAlq(){
        return codalq;
    }
    public int getCodPeli(){
        return codpeli;
    }
    public int getActivo(){
        return activo;
    }
    public String getFecha(){
        return fecha;
    }
}
