/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import javaapplication39.Paneles.Fecha;
import javaapplication39.Paneles.PanelAlqui;
import javaapplication39.Paneles.PanelCliente;
import javaapplication39.Paneles.PanelPeli;
import javax.swing.JPanel;

/**
 *
 * @author Usuario Normal
 */
public class PanelAlquiler extends JPanel{
    PanelAlqui ap= new PanelAlqui();
    PanelCliente cp= new PanelCliente(ap);
    Fecha fp= new Fecha(ap);
    PanelPeli pp= new PanelPeli(fp,ap);
    public PanelAlquiler(){
        this.setLayout(null);
        cp.setBounds(0, 0, 497, 232);
        fp.setBounds(497, 0, 498, 232);
        pp.setBounds(0, 232, 497, 232);
        ap.setBounds(497, 232, 498, 232);
        this.add(cp);
        this.add(fp);
        this.add(pp);
        this.add(ap);
        this.setVisible(true);
    }
}
