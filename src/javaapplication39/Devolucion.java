/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario Normal
 */
public class Devolucion extends JPanel {
    JPanel cliente= new JPanel();
    JPanel codigo= new JPanel();
    JPanel cabeza= new JPanel();
    ScrollPane lista= new ScrollPane();
    JLabel cliecod= new JLabel("Codigo de Cliente");
    JTextField cliecodt= new JTextField();
    JButton buscar= new JButton("Buscar");
    JLabel ccod= new JLabel("Cliente");
    JLabel cfecha= new JLabel("Fecha");
    JLabel cmonto= new JLabel("Monto");
    JLabel ccodalq= new JLabel("Codigo del Alquiler");
    public Devolucion(){
        this.setLayout(null);
        cliecod.setBounds(20, 10, 150, 30);
        cliecod.setFont(new Font("Arial", Font.PLAIN,14));
        cliecod.setForeground(Color.black);
        cliecodt.setBounds(10, 50, 120, 30);
        buscar.setBounds(20,90,100,30);
        ccod.setFont(new Font("Arial", Font.PLAIN,21));
        ccod.setForeground(Color.black);
        ccod.setBounds(10,0,100,30);
        cabeza.add(ccod);
        cliente.add(buscar);
        cliente.add(cliecodt);
        cliente.add(cliecod);
        cliente.setLayout(null);
        cliente.setBackground(Color.red);
        cliente.setBounds(0,0,150,465);
        cabeza.setLayout(null);
        cabeza.setBackground(Color.blue);
        cabeza.setBounds(150,0,850,30);
        lista.setBackground(Color.darkGray);
        lista.setBounds(150,30,850,395);
        codigo.setLayout(null);
        codigo.setBounds(150,395,850,70);
        codigo.setBackground(Color.green);
        this.add(codigo);
        this.add(lista);
        this.add(cabeza);
        this.add(cliente);
    }
}
