/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Clases;

/**
 *
 * @author Usuario Normal
 */
public class Multa {
    private float monto;
    private int codclie;
    private int activo;
    public Multa(){
        this.activo=1;
    }
    public Multa(int cod, float mon){
        this.codclie= cod;
        this.monto=mon;
        this.activo=1;
    }
    public void setMont(float mon){
        this.monto= mon;
    }
    public void setCod(int cod){
        this.codclie= cod;
    }
    public float getMonto(){
        return monto;
    }
    public int getCod(){
        return codclie;
    }
    public int getActivo(){
        return activo;
    }
}
