/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Clases;
/**
 *
 * @author Usuario Normal
 */
public class Alquiler {
    private int codclie;
    private String fecha_alquiler;
    private float monto;
    private String fecha_entrega;
    private int codalq;
    private int activo;
    public Alquiler(){
        this.activo=1;
    };
    public Alquiler(int codclie, String fa, float monto, String fe, int codalq){
        this.codclie= codclie;
        this.fecha_alquiler= fa;
        this.monto=monto;
        this.fecha_entrega=fe;
        this.codalq=codalq;
        this.activo=1;
    }
    public int getCodClie(){
        return codclie;
    }
    public String getFechaAlquiler(){
        return fecha_alquiler;
    }
    public float getMonto(){
        return monto;
    }
    public String getFechaEntrega(){
        return fecha_entrega;
    }
    public int getCodAlq(){
        return codalq;
    }
    public int getActivo(){
        return activo;
    }
    public void setCodClie(int cod){
        this.codclie=cod;
    }
    public void setFechaAlquiler(String fecha){
        this.fecha_alquiler=fecha;
    }
    public void setMonto(float mon){
        this.monto= mon;
    }
    public void setFechaEntrega(String fecha){
        this.fecha_entrega=fecha;
    }
    public void setCodAlq(int cod){
        this.codalq=cod;
    }
}
