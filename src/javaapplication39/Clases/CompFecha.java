/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Clases;

/**
 *
 * @author Usuario Normal
 */
public class CompFecha {
    private int d,m,a;
    public CompFecha(String ds, String ms, String as){
        this.d=Integer.parseInt(ds);
        this.m=Integer.parseInt(ms);
        this.a=Integer.parseInt(as);
    }
    public int comprobar(){
        int ret=0, band=0;
        
        if(a<2013) ret=3;
        if(a%4==0){
            band=1;
            if(a%100==0) band=0;
        }
        if(a%400==0) band=1;
        if(m<1||m>12) ret=2;
        if(m==2){
            if(band==1){
                if(d<1||d>29) ret=1;
            }
            else{
                if(d<1||d>28) ret=1;
            }
                
        }//m=2
        if(m==4||m==6||m==9||m==11)
                if(d<1||d>30) ret=1;
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
            if(d<1||d>31) ret=1;
        return ret;
    }
}
