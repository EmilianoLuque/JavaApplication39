/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import javaapplication39.Clases.Cliente;
import javaapplication39.Bases.BaseCliente;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario Normal
 */
public class ListaClientes extends JPanel{
    ImageIcon img;
    JLabel img1, mostrar;
    JScrollPane a= new JScrollPane();
    JPanel orden= new JPanel();
    String labels[]= {"Código","Documento","Nombre","Teléfono","Dirección"};
    ArrayList clientes= new ArrayList();
    BaseCliente bc= new BaseCliente();
    JTable tabla;
    Cliente nuevo;
    public ListaClientes(){
        this.setLayout(null);
        orden.setBounds(0, 0, 995, 50);
        orden.setBackground(Color.BLUE);
        orden.setLayout(null);
        for(int i=0; i<labels.length;i++){
            mostrar= new JLabel(labels[i]);
            mostrar.setFont(new Font("Arial",Font.BOLD, 20));
            mostrar.setForeground(Color.BLACK);
            mostrar.setBounds(200*i, 0, 800, 50);
            orden.add(mostrar);
        }
        //--------
        clientes= (ArrayList) bc.buscarTodos();
        if(!clientes.isEmpty()){
            String [] columnas={"Código","Documento","Nombre","Teléfono","Dirección"};
            Object [][] datos= new Object[clientes.size()][5];
            for(int i=0; i<clientes.size();i++){
                nuevo= new Cliente();
                nuevo= (Cliente) clientes.get(i);
                datos[i][0]= nuevo.getCod();
                datos[i][1]= nuevo.getDni();
                datos[i][2]= nuevo.getNomb();
                datos[i][3]= nuevo.getTel();
                datos[i][4]= nuevo.getDir();
            }
            DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
            tabla= new JTable(modelo);
            tabla.setBounds(0,0,995,465);
            tabla.setGridColor(Color.gray);
            tabla.setBackground(Color.DARK_GRAY);
            tabla.setForeground(Color.white);
            tabla.setFont(new Font("Arial",Font.BOLD, 14));
            tabla.setRowHeight(21);
            tabla.setEnabled(false);
        }
        //--------
        this.setBackground(Color.RED);
        a= new JScrollPane();
        a.add(tabla);
        a.setLayout(null);
        a.setBounds(0,50,995,465);
        this.add(a);
        this.add(orden);
    }
}
