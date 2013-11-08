/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Usuario Normal
 */
public class GestionVentana extends WindowAdapter{
    @ Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
