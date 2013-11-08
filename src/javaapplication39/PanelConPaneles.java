/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
/**
 *
 * @author Usuario Normal
 */
public class PanelConPaneles extends JPanel {
    JPanel izq= new JPanel();
    int x=1;
    CardLayout cartas= new CardLayout();
    JPanel der= new Lista();
    /*JPanel dercod= new Lista(1);
    JPanel dertit= new Lista(2);
    JPanel dergen= new Lista(3);
    JPanel derejem= new Lista(4);*/
    JButton cod= new JButton("Código");
    JButton gen= new JButton("Genero");
    JButton tit= new JButton("Título");
    JButton ejem= new JButton("Ejemplares");
    JLabel busc= new JLabel("Buscar por:");
    public PanelConPaneles(){
        this.setLayout(null);
        /*izq.setLayout(null);
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
        izq.add(busc);
        izq.add(cod);
        izq.add(gen);
        izq.add(tit);
        izq.add(ejem);
        izq.setBounds(0, 0, 150, 465);
        izq.setBackground(Color.red);
        der.setLayout(null);
        /*der.add(dercod, "1");
        der.add(dertit, "2");
        der.add(dergen, "3");
        der.add(derejem, "4");*/
        der.setBounds(0,0,1000,465);
        //this.add(izq);
        this.add(der);
    }
    public class BotonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==cod) cartas.show(der,"1");
            if(e.getSource()==tit) cartas.show(der,"2");
            if(e.getSource()==gen) cartas.show(der,"3");
            if(e.getSource()==ejem) cartas.show(der,"4");
        }
        
    }
}
