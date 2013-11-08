/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Bases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Usuario Normal
 */
public class BD {
    private static Connection ins=null;
    public static Connection getIns() throws ClassNotFoundException,SQLException{
        if(ins==null){
            String url="jdbc:postgresql://127.0.0.1:5432/Lab";
            String driver="org.postgresql.Driver";
            String user="postgres";
            String pass="quepuedeser";
            Class.forName(driver);
            ins= DriverManager.getConnection(url, user, pass);
        }
        return ins;
    }
}
