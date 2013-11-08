/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Paneles;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaapplication39.Clases.CompFecha;
import javaapplication39.Clases.FechaEnt;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario Normal
 */
public class Fecha extends JPanel{
    JLabel fechaac= new JLabel("Fecha actual");
    JTextField dac= new JTextField("Día");
    JTextField mac= new JTextField("Mes");
    JTextField aac= new JTextField("Año");
    JButton aceptaract= new JButton("Aceptar");
    JLabel fechaen= new JLabel("Fecha entrega");
    JTextField de= new JTextField();
    JTextField me= new JTextField();
    JTextField ae= new JTextField();
    JButton aceptaren= new JButton("Aceptar");
    String fechaent, fechact;
    public Fecha(){
        fechaac.setBounds(220, 10, 200, 21);
        fechaac.setForeground(Color.black);
        fechaac.setFont(new Font("Arial",Font.BOLD, 20));
        dac.setBounds(150, 41, 50, 21);
        dac.setHorizontalAlignment(2);
        mac.setBounds(250, 41, 50, 21);
        mac.setHorizontalAlignment(2);
        aac.setBounds(350, 41, 50, 21);
        aac.setHorizontalAlignment(2);
        aceptaract.setBounds(230, 80, 100, 21);
        aceptaract.addActionListener(new Botonfecha());
        fechaen.setBounds(215, 110, 200, 21);
        fechaen.setForeground(Color.black);
        fechaen.setFont(new Font("Arial",Font.BOLD, 20));
        de.setBounds(150, 141, 50, 21);
        de.setHorizontalAlignment(2);
        de.setEditable(false);
        me.setBounds(250, 141, 50, 21);
        me.setHorizontalAlignment(2);
        me.setEditable(false);
        ae.setBounds(350, 141, 50, 21);
        ae.setHorizontalAlignment(2);
        ae.setEditable(false);
        aceptaren.setBounds(230, 180, 100, 21);
        aceptaren.setEnabled(false);
        aceptaren.addActionListener(new Botonfecha());
        this.add(aceptaren);
        this.add(me);
        this.add(ae);
        this.add(de);
        this.add(aceptaract);
        this.add(fechaen);
        this.add(aac);
        this.add(mac);
        this.add(dac);
        this.add(fechaac);
        this.setLayout(null);
        this.setBackground(Color.getHSBColor(0.8f, 0.5f, 0.5f));
        this.setVisible(true);
    }
    public class Botonfecha implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==aceptaract){
                String ds= dac.getText();
                String ms= mac.getText();
                String as= aac.getText();
                CompFecha com= new CompFecha(ds, ms, as);
                int b=com.comprobar();
                if(b==1){
                    JOptionPane.showMessageDialog(null, "Día incorrecto",
                            "Error", 0);
                }
                if(b==2){
                    JOptionPane.showMessageDialog(null, "Mes incorrecto",
                            "Error", 0);
                }
                if(b==3){
                    JOptionPane.showMessageDialog(null, "Año incorrecto",
                            "Error", 0);
                }
                if(b==0){
                    //guardo en fechaac
                    FechaEnt comp= new FechaEnt(ds, ms, as);
                    String fecha= comp.calc();
                    String den=fecha.substring(0,2);
                    String men= fecha.substring(3, 5);
                    String aen= fecha.substring(6);
                    de.setText(den);
                    de.setEditable(true);
                    me.setText(men);
                    me.setEditable(true);
                    ae.setText(aen);
                    ae.setEditable(true);
                    dac.setEditable(false);
                    mac.setEditable(false);
                    aac.setEditable(false);
                    aceptaract.setEnabled(false);
                    aceptaren.setEnabled(true);
                }
            }
            if(e.getSource()==aceptaren){
                int ba=0;
                String des= de.getText();
                String mes= me.getText();
                String aes= ae.getText();
                CompFecha aux= new CompFecha(des,mes,aes);
                ba=aux.comprobar();
                if(ba==1){
                    JOptionPane.showMessageDialog(null, "Día incorrecto",
                            "Error", 0);
                }
                if(ba==2){
                    JOptionPane.showMessageDialog(null, "Mes incorrecto",
                            "Error", 0);
                }
                if(ba==3){
                    JOptionPane.showMessageDialog(null, "Año incorrecto",
                            "Error", 0);
                }
                if(ba==0){
                    //guardo en fechaent
                    de.setEditable(false);
                    me.setEditable(false);
                    ae.setEditable(false);
                    aceptaren.setEnabled(false);
                }
            }
        }
        
    }
}
