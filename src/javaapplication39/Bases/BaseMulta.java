/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Bases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaapplication39.Clases.Multa;

/**
 *
 * @author Usuario Normal
 */
public class BaseMulta {
    public void agregar(Multa nueva){
        try{
            Connection con= BD.getIns();
            PreparedStatement smt= con.prepareStatement("Insert into multa"
                    + " (codclie, monto, activa, fpago, codmulta) values (?,?,?,?,?)");
            smt.setInt(1, nueva.getCod());
            smt.setFloat(2,nueva.getMonto());
            smt.setInt(3,1);
            smt.setString(4,"");
            smt.setInt(5, nueva.getCodMul());
            smt.execute();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
    }
    public void cancelar(int cod){
        try{
            Connection con= BD.getIns();
            PreparedStatement smt= con.prepareStatement("Update multa set "
                    + " activa=0 where codclie="+cod);
            smt.execute();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
    }
    public Multa buscar(int cod){
        Multa nueva=null;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from multa where"
                    + "activa=1 and codclie="+cod);
            while(set.next()){
                nueva= new Multa();
                nueva.setCod(set.getInt("codclie"));
                nueva.setMont(set.getFloat("monto"));
                nueva.setCodMul(set.getInt("codmulta"));
            }
            set.close();
            smt.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return nueva;
    }
    public int codMayor(){
        int ret=0;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select max(codmulta) as maxi from multa");
            while(set.next())
                if(ret<set.getInt("maxi")) ret= set.getInt("maxi");
            smt.close();
            set.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return ret;
    }
}
