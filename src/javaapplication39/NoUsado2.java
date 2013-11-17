/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
/**
 *
 * @author Usuario Normal
 */
public class NoUsado2 extends JPanel {
    JPanel izq= new JPanel();
    int x=1;
    CardLayout cartas= new CardLayout();
    JPanel der= new ListaPeliculas();
    JButton cod= new JButton("Código");
    JButton gen= new JButton("Genero");
    JButton tit= new JButton("Título");
    JButton ejem= new JButton("Ejemplares");
    JLabel busc= new JLabel("Buscar por:");
    public NoUsado2(){
        this.setLayout(null);
        der.setBounds(0,200,1000,465);
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
