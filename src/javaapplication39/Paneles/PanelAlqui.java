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
import javaapplication39.Bases.BaseAlquiler;
import javaapplication39.Bases.BaseMulta;
import javaapplication39.Clases.Alquiler;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario Normal
 */
public class PanelAlqui extends JPanel {
    JLabel cliente= new JLabel("Código del cliente");
    JLabel pelis= new JLabel("Cantidad de peliculas");
    JLabel fechaent= new JLabel("Fecha de entrega");
    JLabel monto= new JLabel("Monto");
    JTextField clie= new JTextField();
    JTextField pel= new JTextField();
    JTextField fech= new JTextField();
    JTextField mont= new JTextField();
    JButton aceptar= new JButton("Aceptar");
    JButton cancelar= new JButton("Cancelar");
    String fechent="", fechact="";
    int cantidad=0;
    public PanelAlqui(){
        cliente.setBounds(20, 20, 200, 21);
        cliente.setFont(new Font("Arial",Font.BOLD, 20));
        cliente.setForeground(Color.black);
        clie.setBounds(250,20,200,21);
        clie.setEditable(false);
        pelis.setBounds(20, 60, 220, 21);
        pelis.setFont(new Font("Arial",Font.BOLD, 20));
        pelis.setForeground(Color.black);
        pel.setBounds(250,60,200,21);
        pel.setEditable(false);
        fechaent.setBounds(20, 100, 220, 21);
        fechaent.setFont(new Font("Arial",Font.BOLD, 20));
        fechaent.setForeground(Color.black);
        fech.setBounds(250,100,200,21);
        fech.setEditable(false);
        monto.setBounds(20, 140, 220, 21);
        monto.setFont(new Font("Arial",Font.BOLD, 20));
        monto.setForeground(Color.black);
        mont.setBounds(250,140,200,21);
        mont.setEditable(false);
        aceptar.setBounds(100, 180, 100, 21);
        aceptar.setEnabled(true);
        aceptar.addActionListener(new BotonAlquiler());
        cancelar.setBounds(300, 180, 100, 21);
        cancelar.addActionListener(new BotonAlquiler());
        this.add(aceptar);
        this.add(cancelar);
        this.add(mont);
        this.add(monto);
        this.add(fech);
        this.add(fechaent);
        this.add(pel);
        this.add(pelis);
        this.add(clie);
        this.add(cliente);
        this.setLayout(null);
        this.setBackground(Color.getHSBColor(0.8f, 0.5f, 0.3f));
        this.setVisible(true);
    }
    public class BotonAlquiler implements ActionListener{
        BaseAlquiler bar= new BaseAlquiler();
        BaseAlquilada ba= new BaseAlquilada();
        BaseMulta bm= new BaseMulta();
        int bandera=0;
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==aceptar){
                if(clie.getText().equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null, "No Ingreso un cliente", "Error", 0);
                    bandera=1;
                }
                if(pel.getText().equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null, "No Ingreso una pelicula", "Error", 0);
                    bandera=1;
                }
                if(fech.getText().equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null, "No Ingreso una fecha de entrega", "Error", 0);
                    bandera=1;
                }
                if(mont.getText().equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null, "Error de monto", "Error", 0);
                    bandera=1;
                }
                if(fechact.equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null, "No ingreso una fecha actual", "Error", 0);
                    bandera=1;
                }
                if(bandera==0){
                    int codclie= Integer.parseInt(clie.getText());
                    int alg=bm.multado(codclie);
                    if(alg==0){
                        float monot= Float.parseFloat(mont.getText());
                        int codalqui= bar.codigoMayor()+1;
                        /*String entrega= f.fechaent;
                        String actual= f.fechact;*/
                        Alquiler nuevo= new Alquiler(codclie, fechact, monot, fechent, codalqui);
                        bar.agregar(nuevo);
                        //limpio todo
                        mont.setText("");
                        fech.setText("");
                        pel.setText("");
                        clie.setText("");
                        fechact="";
                        fechent="";
                        cantidad=0;
                        JOptionPane.showMessageDialog(null, "Alquiler almacenado", "Mensaje", 1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El cliente tiene una multa pendiente."
                                + " Por favor cancele la multa antes de continuar", "Mensaje", 1);
                        JOptionPane.showMessageDialog(null, "Alquiler cancelado", "Mensaje", 1);
                        mont.setText("");
                        fech.setText("");
                        pel.setText("");
                        clie.setText("");
                        fechact="";
                        fechent="";
                        cantidad=0;
                        ba.desactivo(bar.codigoMayor()+1);
                    }
                }
                bandera=0;
            }
            if(e.getSource()==cancelar){
                mont.setText("");
                fech.setText("");
                pel.setText("");
                clie.setText("");
                fechact="";
                fechent="";
                cantidad=0;
                JOptionPane.showMessageDialog(null, "Alquiler cancelado", "Mensaje", 1);
                ba.desactivo(bar.codigoMayor()+1);
            }
        }
    }
}
