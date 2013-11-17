/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Bases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaapplication39.Clases.Alquiler;

/**
 *
 * @author Usuario Normal
 */
public class BaseRecaudado {
    public float recAlqui(String fecha){
        float rec=0;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from alquiler where "
                    + "fecha_alq='"+fecha+"'");
            while(set.next()){
                rec= rec+ set.getFloat("monto");
            }
            smt.close();
            set.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return rec;
    }
    public float recMul(String fecha){
        float rec=0;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from multa where "
                    + "fpago='"+fecha+"'");
            while(set.next()){
                rec= rec+ set.getFloat("monto");
            }
            smt.close();
            set.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return rec;
    }
}
