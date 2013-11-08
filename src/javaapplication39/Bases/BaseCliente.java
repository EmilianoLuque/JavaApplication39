/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Bases;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.ArrayList;
import javaapplication39.Clases.Cliente;
/**
 *
 * @author Usuario Normal
 */
public class BaseCliente {
    public void insertCliente(Cliente nuevo){
        try{
            Connection con= BD.getIns();
            PreparedStatement smt= con.prepareStatement("Insert into cliente"+
                    " (dni,nombre,tel,dir,cod) values(?,?,?,?,?)");
            smt.setInt(1, nuevo.getDni());
            smt.setString(2, nuevo.getNomb());
            smt.setInt(3, nuevo.getTel());
            smt.setString(4, nuevo.getDir());
            smt.setInt(5, nuevo.getCod());
            smt.execute();
        }catch(SQLException a){
            System.out.println(a);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public void deleteCliente(int codigo){
        
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            smt.executeUpdate("Delete from cliente where cod ='"+codigo+"'");
            smt.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
    }
    public int buscarCodigo(int codigo){
        int ret=0;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet rs= smt.executeQuery("Select * from cliente where cod='"+codigo+"'");
            Cliente c= null;
            while(rs.next()){
                ret=1;
            }
            smt.close();
            rs.close();
            //return  ret;
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return  ret;
    }
    public int buscarDni(int dni){
        int ret=0;
        try{
            Connection cn= BD.getIns();
            Statement sm= cn.createStatement();
            ResultSet rs= sm.executeQuery("Select * from cliente where dni='"+dni+"'");
            while(rs.next()){
                if(dni== rs.getInt("dni")) ret=1;
            }
            sm.close();
            rs.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return ret;
    }
    public int codigoMayor(){
        int may=0;
        try{
            Connection cn= BD.getIns();
            Statement sm= cn.createStatement();
            ResultSet set= sm.executeQuery("Select max(cod) as maxcod from cliente");
            while(set.next()){
                if(set.getInt("maxcod")>may) may= set.getInt("maxcod");
            }
            set.close();
            sm.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return may;
    }
    public Collection buscarTodos(){
        ArrayList lista= new ArrayList();
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet rs= smt.executeQuery("Select * from cliente order by cod ASC");
            Cliente ayuda= null;
            while(rs.next()){
                ayuda= new Cliente();
                ayuda.setCod(rs.getInt("cod"));
                ayuda.setDir(rs.getString("dir"));
                ayuda.setDni(rs.getInt("dni"));
                ayuda.setNomb(rs.getString("nombre"));
                ayuda.setTel(rs.getInt("tel"));
                lista.add(ayuda);
            }
            smt.close();
            rs.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return lista;
    }
    public Cliente buscarCliente(int cod){
        Cliente ret= null;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet st= smt.executeQuery("Select * from cliente"
                    +" where cod='"+cod+"'");
            while(st.next()){
                ret= new Cliente();
                ret.setCod(st.getInt("cod"));
                ret.setDir(st.getString("dir"));
                ret.setDni(st.getInt("dni"));
                ret.setNomb(st.getString("nombre"));
                ret.setTel(st.getInt("tel"));
            }
            st.close();
            smt.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return ret;
    }
}
