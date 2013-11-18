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
import javaapplication39.Bases.BaseCliente;
import javaapplication39.Bases.BaseMulta;
import javaapplication39.Clases.Cliente;
import javaapplication39.Clases.CompFecha;
import javaapplication39.Clases.Conversor;
import javaapplication39.Clases.Multa;
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
public class PanelMulta extends JPanel {
    JLabel codclie = new JLabel("Codigo de Cliente");
    JTextField codcliet= new JTextField("");
    JButton clienteb= new JButton("Buscar");
    JLabel codmul= new JLabel("Codigo de Multa");
    JTextField codmult= new JTextField();
    JButton multab= new JButton("Baja");
    JPanel datos= new JPanel();
    JPanel cabeza= new JPanel();
    JLabel cc= new JLabel("Codigo de Multa");
    JLabel mc= new JLabel("Monto");
    JScrollPane lista;
    JLabel dia= new JLabel("Día");
    JTextField diat= new JTextField("");
    JLabel mes= new JLabel("Mes");
    JTextField mest= new JTextField("");
    JLabel anio= new JLabel("Año");
    JTextField aniot= new JTextField("");
    JLabel alq= new JLabel("Alquiler");
    JTextField alqt= new JTextField("");
    JButton fe= new JButton("Aceptar");
    JLabel fa= new JLabel("Fecha Actual");
    JTable tabla;
    public PanelMulta(){
        this.setLayout(null);
        this.setSize(995,465);
        //-------cabeza
        cabeza.setBounds(497, 0, 498, 30);
        cabeza.setBackground(Color.getHSBColor(0.54f, .4f, .6f));
        cabeza.setLayout(null);
        cc.setBounds(10, 0, 180, 30);
        cc.setFont(new Font("Arial",Font.PLAIN,21));
        cc.setForeground(Color.black);
        mc.setBounds(300, 0, 180, 30);
        mc.setFont(new Font("Arial",Font.PLAIN,21));
        mc.setForeground(Color.black);
        cabeza.add(mc);
        cabeza.add(cc);
        //--------datos
        codclie.setFont(new Font("Arial",Font.PLAIN,21));
        codclie.setForeground(Color.black);
        codclie.setBounds(50, 20, 180, 30);
        codcliet.setBounds(250, 20, 100, 30);
        clienteb.addActionListener(new BotonClie(this));
        clienteb.setBounds(183,60,100,21);
        codmul.setFont(new Font("Arial",Font.PLAIN,21));
        codmul.setForeground(Color.black);
        codmul.setBounds(50, 320, 180, 30);
        codmult.setBounds(250, 320, 100, 30);
        codmult.setEditable(false);
        multab.setBounds(183,370,100,21);
        multab.setEnabled(false);
        multab.addActionListener(new BotonMul(this));
        //fecha
        fa.setFont(new Font("Arial",Font.PLAIN,21));
        fa.setForeground(Color.black);
        fa.setBounds(180, 90, 180, 30);
        dia.setFont(new Font("Arial",Font.PLAIN,21));
        dia.setForeground(Color.black);
        dia.setBounds(50, 130, 180, 30);
        diat.setBounds(250, 130, 100, 30);
        diat.setEditable(false);
        mes.setFont(new Font("Arial",Font.PLAIN,21));
        mes.setForeground(Color.black);
        mes.setBounds(50, 180, 180, 30);
        mest.setBounds(250, 180, 100, 30);
        mest.setEditable(false);
        anio.setFont(new Font("Arial",Font.PLAIN,21));
        anio.setForeground(Color.black);
        anio.setBounds(50, 230, 180, 30);
        aniot.setBounds(250, 230, 100, 30);
        aniot.setEditable(false);
        fe.setBounds(180, 280, 100, 30);
        fe.addActionListener(new BotonFe());
        fe.setEnabled(false);
        datos.add(fe);
        datos.add(anio);
        datos.add(aniot);
        datos.add(mes);
        datos.add(mest);
        datos.add(fa);
        datos.add(dia);
        datos.add(diat);
        //
        datos.add(codmult);
        datos.add(codmul);
        datos.add(clienteb);
        datos.add(codcliet);
        datos.add(codclie);
        datos.add(multab);
        datos.setLayout(null);
        datos.setBounds(0, 0, 497, 465);
        datos.setBackground(Color.getHSBColor(0.54f, .5f, .5f));
        //------lista
        String columnas[]={"Codigo de Multa","Monto"};
        Object datost[][]= new Object[0][2];
        DefaultTableModel modelo = new DefaultTableModel(datost, columnas);
        tabla= new JTable(modelo);
        tabla.setEnabled(false);
        tabla.setEnabled(false);
        tabla.setBounds(0,0,850, 435);
        tabla.setGridColor(Color.gray);
        tabla.setBackground(Color.DARK_GRAY);
        tabla.setForeground(Color.white);
        tabla.setFont(new Font("Arial",Font.BOLD, 14));
        tabla.setRowHeight(21);
        tabla.setBounds(0,0,498, 465);
        tabla.setTableHeader(null);
        lista= new JScrollPane(tabla);
        lista.setBounds(497, 30, 498, 435);
        lista.setBackground(Color.darkGray);
        this.add(cabeza);
        this.add(lista);
        this.add(datos);
        this.setVisible(true);
    }
    public class BotonClie implements ActionListener {
        int b=0, cod;
        BaseCliente bc= new BaseCliente();
        BaseMulta bm= new BaseMulta();
        ArrayList multas= new ArrayList();
        JPanel a = new JPanel();
        public BotonClie(JPanel b){
            this.a=b;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(codcliet.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"No lleno el campo", "Error",0);
            }
            else{
                cod= Integer.parseInt(codcliet.getText());
                Cliente ayuda= bc.buscarCliente(cod);
                if(ayuda==null){
                    JOptionPane.showMessageDialog(null,"No existe ese cliente en la base de "
                            + "datos", "Error",0);
                }
                else{
                    multas= (ArrayList) bm.buscar(cod);
                    if(multas.isEmpty())
                        JOptionPane.showMessageDialog(null,"El cliente no tiene "
                            + "multas", "Mensaje",1);
                    else{
                        String columnas[]={"Codigo de Multa","Monto"};
                        Object datost[][]= new Object[multas.size()][2];
                        Multa ayudam;
                        for(int i=0; i<multas.size(); i++){
                            ayudam=(Multa) multas.get(i);
                            datost[i][0]= ayudam.getCodMul();
                            datost[i][1]= ayudam.getMonto();
                        }
                        DefaultTableModel modelo = new DefaultTableModel(datost, columnas);
                        tabla= new JTable(modelo);
                        tabla.setEnabled(false);
                        tabla.setEnabled(false);
                        tabla.setBounds(0,0,850, 435);
                        tabla.setGridColor(Color.gray);
                        tabla.setBackground(Color.DARK_GRAY);
                        tabla.setForeground(Color.white);
                        tabla.setFont(new Font("Arial",Font.BOLD, 14));
                        tabla.setRowHeight(21);
                        tabla.setBounds(0,0,498, 435);
                        tabla.setTableHeader(null);
                        lista.setVisible(false);
                        lista= new JScrollPane(tabla);
                        lista.setVisible(true);
                        lista.setBounds(497, 30, 498, 435);
                        a.add(lista);
                        diat.setEditable(true);
                        mest.setEditable(true);
                        aniot.setEditable(true);
                        fe.setEnabled(true);
                    }//cargo lista
                }//no teine multa
                
            }//no esta en la base 
        }//action
    }//clase
    public class BotonFe implements ActionListener{
        int b=0;
        String ds, ms,as, error;
        @Override
        public void actionPerformed(ActionEvent e){
            if(diat.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"No lleno el campo día", "Error",0);
                b=1;
            }
            if(mest.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"No lleno el campo mes", "Error",0);
                b=1;
            }
            if(aniot.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"No lleno el campo año", "Error",0);
                b=1;
            }
            if(b==0){
                ds= diat.getText();
                ms= mest.getText();
                as= aniot.getText();
                CompFecha a= new CompFecha(ds, ms, as);
                int err= a.comprobar();
                switch(err){
                    case 1: error="Día incorrecto";
                        break;
                    case 2: error="Mes incorrecto";
                        break;
                    case 3: error="Año incorrecto";
                        break;
                }//switch
                if(err!=0)
                    JOptionPane.showMessageDialog(null,error, "Error",0);
                else{
                    Conversor c= new Conversor(ds, ms, as);
                    diat.setText(c.getDa());
                    mest.setText(c.getMa());
                    codmult.setEditable(true);
                    multab.setEnabled(true);
                    diat.setEditable(false);
                    mest.setEditable(false);
                    aniot.setEditable(false);
                    
                }//err==0
            }//b==0
            b=0;
        }//action
    }//clase
    public class BotonMul implements ActionListener{
        BaseMulta bmul= new BaseMulta();
        JPanel b= new JPanel();
        public BotonMul(JPanel a){
            this.b=a;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(codmult.getText().equalsIgnoreCase(""))
                JOptionPane.showMessageDialog(null,"No lleno el campo", "Error",0);
            else{
                int desactivar= Integer.parseInt(codmult.getText());
                codmult.setText("");
                codmult.setEditable(false);
                String ffinal= diat.getText()+"-"+mest.getText()+"-"+aniot.getText();
                bmul.cancelar(desactivar, ffinal);
                multab.setEnabled(false);
                diat.setEditable(false);
                diat.setText("");
                mest.setEditable(false);
                mest.setText("");
                aniot.setEditable(false);
                aniot.setText("");
                fe.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Multa cancelada", "Mensaje",1);
                String columnas[]={"Codigo de Multa","Monto"};
                Object datost[][]= new Object[0][2];
                DefaultTableModel modelo = new DefaultTableModel(datost, columnas);
                tabla= new JTable(modelo);
                tabla.setEnabled(false);
                tabla.setBounds(0,0,850, 435);
                tabla.setGridColor(Color.gray);
                tabla.setBackground(Color.DARK_GRAY);
                tabla.setForeground(Color.white);
                tabla.setFont(new Font("Arial",Font.BOLD, 14));
                tabla.setRowHeight(21);
                tabla.setBounds(0,0,498, 435);
                lista.setVisible(false);
                tabla.setTableHeader(null);
                lista.setVisible(false);
                lista= new JScrollPane(tabla);
                lista.setVisible(true);
                lista.setBounds(497, 30, 498, 435);
                b.add(lista);
                lista.setVisible(true);
            }
        }//action
    }//clase
}
