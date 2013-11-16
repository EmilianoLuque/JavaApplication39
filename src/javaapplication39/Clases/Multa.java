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
    private int activo, codmulta;
    private String fpago="";
    public Multa(){
        this.activo=1;
    }
    public Multa(int cod, float mon, int codm){
        this.codclie= cod;
        this.monto=mon;
        this.activo=1;
        this.codmulta= codm;
    }
    public void setMont(float mon){
        this.monto= mon;
    }
    public void setCod(int cod){
        this.codclie= cod;
    }
    public void setCodMul(int cod){
        this.codmulta=cod;
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
    public int getCodMul(){
        return codmulta;
    }
}
