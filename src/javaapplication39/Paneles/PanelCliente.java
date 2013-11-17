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
import javaapplication39.Bases.BaseCliente;
import javaapplication39.Clases.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario Normal
 */
public class PanelCliente extends JPanel{
    JLabel codigo= new JLabel("Codigo del cliente");
    JTextField codt= new JTextField("");
    JLabel nombre= new JLabel("Nombre");
    JTextField nombt= new JTextField();
    JLabel dni= new JLabel("DNI");
    JTextField dnit= new JTextField();
    JButton buscar= new JButton("Aceptar");
    BaseCliente bc= new BaseCliente();
    int codint;
    Cliente nuevo= new Cliente();
    PanelAlqui ap= new PanelAlqui();
    public PanelCliente(){}
    public PanelCliente(PanelAlqui e){
        this.ap=e;
        this.setLayout(null);
        codigo.setBounds(20, 20, 200, 30);
        codigo.setFont(new Font("Arial",Font.BOLD, 20));
        codigo.setForeground(Color.black);
        codt.setBounds(230, 20, 150, 25);
        buscar.setBounds(200, 60, 100, 20);
        nombre.setBounds(20, 100, 100, 20);
        nombre.setFont(new Font("Arial",Font.BOLD, 20));
        nombre.setForeground(Color.black);
        nombt.setBounds(230,100,150,25);
        nombt.setEditable(false);
        dni.setBounds(20,140,100,20);
        dni.setFont(new Font("Arial",Font.BOLD, 20));
        dni.setForeground(Color.black);
        dnit.setBounds(230, 140, 150, 25);
        dnit.setEditable(false);
        ActionListener escucha= new Botonclie();
        buscar.addActionListener(escucha);
        this.setBackground(Color.getHSBColor(0.8f, 0.5f, 0.6f));
        this.add(dnit);
        this.add(dni);
        this.add(nombt);
        this.add(nombre);
        this.add(buscar);
        this.add(codt);
        this.add(codigo);
        this.setVisible(true);
    }
    
    public class Botonclie implements ActionListener{
        String cods;
        int cod, b=0;
        @Override
        public void actionPerformed(ActionEvent e) {
            cods= codt.getText();
            if(cods.equalsIgnoreCase("")) b=1;
            if(b==0){
                cod= Integer.parseInt(cods);
                //cods="";
                nuevo=bc.buscarCliente(cod);
                if(nuevo!=null){
                    nombt.setText(nuevo.getNomb());
                    dnit.setText(Integer.toString(nuevo.getDni()));
                    ap.clie.setText(cods);
                }
                else{
                    JOptionPane.showMessageDialog(null, "El cliente no está en"
                            + " la base de datos", "Error", 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un código"
                            + " de cliente", "Error", 0);
                b=0;
                dnit.setText("");
                nombt.setText("");
            }
        }
    }
}
