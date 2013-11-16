/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

/**
 *
 * @author Usuario Normal
 */
public class Ventana extends Frame {
    JPanel beta= new JPanel();
    CardLayout cartas= new CardLayout();
    JPanel gama= new JPanel(cartas);
    JPanel sep= new JPanel();
    JPanel stuff= new PanelAlquiler2();
    JPanel stuff2= new Panel2();
    JPanel devolucion= new Devolucion();
    JPanel multap= new PanelMulta();
    //JPanel imagen= new ListaClientes();
    //JPanel paneles= new PanelConPaneles();
    JPanel peli= new AddPelicula();
    JButton jinx, drav, happy, duel, mantra,molten, multa;
    JLabel uno= new JLabel("uno");
    JLabel dos= new JLabel("dos");
    Icon j= new ImageIcon(getClass().getResource("iconos/Get Excited!.jpg"));
    Icon d= new ImageIcon(getClass().getResource("iconos/LeagueofDraven.jpg"));
    Icon c= new ImageIcon(getClass().getResource("iconos/Happy_Hour.jpg"));
    Icon e= new ImageIcon(getClass().getResource("iconos/Duelist.jpg"));
    Icon m= new ImageIcon(getClass().getResource("iconos/Mantra.jpg"));
    Icon dev= new ImageIcon(getClass().getResource("iconos/Molten_Shield.jpg"));
    public Ventana(){
        super("Beta");
        //---------paneles
        this.setBounds(50, 50, 1000, 600);
        beta.setBounds(0,25,1000,100);
        beta.setBackground(Color.getHSBColor(0.75f, 1f,0.5f));
        beta.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
        gama.setBounds(2,135, 995, 465);
        sep.setBounds(2,125,1000,10);
        sep.setBackground(Color.BLACK);
        //------------------botones
        jinx= new JButton(null,j);
        jinx.setBorderPainted(false);
        jinx.setContentAreaFilled(false);
        drav= new JButton(null,d);
        drav.setBorderPainted(false);
        drav.setContentAreaFilled(false);
        happy= new JButton(null,c);
        happy.setBorderPainted(false);
        happy.setContentAreaFilled(false);
        duel= new JButton(null,e);
        duel.setBorderPainted(false);
        duel.setContentAreaFilled(false);
        mantra= new JButton(null,m);
        mantra.setBorderPainted(false);
        mantra.setContentAreaFilled(false);
        molten= new JButton(null,dev);
        molten.setBorderPainted(false);
        molten.setContentAreaFilled(false);
        multa= new JButton("Multas");
        
        
        gama.setLayout(cartas);
        //uno.setForeground(Color.red);
        //stuff2.add(dos);
        //stuff2.setBackground(Color.red);
        //---------agregar cartas
        gama.add(stuff,"1");
        gama.add(stuff2,"2");
//        gama.add(imagen,"3");
//        gama.add(paneles,"4");
        gama.add(peli,"5");
        gama.add(devolucion,"6");
        gama.add(multap, "7");
        jinx.addActionListener(new GestionBoton());
        drav.addActionListener(new GestionBoton());
        happy.addActionListener(new GestionBoton());
        duel.addActionListener(new GestionBoton());
        mantra.addActionListener(new GestionBoton());
        molten.addActionListener(new GestionBoton());
        multa.addActionListener(new GestionBoton());
        
        beta.add(jinx);
        beta.add(drav);
        beta.add(happy);
        beta.add(duel);
        beta.add(mantra);
        beta.add(molten);
        beta.add(multa);
        //-----------ventana
        this.setLayout(null);
        this.setResizable(false);
        this.add(sep);
        this.add(beta);
        this.add(gama);
        this.addWindowListener(new GestionVentana());
        this.setVisible(true);
    }
    public class GestionBoton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==jinx) cartas.show(gama, "1");
            if(e.getSource()==drav) cartas.show(gama, "2");
            if(e.getSource()==happy){
                JPanel imagen= new ListaClientes();
                gama.add(imagen,"3");
                cartas.show(gama, "3");
            }
            if(e.getSource()==duel){
                JPanel paneles= new PanelConPaneles();
                gama.add(paneles,"4");
                cartas.show(gama, "4");
            }
            if(e.getSource()==mantra) cartas.show(gama, "5");
            if(e.getSource()==molten) cartas.show(gama, "6");
            if(e.getSource()==multa) cartas.show(gama, "7");
        }
    }   
}
