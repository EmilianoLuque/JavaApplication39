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
import javaapplication39.Clases.Conversor;
import javaapplication39.Clases.FechaEnt;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario Normal
 */
public class Fecha extends JPanel{
    JLabel fechaac= new JLabel("Fecha actual");
    JTextField dac= new JTextField("");
    JTextField mac= new JTextField("");
    JTextField aac= new JTextField("");
    JButton aceptaract= new JButton("Aceptar");
    JLabel fechaen= new JLabel("Fecha entrega");
    JTextField de= new JTextField("");
    JTextField me= new JTextField("");
    JTextField ae= new JTextField("");
    JButton aceptaren= new JButton("Aceptar");
    String fechaent, fechact;
    PanelAlqui ap= new PanelAlqui();
    public Fecha(){}
    public Fecha(PanelAlqui e){
        this.ap=e;
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
        me.setBounds(250, 141, 50, 21);
        me.setHorizontalAlignment(2);
        ae.setBounds(350, 141, 50, 21);
        ae.setHorizontalAlignment(2);
        aceptaren.setBounds(230, 180, 100, 21);
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
        int bandera=0;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==aceptaract){
                if(dac.getText().equalsIgnoreCase("")) bandera=1;
                if(mac.getText().equalsIgnoreCase("")) bandera=1;
                if(aac.getText().equalsIgnoreCase("")) bandera=1;
                if(bandera==0){
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
                        Conversor con= new Conversor(ds,ms,as);
                        FechaEnt comp= new FechaEnt(ds, ms, as);
                        String fecha= comp.calc();
                        String den=fecha.substring(0,2);
                        String men= fecha.substring(3, 5);
                        String aen= fecha.substring(6);
                        de.setText(den);
                        me.setText(men);
                        ae.setText(aen);
                        dac.setText(con.getDa());
                        mac.setText(con.getMa());
                        fechact= con.getFecha();
                        ap.fechact=fechact;
                    }
                }
                else{
                    bandera=0;
                    JOptionPane.showMessageDialog(null, "Campo Incompleto","Error", 0);
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
                    Conversor confin= new Conversor(des, mes,aes);
                    de.setText(confin.getDa());
                    me.setText(confin.getMa());
                    fechaent= confin.getFecha();
                    ap.fech.setText(fechaent);
                    ap.fechent=fechaent;
                }
            }
        }
        
    }
}
