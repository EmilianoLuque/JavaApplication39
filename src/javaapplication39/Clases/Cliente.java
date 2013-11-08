/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Clases;

/**
 *
 * @author Usuario Normal
 */
public class Cliente {
    private int cod;
    private String nomb;
    private String dir;
    private int tel;
    private int dni;
    public Cliente(){};
    public Cliente(String nomb, String dir, int t, int dn, int cod){
        this.nomb=nomb;
        this.dir=dir;
        this.tel=t;
        this.dni=dn;
        this.cod=cod;
    }
    public void setNomb(String n){
        this.nomb=n;
    }
    public void setDir(String d){
        this.dir=d;
    }
    public void setTel(int t){
        this.tel=t;
    }
    public void setDni(int dn){
        this.dni=dn;
    }
    public String getNomb(){
        return nomb;
    }
    public String getDir(){
        return dir;
    }
    public int getTel(){
        return tel;
    }
    public int getDni(){
        return dni;
    }
    public int getCod(){
        return cod;
    }
    public void setCod(int cod){
        this.cod=cod;
    }
}
