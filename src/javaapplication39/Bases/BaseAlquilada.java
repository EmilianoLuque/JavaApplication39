/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Bases;
import javaapplication39.Clases.Alquilada;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Collection;
import java.util.ArrayList;
/**
 *
 * @author Usuario Normal
 */
public class BaseAlquilada {
    public void agregar(Alquilada nueva){
        try{
            Connection con= BD.getIns();
            PreparedStatement smt= con.prepareStatement("Insert into alquiladas"
                    +"(codalq,codpeli,activo,fecha) values (?,?,?,?)");
            smt.setInt(1, nueva.getCodAlq());
            smt.setInt(2, nueva.getCodPeli());
            smt.setInt(3, nueva.getActivo());
            smt.setString(4, nueva.getFecha());
            smt.execute();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
    }
    public void desactivo(int cod){
        try{
            Connection con= BD.getIns();
            PreparedStatement smt= con.prepareStatement("Update alquiladas set"
                    +" activo='0' where codalq='"+cod+"'");
            smt.execute();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
    }
    public int buscar(int cod){//para saber si tengo stock
        int tot=0;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from alquiladas "
                    +"where codpeli='"+cod+"' AND activo='1'");
            while(set.next())
                tot++;
            smt.close();
            set.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return tot;
    }
    public Collection buscarAlquiler(int cod){
        ArrayList todas= new ArrayList();
        try{
            Connection con = BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from alquiladas "
                    + "where activo='1' AND codalq='"+cod+"'");
            Alquilada nueva;
            while(set.next()){
                nueva= new Alquilada();
                nueva.setCodAlq(set.getInt("codalq"));
                nueva.setCodPeli(set.getInt("codpeli"));
                nueva.setFech(set.getString("fecha"));
                todas.add(nueva);
            }
            smt.close();
            set.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return todas;
    }
    
}
