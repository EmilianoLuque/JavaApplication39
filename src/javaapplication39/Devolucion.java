/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javaapplication39.Bases.BaseAlquilada;
import javaapplication39.Bases.BaseAlquiler;
import javaapplication39.Bases.BaseCliente;
import javaapplication39.Bases.BaseMulta;
import javaapplication39.Bases.BasePelicula;
import javaapplication39.Bases.BasePrecio;
import javaapplication39.Clases.Alquilada;
import javaapplication39.Clases.Alquiler;
import javaapplication39.Clases.CalcularMulta;
import javaapplication39.Clases.Cliente;
import javaapplication39.Clases.CompFecha;
import javaapplication39.Clases.Conversor;
import javaapplication39.Clases.Multa;
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
    JScrollPane lista= new JScrollPane();
    JTable tabla;
    JLabel fa= new JLabel("Fecha Actual");
    JLabel cliecod= new JLabel("Codigo de Cliente");
    JTextField cliecodt= new JTextField("");
    JButton buscar= new JButton("Buscar");
    JLabel ccod= new JLabel("Codigo de Alquiler");
    JLabel cpeli= new JLabel("Pelicula");
    JLabel cfecha= new JLabel("Fecha");
    JLabel ccliente= new JLabel("Cliente");
    JLabel cmonto= new JLabel("Monto");
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
    String Fechaactual;
    int CodigoClie;
    public Devolucion(){
        this.setLayout(null);
        cliecod.setBounds(20, 10, 150, 30);
        cliecod.setFont(new Font("Arial", Font.BOLD,14));
        cliecod.setForeground(Color.black);
        cliecodt.setBounds(10, 50, 120, 30);
        buscar.setBounds(20,90,100,30);
        buscar.addActionListener(new BotonCodigo());
        ccod.setFont(new Font("Arial", Font.BOLD,14));
        ccod.setForeground(Color.black);
        ccod.setBounds(10,0,200,30);
        cpeli.setFont(new Font("Arial", Font.BOLD,14));
        cpeli.setForeground(Color.black);
        cpeli.setBounds(690,0,100,30);
        cfecha.setFont(new Font("Arial", Font.BOLD,14));
        cfecha.setForeground(Color.black);
        cfecha.setBounds(350,0,100,30);
        ccliente.setFont(new Font("Arial", Font.BOLD,14));
        ccliente.setForeground(Color.black);
        ccliente.setBounds(520,0,200,30);
        cmonto.setFont(new Font("Arial", Font.BOLD,14));
        cmonto.setForeground(Color.black);
        cmonto.setBounds(180,0,200,30);
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
        fe.addActionListener(new BotonFecha());
        alq.setBounds(530,15,100,31);
        alq.setForeground(Color.BLACK);
        alq.setFont(new Font("Arial",Font.BOLD,14));
        alqt.setBounds(600,15,100,31);
        alqt.setEditable(false);
        al.setBounds(720,15,100,31);
        al.setEnabled(false);
        al.addActionListener(new BotonAlqui());
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
        cabeza.add(cmonto);
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
        lista.setBackground(Color.darkGray);
        String columnas[]={"Codigo de Alquiler","Monto","Fecha","Cliente","Pelicula"};
        Object datos[][]= new Object[0][5];
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        tabla= new JTable(modelo);
        tabla.setEnabled(false);
        tabla.setBackground(Color.darkGray);
        tabla.setBounds(0,0,850, 365);            
        lista.add(tabla);
        lista.setLayout(null);
        lista.setBounds(150,30,850,395);
        codigo.setLayout(null);
        codigo.setBounds(150,395,850,70);
        codigo.setBackground(Color.green);
        this.setBackground(Color.darkGray);
        this.add(codigo);
        this.add(lista);
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
                    lista.setVisible(false);
                    diat.setEditable(false);
                    mest.setEditable(false);
                    aniot.setEditable(false);
                    fe.setEnabled(false);
                }
                else{
                    String columnas[]={"Codigo de Alquiler","Monto","Fecha","Cliente","Pelicula"};
                    Object datos[][]= new Object[todos.size()][5];
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
                        help= new Alquilada();
                        help=(Alquilada) pelis.get(0);
                        pel= new Pelicula();
                        pel=bp.buscarPelicula(help.getCodPeli());
                        float alg= ayuda.getMonto();
                        datos[i][0]=CODalq;
                        datos[i][1]= alg;
                        datos[i][2]= ayuda.getFechaAlquiler();
                        datos[i][3]= NOMBclie;
                        datos[i][4]=pel.getTitulo();
                    }
                    DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
                    tabla= new JTable(modelo);
                    tabla.setEnabled(false);
                    tabla.setBounds(0,0,850, 435);
                    tabla.setGridColor(Color.gray);
                    tabla.setBackground(Color.DARK_GRAY);
                    tabla.setForeground(Color.white);
                    tabla.setFont(new Font("Arial",Font.BOLD, 14));
                    tabla.setRowHeight(21);
                    lista.setVisible(false);
                    lista.removeAll();
                    lista.add(tabla);
                    lista.setVisible(true);
                    diat.setEditable(true);
                    mest.setEditable(true);
                    aniot.setEditable(true);
                    fe.setEnabled(true);
                    CodigoClie= codint;
                }//else vacia
            }//else campo
        }//action performed
    }//clase
    public class BotonFecha implements ActionListener{
        int band=0, comp=0;
        @Override
        public void actionPerformed(ActionEvent e){
            if(diat.getText().equalsIgnoreCase("")) band=1;
            if(mest.getText().equalsIgnoreCase("")) band=1;
            if(aniot.getText().equalsIgnoreCase("")) band=1;
            if(band==1){
                band=0;
                JOptionPane.showMessageDialog(null, "Campo Incompleto","Error", 0);
            }
            else{
                CompFecha algo= new CompFecha(diat.getText(), mest.getText(),
                        aniot.getText());
                comp= algo.comprobar();
                if(comp==0){
                    Conversor con= new Conversor(diat.getText(),mest.getText(),
                            aniot.getText());
                    diat.setText(con.getDa());
                    mest.setText(con.getMa());
                    Fechaactual= con.getFecha();
                    alqt.setEditable(true);
                    al.setEnabled(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Fecha errónea", "Error", 0);
                    comp=0;
                }
            }//else bandera
        }///action performed
    }//calse
    public class BotonAlqui implements ActionListener{
        BaseAlquiler ba= new BaseAlquiler();
        BasePrecio bp= new BasePrecio();
        BaseMulta bm= new BaseMulta();
        float tot=0, pre=0;
        @Override
        public void actionPerformed(ActionEvent e){
            if(alqt.getText().equalsIgnoreCase(""))
                JOptionPane.showMessageDialog(null, "Ingrese un código de alquiler",
                        "Error", 0);
            else{
                int cod= Integer.parseInt(alqt.getText());
                Alquiler des= ba.buscar(cod);
                CalcularMulta calc= new CalcularMulta(des.getFechaEntrega(),Fechaactual);
                int multa=calc.calcular();
                pre=bp.getPrecio();
                tot= pre*multa;
                if(multa>0){
                    int codmul= bm.codMayor()+1;
                    System.out.println(codmul);
                    Multa mul= new Multa(CodigoClie, tot, codmul);
                    bm.agregar(mul);
                    JOptionPane.showMessageDialog(null,"Se ha creado una multa de $"
                            +tot,"Mensaje",1);
                    //desactivar el alquiler
                    
                }//multa
            }//else
        }//action
    }//clase
}
