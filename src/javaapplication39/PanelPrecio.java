/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaapplication39.Bases.BasePrecio;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario Normal
 */
public class PanelPrecio extends JPanel {
    BasePrecio bp= new BasePrecio();
    float pre= bp.getPrecio();
    JLabel preac= new JLabel("Precio Actual");
    JTextField preact= new JTextField(Float.toString(pre));
    JLabel prenue= new JLabel("Precio Nuevo");
    JTextField prenuet= new JTextField();
    JButton aceptar= new JButton("Aceptar");
    public PanelPrecio(){
        this.setLayout(null);
        this.setSize(995,465);
        this.setBackground(Color.getHSBColor(0.26f, 1f,0.5f));
        preac.setBounds(350,50,250,30);
        preac.setFont(new Font("Arial",Font.BOLD, 21));
        preac.setForeground(Color.BLACK);
        preact.setBounds(550,50,100,30);
        preact.setEditable(false);
        preact.setHorizontalAlignment(JTextField.RIGHT);
        prenue.setBounds(350,150,250,30);
        prenue.setFont(new Font("Arial",Font.BOLD, 21));
        prenue.setForeground(Color.BLACK);
        prenuet.setBounds(550,150,100,30);
        prenuet.setHorizontalAlignment(JTextField.RIGHT);
        aceptar.setBounds(460,250,100,30);
        aceptar.addActionListener(new Boton());
        this.add(aceptar);
        this.add(prenuet);
        this.add(prenue);
        this.add(preact);
        this.add(preac);
        this.setVisible(true);
    }
    private class Boton implements ActionListener{
        float a;
        @Override
        public void actionPerformed(ActionEvent e){
            if(prenuet.getText().equalsIgnoreCase(""))
                JOptionPane.showMessageDialog(null,"No ingreso ningún precio","Error",0);
            else{
                a= Float.parseFloat(prenuet.getText());
                bp.setPrecio(a);
                JOptionPane.showMessageDialog(null,"Precio modificado","Mensaje",1);
                preact.setText(Float.toString(a));
                prenuet.setText("");
            }
        }//action
    }///clase
}
