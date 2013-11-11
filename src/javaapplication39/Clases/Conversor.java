/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Clases;

/**
 *
 * @author Usuario Normal
 */
public class Conversor {
    private String d,m,a, da, ma, fecha;
    private int di,mi,ai;
    public Conversor(String ds, String ms, String as){
        this.d=ds;
        this.m=ms;
        this.a=as;
        di= Integer.parseInt(d);
        mi= Integer.parseInt(m);
        if(di<10) da="0"+Integer.toString(di);
        else da= Integer.toString(di);
        if(mi<10) ma="0"+Integer.toString(mi);
        else ma=Integer.toString(mi);
        fecha=da+"-"+ma+"-"+a;
    }
    public String getMa(){
        return ma;
    }
    public String getDa(){
        return da;
    }
    public String getFecha(){
        return fecha;
    }
}
