/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Clases;

/**
 *
 * @author Usuario Normal
 */
public class FechaEnt {
    String ds,ms,as;
    int d,m,a, mod=8;
    public FechaEnt(String q,String w, String e){
        this.ds=q;
        this.ms=w;
        this.as=e;
    }
    public String calc(){
        String fechaent=null;
        d= Integer.parseInt(ds);
        m= Integer.parseInt(ms);
        a= Integer.parseInt(as);
        if(m==1||m==3||m==5||m==7||m==8||m==10){
            if(d==31){
                ds="0"+Integer.toString(1);
                if(m<9) ms="0"+Integer.toString(m+1);
                else ms=Integer.toString(m+1);
            }
            else{
                if(d<9) ds="0"+Integer.toString(d+1);
                else ds=Integer.toString(d+1);
            }
        }//135810
        else{
            if(m==2){
                if(a%4==0){
                    mod=0;
                    if(a%100==0) mod=1;
                }
                if(a%400==0) mod=0;
                if(mod==0){
                    if(d==29){
                        ms="0"+Integer.toString(m+1);
                        ds="0"+Integer.toString(1);
                    }//29
                    else{
                        ms="0"+Integer.toString(m);
                        if(d<9) ds="0"+Integer.toString(d+1);
                        else ds=Integer.toString(d+1);
                    }//else
                }//mod
                else{
                    if(d==28){
                        ms="0"+Integer.toString(m+1);
                        ds="0"+Integer.toString(1);
                    }//28
                    else{
                        ms="0"+Integer.toString(m);
                        if(d<9) ds="0"+Integer.toString(d+1);
                        else ds=Integer.toString(d+1);
                    }//else
                }//else mod
            }//m==2
            if(m==12){
                if(d==31){
                    ms="01";
                    ds="01";
                    as=Integer.toString(a+1);
                }//de 31
                else{
                    if(d<9) ds="0"+Integer.toString(d+1);
                    else ds=Integer.toString(d+1);
                }//else
            }//m==12
            if(m==4||m==6||m==9||m==11){
                if(d==30){
                    ds="01";
                    if(m==9) ms="10";
                    else ms="0" +Integer.toString(m+1);
                }//30
                else{
                    if(d<9) ds="0"+Integer.toString(d+1);
                    else ds=Integer.toString(d+1);
                }//else
            }//469
        }//else
        fechaent=ds+"-"+ms+"-"+as;
        return fechaent;
    }
}
