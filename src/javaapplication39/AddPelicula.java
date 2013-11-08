/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import javaapplication39.Clases.Pelicula;
import javaapplication39.Bases.BasePelicula;
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
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario Normal
 */
public class AddPelicula extends JPanel {
    JLabel tit= new JLabel("Titulo");
    JLabel gen= new JLabel("Genero");
    JLabel form= new JLabel("Formato");
    JLabel dir= new JLabel("Director");
    JLabel ejem= new JLabel("Ejemplares");
    JTextField titulo= new JTextField();
    JTextField genero= new JTextField();
    JTextField formato= new JTextField();
    JTextField director= new JTextField();
    JTextField ejemplares= new JTextField();
    JButton agregar= new JButton("Agregar");
    JPanel datos= new JPanel(null);
    public AddPelicula(){
        this.setLayout(new BorderLayout());
        datos.setBounds(0, 0, 995, 465);
        tit.setBounds(370, 20, 100, 20);
        tit.setFont(new Font("Arial",Font.BOLD,20));
        tit.setForeground(Color.black);
        titulo.setBounds(480, 15, 150, 25);
        datos.add(tit);
        datos.add(titulo);
        gen.setBounds(370, 80, 100, 20);
        gen.setFont(new Font("Arial",Font.BOLD,20));
        gen.setForeground(Color.black);
        genero.setBounds(480, 75, 150, 25);
        datos.add(gen);
        datos.add(genero);
        form.setBounds(370, 140, 100, 20);
        form.setFont(new Font("Arial",Font.BOLD,20));
        form.setForeground(Color.black);
        formato.setBounds(480, 135, 150, 25);
        datos.add(form);
        datos.add(formato);
        dir.setBounds(370, 200, 100, 20);
        dir.setFont(new Font("Arial",Font.BOLD,20));
        dir.setForeground(Color.black);
        director.setBounds(480, 195, 150, 25);
        datos.add(director);
        datos.add(dir);
        ejem.setBounds(370, 260, 110, 20);
        ejem.setFont(new Font("Arial",Font.BOLD,20));
        ejem.setForeground(Color.black);
        ejemplares.setBounds(480, 255, 150, 25);
        datos.add(ejem);
        datos.add(ejemplares);
        agregar.setBounds((995/2), 350, 100, 50);
        agregar.addActionListener(new BotonBoton());
        datos.add(agregar);
        datos.setBackground(Color.getHSBColor(0.5f, 0.9f, 0.3f));
        this.add(datos, BorderLayout.CENTER);
    }
    public class BotonBoton implements ActionListener {
        BasePelicula bc= new BasePelicula();
        int b=0;
        @Override
        public void actionPerformed(ActionEvent e){
            String tits= titulo.getText();
            if(tits.equalsIgnoreCase("")) b=1;
            String gens= genero.getText();
            if(gens.equalsIgnoreCase("")) b=1;
            String forms= formato.getText();
            if(forms.equalsIgnoreCase("")) b=1;
            String dirs= director.getText();
            if(dirs.equalsIgnoreCase("")) b=1;
            String ejems= ejemplares.getText();
            if(ejems.equalsIgnoreCase("")) b=1;
            if(b==0){
                int cod= bc.codigoMayor()+1;
                int ejem= Integer.parseInt(ejems);
                Pelicula nueva= new Pelicula(cod, gens, tits, forms, dirs, ejem);
                bc.agregarPelicula(nueva);
                JOptionPane.showMessageDialog(null, "Pelicula agregada a la"
                        + " base de datos.\nCodigo: "+cod, "Mensaje", 1);
                titulo.setText("");
                genero.setText("");
                formato.setText("");
                director.setText("");
                ejemplares.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Uno de los campos"
                        + " no fue completado correctamente.", "Error", 0);
            }
        }
    }
}
