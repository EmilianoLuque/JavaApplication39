/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Bases;
import javaapplication39.Clases.Alquiler;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.ArrayList;
/**
 *
 * @author Usuario Normal
 */
public class BaseAlquiler {
    public void agregar(Alquiler nuevo){
        try{
            Connection con= BD.getIns();
            PreparedStatement smt= con.prepareStatement("Insert into alquiler"+
                    "(codclie,fecha_alq,monto,fecha_ent,codalq,activo)"+
                    "values(?,?,?,?,?,?)");
            smt.setInt(1, nuevo.getCodClie());
            smt.setString(2, nuevo.getFechaAlquiler());
            smt.setFloat(3, nuevo.getMonto());
            smt.setString(4, nuevo.getFechaEntrega());
            smt.setInt(5, nuevo.getCodAlq());
            smt.setInt(6, nuevo.getActivo());
            smt.execute();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
    }
    public int codigoMayor(){
        int may=0;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet rs= smt.executeQuery("Select * from alquiler order by codalq DESC");
            while(rs.next())
                if(rs.getInt("codalq")>may) may=rs.getInt("codalq");
            rs.close();
            smt.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return may;
    }
    public void desactivo(int cod){
        try{
            Connection con= BD.getIns();
            PreparedStatement sm= con.prepareStatement("Update alquiler set "+
                    "activo=0 where codalq='"+cod+"'");
            sm.execute();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
    }
    public Collection buscarTodos(){
        ArrayList lista= new ArrayList();
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet rs= smt.executeQuery("Select * from alquiler where activo='1'");
            Alquiler ayuda=null;
            while(rs.next()){
                ayuda= new Alquiler();
                ayuda.setCodClie(rs.getInt("codclie"));
                ayuda.setFechaAlquiler(rs.getString("fecha_alq"));
                ayuda.setMonto(rs.getInt("monto"));
                ayuda.setFechaEntrega(rs.getString("fecha_ent"));
                ayuda.setCodAlq(rs.getInt("codalq"));
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
    public Alquiler buscar(int cod){
        Alquiler nuevo=null;
        try{
            Connection con= BD.getIns();
            Statement sm= con.createStatement();
            ResultSet set= sm.executeQuery("Select * from alquiler"+
                    " where codalq='"+cod+"' and activo='1'");
            while(set.next()){
                nuevo= new Alquiler();
                nuevo.setCodClie(set.getInt("codclie"));
                nuevo.setFechaAlquiler(set.getString("fecha_alq"));
                nuevo.setMonto(set.getInt("monto"));
                nuevo.setFechaEntrega(set.getString("fecha_ent"));
                nuevo.setCodAlq(set.getInt("codalq"));
            }
            sm.close();
            set.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return nuevo;
    }
    public Collection buscarPorCliente(int cod){
        ArrayList lista=new ArrayList();
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from alquiler "
                    +"where codclie='"+cod+"' and activo='1'");
            Alquiler nuevo;
            while(set.next()){
                nuevo= new Alquiler();
                nuevo.setCodAlq(set.getInt("codalq"));
                nuevo.setCodClie(cod);
                nuevo.setFechaAlquiler(set.getString("fecha_alq"));
                nuevo.setFechaEntrega(set.getString("fecha_ent"));
                nuevo.setMonto(set.getInt("monto"));
                lista.add(nuevo);
            }
            set.close();
            smt.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return lista;
    }
    public Collection buscarPorFecha(String fecha){
        ArrayList lista=new ArrayList();
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from alquiler "
                    +"where fecha_alq='"+fecha+"'");
            Alquiler nuevo;
            while(set.next()){
                nuevo= new Alquiler();
                nuevo.setCodAlq(set.getInt("codalq"));
                nuevo.setCodClie(set.getInt("codclie"));
                nuevo.setFechaAlquiler(set.getString("fecha_alq"));
                nuevo.setFechaEntrega(set.getString("fecha_ent"));
                nuevo.setMonto(set.getFloat("monto"));
                lista.add(nuevo);
            }
            smt.close();
            set.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return lista;
    }
}
