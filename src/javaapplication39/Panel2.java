/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import javaapplication39.Clases.Cliente;
import javaapplication39.Bases.BaseCliente;
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
public class Panel2 extends JPanel{
    JLabel nombre= new JLabel("Nombre");
    JLabel apellido= new JLabel("Apellido");
    JLabel telefono= new JLabel("Teléfono");
    JLabel direccion= new JLabel("Dirección");
    JLabel dni= new JLabel("DNI");
    JTextField nomb= new JTextField();
    JTextField ape= new JTextField();
    JTextField tel= new JTextField();
    JTextField dir= new JTextField();
    JTextField dn= new JTextField();
    JButton agregar= new JButton("Afiliar");
    JPanel datos= new JPanel(null);
    public Panel2(){
        this.setLayout(new BorderLayout());
        datos.setBounds(0, 0, 995, 465);
        nombre.setBounds(380, 20, 100, 20);
        nombre.setFont(new Font("Arial",Font.BOLD,20));
        nomb.setBounds(480, 15, 150, 25);
        datos.add(nombre);
        datos.add(nomb);
        apellido.setBounds(380, 80, 100, 20);
        apellido.setFont(new Font("Arial",Font.BOLD,20));
        ape.setBounds(480, 75, 150, 25);
        datos.add(apellido);
        datos.add(ape);
        telefono.setBounds(380, 140, 100, 20);
        telefono.setFont(new Font("Arial",Font.BOLD,20));
        tel.setBounds(480, 135, 150, 25);
        datos.add(telefono);
        datos.add(tel);
        direccion.setBounds(380, 200, 100, 20);
        direccion.setFont(new Font("Arial",Font.BOLD,20));
        dir.setBounds(480, 195, 150, 25);
        datos.add(direccion);
        datos.add(dir);
        dni.setBounds(380, 260, 100, 20);
        dni.setFont(new Font("Arial",Font.BOLD,20));
        dn.setBounds(480, 255, 150, 25);
        datos.add(dni);
        datos.add(dn);
        agregar.setBounds((995/2), 350, 100, 50);
        agregar.addActionListener(new BotonBoton());
        datos.add(agregar);
        datos.setBackground(Color.getHSBColor(0.3f, 0.5f, 0.7f));
        this.add(datos, BorderLayout.CENTER);
    }
    public class BotonBoton implements ActionListener {
        BaseCliente bc= new BaseCliente();
        int b=0;
        @Override
        public void actionPerformed(ActionEvent e){
            String dnis= dn.getText();
            if(dnis.equalsIgnoreCase("")) b=1;
            String nf= nomb.getText();
            if(nf.equalsIgnoreCase("")) b=1;
            String af= ape.getText();
            if(af.equalsIgnoreCase("")) b=1;
            String df= dir.getText();
            if(df.equalsIgnoreCase("")) b=1;
            String tsf= tel.getText();
            if(tsf.equalsIgnoreCase("")) b=1;
            if(b==0){
                int dnif= Integer.parseInt(dnis);
                if(bc.buscarDni(dnif)==0){
                    int tf= Integer.parseInt(tsf);
                    nf= nf+" "+af;
                    int codf= bc.codigoMayor()+1;
                    Cliente ayuda= new Cliente(nf, df, tf, dnif, codf);
                    bc.insertCliente(ayuda);
                    JOptionPane.showMessageDialog(null,"Cliente agregado","Mensaje",1);
                }
                else{
                    JOptionPane.showMessageDialog(null, "El cliente ya"
                        + " esta en la base de datos.", "Error", 0);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Uno de los campos"
                        + " no fue completado correctamente.", "Error", 0);
            }
        }
    }
}
