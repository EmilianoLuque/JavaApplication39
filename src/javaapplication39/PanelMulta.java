/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario Normal
 */
public class PanelMulta extends JPanel {
    JLabel codclie = new JLabel("Codigo de Cliente");
    JTextField codcliet= new JTextField("");
    JButton cliente= new JButton("Buscar");
    JLabel codmul= new JLabel("Codigo de Multa");
    JTextField codmult= new JTextField();
    JButton multa= new JButton("Baja");
    JPanel datos= new JPanel();
    public PanelMulta(){
        this.setLayout(null);
        this.setSize(995,465);
        codclie.setFont(new Font("Arial",Font.PLAIN,21));
        codclie.setForeground(Color.black);
        codclie.setBounds(50, 100, 180, 30);
        codcliet.setBounds(250, 100, 100, 30);
        datos.add(codcliet);
        datos.add(codclie);
        datos.setLayout(null);
        datos.setBounds(0, 0, 497, 465);
        datos.setBackground(Color.getHSBColor(0.54f, .5f, .5f));
        this.add(datos);
        this.setVisible(true);
    }
}
