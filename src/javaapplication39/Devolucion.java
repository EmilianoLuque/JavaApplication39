/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javaapplication39.Bases.BaseAlquilada;
import javaapplication39.Bases.BaseAlquiler;
import javaapplication39.Bases.BaseCliente;
import javaapplication39.Bases.BasePelicula;
import javaapplication39.Clases.Alquilada;
import javaapplication39.Clases.Alquiler;
import javaapplication39.Clases.Cliente;
import javaapplication39.Clases.Pelicula;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario Normal
 */
public class Devolucion extends JPanel {
    JPanel cliente= new JPanel();
    JPanel codigo= new JPanel();
    JPanel cabeza= new JPanel();
    ScrollPane lista;
    JLabel fa= new JLabel("Fecha Actual");
    JLabel cliecod= new JLabel("Codigo de Cliente");
    JTextField cliecodt= new JTextField("");
    JButton buscar= new JButton("Buscar");
    JLabel ccod= new JLabel("Codigo de Alquiler");
    JLabel cpeli= new JLabel("Pelicula");
    JLabel cfecha= new JLabel("Fecha");
    JLabel ccliente= new JLabel("Cliente");
    JLabel dia= new JLabel("Día");
    JTextField diat= new JTextField("");
    JLabel mes= new JLabel("Mes");
    JTextField mest= new JTextField("");
    JLabel anio= new JLabel("Año");
    JTextField aniot= new JTextField("");
    JLabel alq= new JLabel("Alquiler");
    JTextField alqt= new JTextField("");
    JButton fe= new JButton("Aceptar");
    JButton al= new JButton("Retornar");
    public Devolucion(){
        this.setLayout(null);
        cliecod.setBounds(20, 10, 150, 30);
        cliecod.setFont(new Font("Arial", Font.PLAIN,14));
        cliecod.setForeground(Color.black);
        cliecodt.setBounds(10, 50, 120, 30);
        buscar.setBounds(20,90,100,30);
        buscar.addActionListener(new BotonCodigo(this));
        ccod.setFont(new Font("Arial", Font.PLAIN,21));
        ccod.setForeground(Color.black);
        ccod.setBounds(10,0,200,30);
        cpeli.setFont(new Font("Arial", Font.PLAIN,21));
        cpeli.setForeground(Color.black);
        cpeli.setBounds(210,0,100,30);
        cfecha.setFont(new Font("Arial", Font.PLAIN,21));
        cfecha.setForeground(Color.black);
        cfecha.setBounds(410,0,100,30);
        ccliente.setFont(new Font("Arial", Font.PLAIN,21));
        ccliente.setForeground(Color.black);
        ccliente.setBounds(610,0,200,30);
        fa.setFont(new Font("Arial", Font.BOLD,14));
        fa.setForeground(Color.black);
        fa.setBounds(10,15,100,30);
        dia.setFont(new Font("Arial", Font.BOLD,14));
        dia.setForeground(Color.black);
        dia.setBounds(110,15,50,30);
        diat.setBounds(150,15,50,30);
        diat.setEditable(false);
        mes.setFont(new Font("Arial", Font.BOLD,14));
        mes.setForeground(Color.black);
        mes.setBounds(210,15,50,30);
        mest.setBounds(250,15,50,30);
        mest.setEditable(false);
        anio.setFont(new Font("Arial", Font.BOLD,14));
        anio.setForeground(Color.black);
        anio.setBounds(310,15,50,30);
        aniot.setBounds(350,15,50,30);
        aniot.setEditable(false);
        fe.setBounds(410, 15, 100, 31);
        fe.setEnabled(false);
        alq.setBounds(530,15,100,31);
        alq.setForeground(Color.BLACK);
        alq.setFont(new Font("Arial",Font.BOLD,14));
        alqt.setBounds(600,15,100,31);
        alqt.setEditable(false);
        al.setBounds(720,15,100,31);
        al.setEnabled(false);
        codigo.add(al);
        codigo.add(alqt);
        codigo.add(alq);
        codigo.add(fe);
        codigo.add(fa);
        codigo.add(aniot);
        codigo.add(anio);
        codigo.add(mest);
        codigo.add(mes);
        codigo.add(diat);
        codigo.add(dia);
        cabeza.add(ccliente);
        cabeza.add(cfecha);
        cabeza.add(cpeli);
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
        //lista.setBackground(Color.darkGray);
        //lista.setBounds(150,30,850,395);
        codigo.setLayout(null);
        codigo.setBounds(150,395,850,70);
        codigo.setBackground(Color.green);
        this.setBackground(Color.darkGray);
        this.add(codigo);
        //this.add(lista);
        this.add(cabeza);
        this.add(cliente);
    }
    public class BotonCodigo implements ActionListener{
        BaseAlquiler ba= new BaseAlquiler();
        BaseAlquilada bal= new BaseAlquilada();
        BaseCliente bc= new BaseCliente();
        BasePelicula bp= new BasePelicula();
        ArrayList todos= new ArrayList();
        ArrayList pelis= new ArrayList();
        JTable tabla;
        JPanel setear= new JPanel();
        JScrollPane scroll= new JScrollPane();
        public BotonCodigo(JPanel algo){
            this.setear= algo;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            String cods= cliecodt.getText();
            if(cods.equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null,"Campo incompleto!","Error",0);
            }
            else{
                int codint= Integer.parseInt(cods);
                todos=(ArrayList) ba.buscarPorCliente(codint);
                if(todos.isEmpty()){
                    JOptionPane.showMessageDialog(null,"No hay ningún alquiler "
                            + "para ese cliente.","Mensaje",1);
                }
                else{
                    String columnas[]={"Codigo de Alquiler","Pelicula","Fecha","Cliente"};
                    Object datos[][]= new Object[columnas.length][];
                    Alquiler ayuda;
                    Cliente ayudaclie;
                    for(int i=0; i<todos.size();i++){
                        ayuda= new Alquiler();
                        ayuda=(Alquiler) todos.get(i);
                        ayudaclie= bc.buscarCliente(ayuda.getCodAlq());
                        String NOMBclie= ayudaclie.getNomb();
                        int CODalq= ayuda.getCodAlq();
                        pelis=(ArrayList)bal.buscarAlquiler(CODalq);
                        Alquilada help;
                        Pelicula pel;
                        System.out.println("assadasd");
                        for(int x=0; x<pelis.size();x++){
                            help= new Alquilada();
                            System.out.println("qweqweqwewe");
                            help=(Alquilada) pelis.get(x);
                            pel= new Pelicula();
                            pel=bp.buscarPelicula(help.getCodPeli());
                            datos[x][1]=CODalq;
                            datos[x][2]= pel.getTitulo();
                            datos[x][3]= help.getFecha();
                            datos[x][4]= NOMBclie;
                        }
                    }
                    DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
                    tabla= new JTable(modelo);
                    tabla.setEnabled(false);
                    tabla.setBounds(10,10,500, 300);
//                    tabla.setGridColor(Color.gray);
//                    tabla.setBackground(Color.DARK_GRAY);
//                    tabla.setForeground(Color.white);
//                    tabla.setFont(new Font("Arial",Font.BOLD, 14));
//                    tabla.setRowHeight(21);
                    //tabla.setVisible(true);
                    scroll= new JScrollPane(tabla);
                    //scroll.add(tabla);
                    //scroll.setLayout(null);
                    scroll.setBounds(150,30,850,365);
                    setear.add(scroll);
                }//else vacia
            }//else campo
        }//action performed
    }//clase
}
