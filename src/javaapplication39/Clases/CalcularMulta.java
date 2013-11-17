/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Clases;

/**
 *
 * @author Usuario Normal
 */
public class CalcularMulta {
    private String fechaent, fechaact;
    public CalcularMulta(String fe, String fa){
        this.fechaent=fe;
        this.fechaact=fa;
    }
    public int calcular(){
        int multa=0,i, b=0;
        if(!fechaent.equalsIgnoreCase(fechaact)){
            String des=fechaent.substring(0,2);
            String mes= fechaent.substring(3, 5);
            String aes= fechaent.substring(6);
            int de= Integer.parseInt(des);
            int me= Integer.parseInt(mes);
            int ae= Integer.parseInt(aes);
            String das=fechaact.substring(0,2);
            String mas= fechaact.substring(3, 5);
            String aas= fechaact.substring(6);
            int da= Integer.parseInt(das);
            int ma= Integer.parseInt(mas);
            int aa= Integer.parseInt(aas);
            if(ae==aa){
                if(me==ma){
                    multa= multa+da-de;
                }//me==ma
                else{
                    for(i=me;i<ma;i++){
                        if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) multa= multa+31;
                        if(i==2){
                            if(aa%4==0) b=1;
                            if(aa%100==0) b=0;
                            if(aa%400==0) b=1;
                            if(b==1) multa= multa+29;
                            else multa= multa+28;
                        }
                        if(i==4||i==6||i==9||i==11) multa= multa+30;
                    }//for
                }//else
            }//ae==aa
            else{
                if(me==1||me==3||me==5||me==7||me==8||me==10||me==12)
                    multa= multa+31-de;
                if(me==2){
                    if(ae%4==0) b=1;
                    if(ae%100==0) b=0;
                    if(ae%100==0) b=1;
                    if(b==1) multa= multa+29-de;
                    else multa= multa+28-de;
                }//me==2
                if(me==4||me==6||me==9||me==11)multa= multa+30-de;
                for(i=me+1;i<12;i++){
                    if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) multa= multa+31;
                    if(i==2){
                        if(ae%4==0) b=1;
                        if(ae%100==0) b=0;
                        if(ae%400==0) b=1;
                        if(b==1) multa= multa+29;
                        else multa= multa+28;
                    }
                    if(i==4||i==6||i==9||i==11) multa= multa+30;
                }//for
                for(i=1; i<ma;i++){
                    if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) multa= multa+31;
                    if(i==2){
                        if(aa%4==0) b=1;
                        if(aa%100==0) b=0;
                        if(aa%400==0) b=1;
                        if(b==1) multa= multa+29;
                        else multa= multa+28;
                    }
                    if(i==4||i==6||i==9||i==11) multa= multa+30;
                }
                multa= multa+da;
            }//else año
        }
        return multa;
    }
}
