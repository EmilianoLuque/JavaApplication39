/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaapplication39.Bases.BaseRecaudado;
import javaapplication39.Clases.CompFecha;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario Normal
 */
public class Recaudado extends JPanel {
    JLabel multas= new JLabel("Recaudado por multas");
    JLabel alquileres= new JLabel("Recaudado por alquileres");
    JTextField multast= new JTextField();
    JTextField alquilerest= new JTextField();
    JLabel fecha= new JLabel("Fecha de Recaudación");
    JLabel dia= new JLabel("Día");
    JTextField diat= new JTextField();
    JLabel mes= new JLabel("Mes");
    JTextField mest= new JTextField();
    JLabel anio= new JLabel("Año");
    JTextField aniot= new JTextField();
    JButton aceptar= new JButton("Aceptar");
    public Recaudado(){
        this.setLayout(null);
        this.setSize(995,465);
        this.setBackground(Color.getHSBColor(0.47f, 1f,0.5f));
        fecha.setBounds(410,10,250,30);
        fecha.setFont(new Font("Arial",Font.BOLD, 21));
        fecha.setForeground(Color.BLACK);
        dia.setBounds(250,60,100,30);
        dia.setFont(new Font("Arial",Font.BOLD, 21));
        dia.setForeground(Color.BLACK);
        diat.setBounds(300,60,100,30);
        mes.setBounds(420,60,100,30);
        mes.setFont(new Font("Arial",Font.BOLD, 21));
        mes.setForeground(Color.BLACK);
        mest.setBounds(470,60,100,30);
        anio.setBounds(590,60,100,30);
        anio.setFont(new Font("Arial",Font.BOLD, 21));
        anio.setForeground(Color.BLACK);
        aniot.setBounds(640,60,100,30);
        aceptar.setBounds(470,110,100,30);
        aceptar.addActionListener(new Boton());
        alquileres.setBounds(330,170,270,30);
        alquileres.setFont(new Font("Arial",Font.BOLD, 21));
        alquileres.setForeground(Color.BLACK);
        alquilerest.setBounds(610,170,100,30);
        alquilerest.setEditable(false);
        alquilerest.setHorizontalAlignment(JTextField.RIGHT);
        multas.setBounds(330,220,270,30);
        multas.setFont(new Font("Arial",Font.BOLD, 21));
        multas.setForeground(Color.BLACK);
        multast.setBounds(610,220,100,30);
        multast.setEditable(false);
        multast.setHorizontalAlignment(JTextField.RIGHT);
        this.add(multast);
        this.add(multas);
        this.add(alquilerest);
        this.add(alquileres);
        this.add(aceptar);
        this.add(aniot);
        this.add(anio);
        this.add(mest);
        this.add(mes);
        this.add(diat);
        this.add(dia);
        this.add(fecha);
        this.setVisible(true);
    }
    private class Boton implements ActionListener{
        BaseRecaudado br= new BaseRecaudado();
        int ba=0;
        String msj;
        @Override
        public void actionPerformed(ActionEvent e){
            if(diat.getText().equalsIgnoreCase("")) ba=1;
            if(mest.getText().equalsIgnoreCase("")) ba=1;
            if(aniot.getText().equalsIgnoreCase("")) ba=1;
            if(ba==1)
                JOptionPane.showMessageDialog(null,"No completo todos lo campos","Error",0);
            else{
                String ds= diat.getText();
                String ms= mest.getText();
                String as= aniot.getText();
                CompFecha a= new CompFecha(ds, ms, as);
                int comp= a.comprobar();
                switch(comp){
                    case 1: msj="Día incorrecto";
                        break;
                    case 2: msj="Mes incorrecto";
                        break;
                    case 3: msj="Año Incorrecto";
                        break;
                }
                if(comp!=0)
                    JOptionPane.showMessageDialog(null,msj,"Error",0);
                else{
                    String fec=ds+"-"+ms+"-"+as;
                    float al= br.recAlqui(fec);
                    alquilerest.setText(Float.toString(al));
                    float mu= br.recMul(fec);
                    multast.setText(Float.toString(mu));
                }//else
            }//ootro else
        }//action
    }//clase
}
