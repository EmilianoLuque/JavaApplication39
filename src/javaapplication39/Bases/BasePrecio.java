/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Bases;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario Normal
 */
public class BasePrecio {
    public void setPrecio(float precionuevo){
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            smt.executeUpdate("Delete from precio ");
            smt.close();
            PreparedStatement psmt= con.prepareStatement("Insert into precio"
                    + " (pre) values(?)");
            psmt.setFloat(1, precionuevo);
            psmt.execute();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
    }
    public float getPrecio(){
        float pre=0;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select pre from precio");
            while(set.next())
                pre= set.getFloat("pre");
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return pre;
    }
}
