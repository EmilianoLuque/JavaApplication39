/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import javaapplication39.Clases.Pelicula;
import javaapplication39.Bases.BasePelicula;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario Normal
 */
public class Lista extends JPanel {
    JPanel orden= new JPanel();
    ArrayList lista= new ArrayList();
    JTable tabla;
    BasePelicula bp= new BasePelicula();
    JPanel botones= new JPanel();
    JButton cod= new JButton("Código");
    JButton gen= new JButton("Genero");
    JButton tit= new JButton("Título");
    JButton ejem= new JButton("Ejemplares");
    JLabel busc= new JLabel("Buscar por:");
    Pelicula nueva;
    JLabel codigo= new JLabel("Código");
    JLabel genero= new JLabel("Género");
    JLabel titulo= new JLabel("Título");
    JLabel formato= new JLabel("Formato");
    JLabel autor= new JLabel("Autor");
    JLabel ejemplares= new JLabel("Ejemplares");
    JScrollPane scroll= new JScrollPane();
    public Lista(){
        //-------bptpmes
        botones.setLayout(null);
        busc.setBounds(32, 20, 100, 20);
        busc.setFont(new Font("Arial", Font.PLAIN, 18));
        busc.setForeground(Color.black);
        cod.setBounds(30, 65, 100, 30);
        cod.setBackground(Color.BLACK);
        cod.setForeground(Color.YELLOW);
        cod.addActionListener(new BotonListener());
        gen.setBounds(30, 110, 100, 30);
        gen.setBackground(Color.BLACK);
        gen.setForeground(Color.YELLOW);
        gen.addActionListener(new BotonListener());
        tit.setBounds(30, 155, 100, 30);
        tit.setBackground(Color.BLACK);
        tit.setForeground(Color.YELLOW);
        tit.addActionListener(new BotonListener());
        ejem.setBounds(30, 200, 100, 30);
        ejem.setBackground(Color.BLACK);
        ejem.setForeground(Color.YELLOW);
        ejem.addActionListener(new BotonListener());
        botones.add(busc);
        botones.add(cod);
        botones.add(gen);
        botones.add(tit);
        botones.add(ejem);
        botones.setBounds(0, 0, 150, 465);
        botones.setBackground(Color.red);
        //--------
        this.setBounds(0, 0, 985, 465);
        this.setLayout(null);
        orden.setBounds(150,0 , 850, 50);
        orden.setBackground(Color.BLUE);
        orden.setLayout(null);
        codigo.setBounds(5, 18, 100, 30);
        codigo.setForeground(Color.BLACK);
        codigo.setFont(new Font("Arial",Font.BOLD, 21));
        genero.setBounds(145, 18, 100, 30);
        genero.setForeground(Color.BLACK);
        genero.setFont(new Font("Arial",Font.BOLD, 21));
        titulo.setBounds(290, 18, 100, 30);
        titulo.setForeground(Color.BLACK);
        titulo.setFont(new Font("Arial",Font.BOLD, 21));
        formato.setBounds(435, 18, 100, 30);
        formato.setForeground(Color.BLACK);
        formato.setFont(new Font("Arial",Font.BOLD, 21));
        orden.add(formato);
        autor.setBounds(580, 18, 100, 30);
        autor.setForeground(Color.BLACK);
        autor.setFont(new Font("Arial",Font.BOLD, 21));
        ejemplares.setBounds(710, 18, 120, 30);
        ejemplares.setForeground(Color.BLACK);
        ejemplares.setFont(new Font("Arial",Font.BOLD, 21));
        orden.add(ejemplares);
        orden.add(autor);
        orden.add(titulo);
        orden.add(genero);
        orden.add(codigo);
        //----------
        lista=(ArrayList) bp.buscarTodasGen();
        if(!lista.isEmpty()){
            String[] columnas = {"Codigo","Genero","Titulo","Formato","Autor","Ejemplares"};
            Object datos[][]= new Object[lista.size()][6];
            for(int i=0; i<lista.size(); i++){
                nueva= new Pelicula();
                nueva=(Pelicula) lista.get(i);
                datos[i][0]= nueva.getCodigo();
                datos[i][1]= nueva.getGenero();
                datos[i][2]= nueva.getTitulo();
                datos[i][3]= nueva.getFormato();
                datos[i][4]= nueva.getAutor();
                datos[i][5]= nueva.getEjemplares();
            }
            DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
            tabla= new JTable(modelo);
            tabla.setBounds(0,0,845,414);
            tabla.setGridColor(Color.gray);
            tabla.setBackground(Color.DARK_GRAY);
            tabla.setForeground(Color.white);
            tabla.setFont(new Font("Arial",Font.BOLD, 14));
            tabla.setEnabled(false);
            tabla.setRowHeight(21);
            //----------
        }
        this.setBackground(Color.DARK_GRAY);
        this.add(botones);
        this.add(orden);
        scroll.setBounds(150,50,845,414);
        scroll.add(tabla);
        scroll.setLayout(null);
        scroll.setBackground(Color.darkGray);
        this.add(scroll);
        this.setVisible(true);
    }
    public class BotonListener implements ActionListener{
        ArrayList pelis= new ArrayList();
        JLabel asd= new JLabel("asdasdasdasd");
        JTable tabla;
        BasePelicula bp= new BasePelicula();
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==cod){
                pelis=(ArrayList) bp.buscarTodas();
                if(!pelis.isEmpty()){
                    String[] columnas = {"Codigo","Genero","Titulo","Formato","Autor","Ejemplares"};
                    Object datos[][]= new Object[pelis.size()][6];
                    for(int i=0; i<pelis.size(); i++){
                        nueva= new Pelicula();
                        nueva=(Pelicula) pelis.get(i);
                        datos[i][0]= nueva.getCodigo();
                        datos[i][1]= nueva.getGenero();
                        datos[i][2]= nueva.getTitulo();
                        datos[i][3]= nueva.getFormato();
                        datos[i][4]= nueva.getAutor();
                        datos[i][5]= nueva.getEjemplares();
                    }
                    DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
                    tabla= new JTable(modelo);
                    tabla.setBounds(0,0,845,414);
                    tabla.setGridColor(Color.gray);
                    tabla.setBackground(Color.DARK_GRAY);
                    tabla.setForeground(Color.white);
                    tabla.setFont(new Font("Arial",Font.BOLD, 14));
                    tabla.setEnabled(false);
                    tabla.setRowHeight(21);
                    tabla.setVisible(true);
                    scroll.setVisible(false);
                    scroll.removeAll();
                    scroll.add(tabla);
                    scroll.setVisible(true);
                }
            }
            if(e.getSource()==gen){
                pelis=(ArrayList) bp.buscarTodasGen();
                if(!pelis.isEmpty()){
                    String[] columnas = {"Codigo","Genero","Titulo","Formato","Autor","Ejemplares"};
                    Object datos[][]= new Object[pelis.size()][6];
                    for(int i=0; i<pelis.size(); i++){
                        nueva= new Pelicula();
                        nueva=(Pelicula) pelis.get(i);
                        datos[i][0]= nueva.getCodigo();
                        datos[i][1]= nueva.getGenero();
                        datos[i][2]= nueva.getTitulo();
                        datos[i][3]= nueva.getFormato();
                        datos[i][4]= nueva.getAutor();
                        datos[i][5]= nueva.getEjemplares();
                    }
                    DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
                    tabla= new JTable(modelo);
                    tabla.setBounds(0,0,845,414);
                    tabla.setGridColor(Color.gray);
                    tabla.setBackground(Color.DARK_GRAY);
                    tabla.setForeground(Color.white);
                    tabla.setFont(new Font("Arial",Font.BOLD, 14));
                    tabla.setEnabled(false);
                    tabla.setRowHeight(21);
                    scroll.setVisible(false);
                    scroll.removeAll();
                    scroll.add(tabla);
                    scroll.setVisible(true);
                }
            }
            if(e.getSource()==tit){
                pelis=(ArrayList) bp.buscarTodasTit();
                if(!pelis.isEmpty()){
                    String[] columnas = {"Codigo","Genero","Titulo","Formato","Autor","Ejemplares"};
                    Object datos[][]= new Object[pelis.size()][6];
                    for(int i=0; i<pelis.size(); i++){
                        nueva= new Pelicula();
                        nueva=(Pelicula) pelis.get(i);
                        datos[i][0]= nueva.getCodigo();
                        datos[i][1]= nueva.getGenero();
                        datos[i][2]= nueva.getTitulo();
                        datos[i][3]= nueva.getFormato();
                        datos[i][4]= nueva.getAutor();
                        datos[i][5]= nueva.getEjemplares();
                    }
                    DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
                    tabla= new JTable(modelo);
                    tabla.setBounds(0,0,845,414);
                    tabla.setGridColor(Color.gray);
                    tabla.setBackground(Color.DARK_GRAY);
                    tabla.setForeground(Color.white);
                    tabla.setFont(new Font("Arial",Font.BOLD, 14));
                    tabla.setEnabled(false);
                    tabla.setRowHeight(21);
                    scroll.setVisible(false);
                    scroll.removeAll();
                    scroll.add(tabla);
                    scroll.setVisible(true);
                }
            }
            if(e.getSource()==ejem){
                pelis=(ArrayList) bp.buscarTodasEjem();
                if(!pelis.isEmpty()){
                    String[] columnas = {"Codigo","Genero","Titulo","Formato","Autor","Ejemplares"};
                    Object datos[][]= new Object[pelis.size()][6];
                    for(int i=0; i<pelis.size(); i++){
                        nueva= new Pelicula();
                        nueva=(Pelicula) pelis.get(i);
                        datos[i][0]= nueva.getCodigo();
                        datos[i][1]= nueva.getGenero();
                        datos[i][2]= nueva.getTitulo();
                        datos[i][3]= nueva.getFormato();
                        datos[i][4]= nueva.getAutor();
                        datos[i][5]= nueva.getEjemplares();
                    }
                    DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
                    tabla= new JTable(modelo);
                    tabla.setBounds(0,0,845,414);
                    tabla.setGridColor(Color.gray);
                    tabla.setBackground(Color.DARK_GRAY);
                    tabla.setForeground(Color.white);
                    tabla.setFont(new Font("Arial",Font.BOLD, 14));
                    tabla.setEnabled(false);
                    tabla.setRowHeight(21);
                    scroll.setVisible(false);
                    scroll.removeAll();
                    scroll.add(tabla);
                    scroll.setVisible(true);
                }
            }
        }
    }
}
