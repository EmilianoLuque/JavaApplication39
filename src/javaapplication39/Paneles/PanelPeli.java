/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.Paneles;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaapplication39.Bases.BaseAlquilada;
import javaapplication39.Bases.BasePelicula;
import javaapplication39.Clases.Pelicula;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario Normal
 */
public class PanelPeli extends JPanel{
    JLabel codpeli= new JLabel("Codigo de la pelicula");
    JTextField codpet= new JTextField();
    JButton buscar= new JButton("Buscar");
    JLabel tit= new JLabel("Título");
    JTextField titt= new JTextField();
    JLabel formato= new JLabel("Formato");
    JTextField formtt= new JTextField();
    JLabel gen= new JLabel("Género");
    JTextField gent= new JTextField();
    JButton agregar= new JButton("Agregar");
    public PanelPeli(){
        codpeli.setBounds(20, 20, 200, 21);
        codpeli.setFont(new Font("Arial",Font.BOLD, 20));
        codpeli.setForeground(Color.black);
        codpet.setBounds(250,20,200,21);
        buscar.setBounds(200,60,100,21);
        tit.setBounds(20,90,200,21);
        tit.setFont(new Font("Arial",Font.BOLD, 20));
        tit.setForeground(Color.black);
        titt.setBounds(250,90,200,21);
        titt.setEditable(false);
        formato.setBounds(20,130,200,21);
        formato.setFont(new Font("Arial",Font.BOLD, 20));
        formato.setForeground(Color.black);
        formtt.setBounds(250,130,200,21);
        formtt.setEditable(false);
        gen.setBounds(20,170,200,21);
        gen.setFont(new Font("Arial",Font.BOLD, 20));
        gen.setForeground(Color.black);
        gent.setBounds(250,170,200,21);
        gent.setEditable(false);
        agregar.setBounds(200,200,100,21);
        agregar.setEnabled(false);
        agregar.addActionListener(new BotonPeli());
        buscar.addActionListener(new BotonPeli());
        this.add(agregar);
        this.add(gent);
        this.add(gen);
        this.add(formtt);
        this.add(formato);
        this.add(titt);
        this.add(tit);
        this.add(buscar);
        this.add(codpet);
        this.add(codpeli);
        this.setLayout(null);
        this.setBackground(Color.getHSBColor(0.8f, 0.5f, 0.4f));
        this.setVisible(true);
    }
    public class BotonPeli implements ActionListener{
        BasePelicula bp= new BasePelicula();
        BaseAlquilada ba= new BaseAlquilada();
        Pelicula nueva;
        int cod=0;
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==buscar){
                cod= Integer.parseInt(codpet.getText());
                if(bp.comprobarPeli(cod)==1){
                    nueva= new Pelicula();
                    nueva= bp.buscarPelicula(cod);
                    titt.setText(nueva.getTitulo());
                    formtt.setText(nueva.getFormato());
                    gent.setText(nueva.getGenero());
                    agregar.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null,"El código es incorrecto"
                            ,"Error",0);
                }
            }
            if(e.getSource()==agregar){
                cod= Integer.parseInt(codpet.getText());
                nueva= bp.buscarPelicula(cod);
                int codp= nueva.getCodigo();
                int ejem= nueva.getEjemplares();
                if(ba.buscar(cod) <ejem){
                    //aumento la cantidad de peliculas
                    //genero un registro en alquiladas
                    titt.setText("");
                    formtt.setText("");
                    gent.setText("");
                    codpet.setText("");
                    agregar.setEnabled(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "La película está fuera"
                            + " de stock.", "Error", 1);
                }
            }
        }
    }
}
