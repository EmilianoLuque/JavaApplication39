/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Usuario Normal
 */
public class Ventana extends JFrame {
    JPanel beta= new JPanel();
    CardLayout cartas= new CardLayout();
    JPanel gama= new JPanel(cartas);
    JPanel sep= new JPanel();
    JPanel alquiler= new PanelAlquiler2();
    JPanel clientenuevo= new Panel2();
    JPanel devolucion= new Devolucion();
    JPanel multap= new PanelMulta();
    JPanel recauda= new Recaudado();
    JPanel prop= new PanelPrecio();
    //JPanel imagen= new ListaClientes();
    //JPanel paneles= new PanelConPaneles();
    JPanel peli= new AddPelicula();
    JButton alqui, agcliente, listcliente, listpeliculas, agpelicula,devo, multa;
    JButton recaudado, propi;
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
        beta.setBounds(0,0,1000,100);
        beta.setBackground(Color.getHSBColor(0.75f, 1f,0.5f));
        beta.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
        gama.setBounds(0,110, 995, 465);
        sep.setBounds(0,100,1000,10);
        sep.setBackground(Color.BLACK);
        //------------------botones
        alqui= new JButton("Alquiler");
        agcliente= new JButton("Agregar Cliente");
        listcliente= new JButton("Lista de Clientes");
        listpeliculas= new JButton("Peliculas");
        agpelicula= new JButton("Agregar Pelicula");
        devo= new JButton("Devolución");
        multa= new JButton("Multas");
        recaudado= new JButton("Recaudación");
        propi= new JButton("Propiedades");
        gama.setLayout(cartas);
        //---------agregar cartas
        gama.add(alquiler,"1");
        gama.add(clientenuevo,"2");
        gama.add(peli,"5");
        gama.add(devolucion,"6");
        gama.add(multap, "7");
        gama.add(recauda,"8");
        gama.add(prop,"9");
        alqui.addActionListener(new GestionBoton());
        agcliente.addActionListener(new GestionBoton());
        listcliente.addActionListener(new GestionBoton());
        listpeliculas.addActionListener(new GestionBoton());
        agpelicula.addActionListener(new GestionBoton());
        devo.addActionListener(new GestionBoton());
        multa.addActionListener(new GestionBoton());
        recaudado.addActionListener(new GestionBoton());
        propi.addActionListener(new GestionBoton());
        beta.add(alqui);
        beta.add(agcliente);
        beta.add(listcliente);
        beta.add(listpeliculas);
        beta.add(agpelicula);
        beta.add(devo);
        beta.add(multa);
        beta.add(recaudado);
        beta.add(propi);
        //-----------ventana
        this.setLayout(null);
        this.setResizable(false);
        this.add(sep);
        this.add(beta);
        this.add(gama);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public class GestionBoton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==alqui) cartas.show(gama, "1");
            if(e.getSource()==agcliente) cartas.show(gama, "2");
            if(e.getSource()==listcliente){
                JPanel imagen= new ListaClientes();
                gama.add(imagen,"3");
                cartas.show(gama, "3");
            }
            if(e.getSource()==listpeliculas){
                JPanel paneles= new PanelConPaneles();
                gama.add(paneles,"4");
                cartas.show(gama, "4");
            }
            if(e.getSource()==agpelicula) cartas.show(gama, "5");
            if(e.getSource()==devo) cartas.show(gama, "6");
            if(e.getSource()==multa) cartas.show(gama, "7");
            if(e.getSource()==recaudado) cartas.show(gama, "8");
            if(e.getSource()==propi) cartas.show(gama, "9");
        }
    }   
}
