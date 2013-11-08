/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Bases;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Collection;
import java.util.ArrayList;
import javaapplication39.Clases.Pelicula;

/**
 *
 * @author Usuario Normal
 */
public class BasePelicula {
    public void agregarPelicula(Pelicula nueva){
        try{
            Connection con= BD.getIns();
            PreparedStatement smt= con.prepareStatement("Insert into pelicula"+
                    "(cod,genero,titulo,formato,autor,ejemplares) values(?,?,?,?,?,?)");
            smt.setInt(1,nueva.getCodigo());
            smt.setString(2, nueva.getGenero());
            smt.setString(3, nueva.getTitulo());
            smt.setString(4, nueva.getFormato());
            smt.setString(5, nueva.getAutor());
            smt.setInt(6,nueva.getEjemplares());
            smt.execute();
        }catch(SQLException a){
            System.out.println(a);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public int codigoMayor(){
        int may=0;
        try{
            Connection con= BD.getIns();
            Statement sm= con.createStatement();
            ResultSet set= sm.executeQuery("Select max(cod) as maxcod from pelicula");
            while(set.next()){
                if(set.getInt("maxcod") >may) may= set.getInt("maxcod");
            }
            sm.close();
            set.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return may;
    }
    public Pelicula buscarPelicula(int cod){
        Pelicula nueva= null;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from pelicula where cod='"+cod+"'");
            while(set.next()){
                nueva= new Pelicula();
                nueva.setAutor(set.getString("autor"));
                nueva.setCodigo(set.getInt("cod"));
                nueva.setEjemplares(set.getInt("ejemplares"));
                nueva.setFormato(set.getString("formato"));
                nueva.setGenero(set.getString("genero"));
                nueva.setTitulo(set.getString("titulo"));
            }
            smt.close();
            set.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return nueva;
    }
    public Collection buscarTodas(){
        ArrayList lista= new ArrayList();
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from pelicula order by cod ASC");
            Pelicula nueva=null;
            while(set.next()){
                nueva= new Pelicula();
                nueva.setAutor(set.getString("autor"));
                nueva.setCodigo(set.getInt("cod"));
                nueva.setEjemplares(set.getInt("ejemplares"));
                nueva.setFormato(set.getString("formato"));
                nueva.setGenero(set.getString("genero"));
                nueva.setTitulo(set.getString("titulo"));
                lista.add(nueva);
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
    public int comprobarPeli(int cod){
        int ret=0;
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from pelicula where"
                    +" cod='"+cod+"'");
            while(set.next())
                ret=1;
            set.close();
            smt.close();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException a){
            System.out.println(a);
        }
        return ret;
    }
    public Collection buscarTodasTit(){
        ArrayList lista= new ArrayList();
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from pelicula order by titulo ASC");
            Pelicula nueva=null;
            while(set.next()){
                nueva= new Pelicula();
                nueva.setAutor(set.getString("autor"));
                nueva.setCodigo(set.getInt("cod"));
                nueva.setEjemplares(set.getInt("ejemplares"));
                nueva.setFormato(set.getString("formato"));
                nueva.setGenero(set.getString("genero"));
                nueva.setTitulo(set.getString("titulo"));
                lista.add(nueva);
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
    public Collection buscarTodasGen(){
        ArrayList lista= new ArrayList();
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from pelicula order by genero ASC");
            Pelicula nueva=null;
            while(set.next()){
                nueva= new Pelicula();
                nueva.setAutor(set.getString("autor"));
                nueva.setCodigo(set.getInt("cod"));
                nueva.setEjemplares(set.getInt("ejemplares"));
                nueva.setFormato(set.getString("formato"));
                nueva.setGenero(set.getString("genero"));
                nueva.setTitulo(set.getString("titulo"));
                lista.add(nueva);
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
    public Collection buscarTodasEjem(){
        ArrayList lista= new ArrayList();
        try{
            Connection con= BD.getIns();
            Statement smt= con.createStatement();
            ResultSet set= smt.executeQuery("Select * from pelicula order by ejemplares ASC");
            Pelicula nueva=null;
            while(set.next()){
                nueva= new Pelicula();
                nueva.setAutor(set.getString("autor"));
                nueva.setCodigo(set.getInt("cod"));
                nueva.setEjemplares(set.getInt("ejemplares"));
                nueva.setFormato(set.getString("formato"));
                nueva.setGenero(set.getString("genero"));
                nueva.setTitulo(set.getString("titulo"));
                lista.add(nueva);
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
