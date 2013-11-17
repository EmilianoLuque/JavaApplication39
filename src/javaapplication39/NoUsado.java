/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
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
import javaapplication39.Bases.BaseCliente;
import javaapplication39.Bases.BasePelicula;
import javaapplication39.Bases.BasePrecio;
import javaapplication39.Clases.Alquilada;
import javaapplication39.Clases.Alquiler;
import javaapplication39.Clases.Cliente;
import javaapplication39.Clases.CompFecha;
import javaapplication39.Clases.FechaEnt;
import javaapplication39.Clases.Pelicula;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario Normal
 */
public class NoUsado extends JPanel{
    JPanel clie= new JPanel();
    JPanel fecha= new JPanel();
    JPanel peli= new JPanel();
    JPanel alquiler= new JPanel();
    String fechaentg="", fechaactg="";
    int codclieg, pelisg=0, b=0;
    float montg;
    //cliente empieza
    JLabel codigo= new JLabel("Codigo del cliente");
    JTextField codt= new JTextField("");
    JLabel nombre= new JLabel("Nombre");
    JTextField nombt= new JTextField();
    JLabel dni= new JLabel("DNI");
    JTextField dnit= new JTextField();
    JButton buscar= new JButton("Aceptar");
    BaseCliente bc= new BaseCliente();
    int codint;
    //cliente termina
    //alquiler
    JLabel cliente= new JLabel("Código del cliente");
    JLabel pelis= new JLabel("Cantidad de peliculas");
    JLabel fechaentl= new JLabel("Fecha de entrega");
    JLabel monto= new JLabel("Monto");
    JTextField cliet= new JTextField();
    JTextField pel= new JTextField();
    JTextField fech= new JTextField();
    JTextField mont= new JTextField();
    JButton aceptar= new JButton("Aceptar");
    JButton cancelar= new JButton("Cancelar");
    //alquiler termina
    //fecha empieza
    JLabel fechaac= new JLabel("Fecha actual");
    JTextField dac= new JTextField("");
    JLabel dact= new JLabel("Día");
    JTextField mac= new JTextField("");
    JLabel mact= new JLabel("Mes");
    JTextField aac= new JTextField("");
    JLabel aact= new JLabel("Año");
    JLabel del= new JLabel("Día");
    JLabel mel= new JLabel("Mes");
    JLabel ael= new JLabel("Año");
    JButton aceptaract= new JButton("Aceptar");
    JLabel fechaen= new JLabel("Fecha entrega");
    JTextField de= new JTextField();
    JTextField me= new JTextField();
    JTextField ae= new JTextField();
    JButton aceptaren= new JButton("Aceptar");
    String fechaent, fechact;
    //fecha termina
    //peli empieza
    JLabel codpeli= new JLabel("Codigo de la pelicula");
    JTextField codpet= new JTextField();
    JButton buscarp= new JButton("Buscar");
    JLabel tit= new JLabel("Título");
    JTextField titt= new JTextField();
    JLabel formato= new JLabel("Formato");
    JTextField formtt= new JTextField();
    JLabel gen= new JLabel("Género");
    JTextField gent= new JTextField();
    JButton agregar= new JButton("Agregar");
    //peli termina
    public NoUsado(){
        this.setLayout(null);
        clie.setBounds(0, 0, 497, 232);
        fecha.setBounds(497, 0, 497, 232);
        peli.setBounds(0, 232, 497, 232);
        alquiler.setBounds(497, 232, 497, 232);
        //----alquiler empieza
        cliente.setBounds(20, 20, 200, 21);
        cliente.setFont(new Font("Arial",Font.BOLD, 20));
        cliente.setForeground(Color.black);
        cliet.setBounds(250,20,200,21);
        cliet.setEditable(false);
        pelis.setBounds(20, 60, 220, 21);
        pelis.setFont(new Font("Arial",Font.BOLD, 20));
        pelis.setForeground(Color.black);
        pel.setBounds(250,60,200,21);
        pel.setEditable(false);
        fechaentl.setBounds(20, 100, 220, 21);
        fechaentl.setFont(new Font("Arial",Font.BOLD, 20));
        fechaentl.setForeground(Color.black);
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
        alquiler.add(aceptar);
        alquiler.add(cancelar);
        alquiler.add(mont);
        alquiler.add(monto);
        alquiler.add(fech);
        alquiler.add(fechaentl);
        alquiler.add(pel);
        alquiler.add(pelis);
        alquiler.add(cliet);
        alquiler.add(cliente);
        alquiler.setLayout(null);
        alquiler.setBackground(Color.getHSBColor(0.8f, 0.5f, 0.3f));
        alquiler.setVisible(true);
        //----alquiler termina
        //-----------------------cliente empieza
        clie.setLayout(null);
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
        clie.setBackground(Color.getHSBColor(0.8f, 0.5f, 0.6f));
        clie.add(dnit);
        clie.add(dni);
        clie.add(nombt);
        clie.add(nombre);
        clie.add(buscar);
        clie.add(codt);
        clie.add(codigo);
        clie.setVisible(true);
        //-------------------cliente termina
        //-------------------fecha empieza
        fechaac.setBounds(220, 10, 200, 21);
        fechaac.setForeground(Color.black);
        fechaac.setFont(new Font("Arial",Font.BOLD, 20));
        dac.setBounds(140, 41, 50, 21);
        dac.setHorizontalAlignment(2);
        dact.setBounds(100, 41, 30, 21);
        dact.setForeground(Color.black);
        dact.setFont(new Font("Arial",Font.BOLD, 20));
        mac.setBounds(250, 41, 50, 21);
        mac.setHorizontalAlignment(2);
        mact.setBounds(200, 41, 40, 21);
        mact.setForeground(Color.black);
        mact.setFont(new Font("Arial",Font.BOLD, 20));
        aac.setBounds(360, 41, 50, 21);
        aac.setHorizontalAlignment(2);
        aact.setBounds(310, 41, 40, 21);
        aact.setForeground(Color.black);
        aact.setFont(new Font("Arial",Font.BOLD, 20));
        aceptaract.setBounds(230, 80, 100, 21);
        aceptaract.addActionListener(new Botonfecha());
        fechaen.setBounds(215, 110, 200, 21);
        fechaen.setForeground(Color.black);
        fechaen.setFont(new Font("Arial",Font.BOLD, 20));
        de.setBounds(140, 141, 50, 21);
        de.setHorizontalAlignment(2);
        de.setEditable(false);
        del.setBounds(100, 141, 40, 21);
        del.setForeground(Color.black);
        del.setFont(new Font("Arial",Font.BOLD, 20));
        me.setBounds(250, 141, 50, 21);
        me.setHorizontalAlignment(2);
        me.setEditable(false);
        mel.setBounds(200, 141, 40, 21);
        mel.setForeground(Color.black);
        mel.setFont(new Font("Arial",Font.BOLD, 20));
        ae.setBounds(360, 141, 50, 21);
        ae.setHorizontalAlignment(2);
        ae.setEditable(false);
        ael.setBounds(310, 141, 40, 21);
        ael.setForeground(Color.black);
        ael.setFont(new Font("Arial",Font.BOLD, 20));
        aceptaren.setBounds(230, 180, 100, 21);
        aceptaren.setEnabled(false);
        aceptaren.addActionListener(new Botonfecha());
        fecha.add(ael);
        fecha.add(mel);
        fecha.add(del);
        fecha.add(aact);
        fecha.add(mact);
        fecha.add(dact);
        fecha.add(aceptaren);
        fecha.add(me);
        fecha.add(ae);
        fecha.add(de);
        fecha.add(aceptaract);
        fecha.add(fechaen);
        fecha.add(aac);
        fecha.add(mac);
        fecha.add(dac);
        fecha.add(fechaac);
        fecha.setLayout(null);
        fecha.setBackground(Color.getHSBColor(0.8f, 0.5f, 0.5f));
        fecha.setVisible(true);
        //-------------------fecha termina
        //-------------------peli empieza
        codpeli.setBounds(20, 20, 200, 21);
        codpeli.setFont(new Font("Arial",Font.BOLD, 20));
        codpeli.setForeground(Color.black);
        codpet.setBounds(250,20,200,21);
        buscarp.setBounds(200,60,100,21);
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
        buscarp.addActionListener(new BotonPeli());
        peli.add(agregar);
        peli.add(gent);
        peli.add(gen);
        peli.add(formtt);
        peli.add(formato);
        peli.add(titt);
        peli.add(tit);
        peli.add(buscarp);
        peli.add(codpet);
        peli.add(codpeli);
        peli.setLayout(null);
        peli.setBackground(Color.getHSBColor(0.8f, 0.5f, 0.4f));
        peli.setVisible(true);
        //-------------------peli termina
        this.add(clie);
        this.add(fecha);
        this.add(peli);
        this.add(alquiler);
        this.setVisible(true);
    }
    public void setFecha(String f){
        fech.setText(f);
    }
    public class BotonAlquiler implements ActionListener{
        BaseAlquiler bar= new BaseAlquiler();
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==aceptar){
                if(fechaentg.equalsIgnoreCase("")) b=1;
                if(fechaactg.equalsIgnoreCase("")) b=1;
                if(codclieg==0) b=1;
                if(montg==0) b=1;
                if(b==0){
                    int codalquiler= bar.codigoMayor()+1;
                    codclieg=Integer.parseInt(codt.getText());
                    Alquiler axu= new Alquiler(codclieg, fechaactg, montg, fechaentg, codalquiler);
                    BaseAlquiler bara= new BaseAlquiler();
                    bara.agregar(axu);
                    codclieg=0;
                    montg=0;
                    fechaentg="";
                    fechaactg="";
                    cliet.setText("");
                    fech.setText("");
                    pel.setText("");
                    mont.setText("");
                    codt.setText("");
                    dnit.setText("");
                    nombt.setText("");
                    dac.setText("");
                    mac.setText("");
                    aac.setText("");
                    aceptaract.setEnabled(true);
                    de.setText("");
                    me.setText("");
                    ae.setText("");
                    codpet.setText("");
                    titt.setText("");
                    formtt.setText("");
                    gent.setText("");
                    pelisg=0;
                    JOptionPane.showMessageDialog(null, "Alquiler almacenado. Código: "
                            +codalquiler, "Mensaje", 1);
                }else{
                    b=0;
                    JOptionPane.showMessageDialog(null, "Uno de los campos no"
                            + " fue completado", "Mensaje", 1);
                }
            }
            if(e.getSource()==cancelar){
                codclieg=0;
                montg=0;
                fechaentg="";
                fechaactg="";
                cliet.setText("");
                fech.setText("");
                pel.setText("");
                mont.setText("");
                codt.setText("");
                dnit.setText("");
                nombt.setText("");
                dac.setText("");
                mac.setText("");
                aac.setText("");
                aceptaract.setEnabled(true);
                de.setText("");
                me.setText("");
                ae.setText("");
                codpet.setText("");
                titt.setText("");
                formtt.setText("");
                gent.setText("");
                if(pelisg>0){
                    BaseAlquilada aux= new BaseAlquilada();
                    BaseAlquiler aux2= new BaseAlquiler();
                    int codaux= aux2.codigoMayor()+1;
                    aux.desactivo(codaux);
                    pelisg=0;
                }
            }
        }
    }
    public class Botonclie implements ActionListener{
        String cods;
        int cod, b=0;
        Cliente nuevo= new Cliente();
        @Override
        public void actionPerformed(ActionEvent e) {
            cods= codt.getText();
            if(cods.equalsIgnoreCase("")) b=1;
            if(b==0){
                cod= Integer.parseInt(cods);
                cods="";
                nuevo=bc.buscarCliente(cod);
                if(nuevo!=null){
                    nombt.setText(nuevo.getNomb());
                    dnit.setText(Integer.toString(nuevo.getDni()));
                    cliet.setText(Integer.toString(cod));
                }
                else{
                    JOptionPane.showMessageDialog(null, "El cliente no está en"
                            + " la base de datos", "Error", 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un código"
                            + " de cliente", "Error", 1);
                b=0;
                dnit.setText("");
                nombt.setText("");
            }
        }
    }
    public class Botonfecha implements ActionListener{
        int bandera=0;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==aceptaract){
                String ds= dac.getText();
                String ms= mac.getText();
                String as= aac.getText();
                if(ds.equalsIgnoreCase("")) bandera=1;
                if(ms.equalsIgnoreCase("")) bandera=1;
                if(as.equalsIgnoreCase("")) bandera=1;
                if(bandera==0){
                    CompFecha com= new CompFecha(ds, ms, as);
                    int b=com.comprobar();
                    if(b==1){
                        JOptionPane.showMessageDialog(null, "Día incorrecto",
                                "Error", 0);
                    }
                    if(b==2){
                        JOptionPane.showMessageDialog(null, "Mes incorrecto",
                                "Error", 0);
                    }
                    if(b==3){
                        JOptionPane.showMessageDialog(null, "Año incorrecto",
                                "Error", 0);
                    }
                    if(b==0){
                        fechaactg=ds+"-"+ms+"-"+as;
                        fechact=ds+"-"+ms+"-"+as;
                        FechaEnt comp= new FechaEnt(ds, ms, as);
                        String fecha= comp.calc();
                        String den=fecha.substring(0,2);
                        String men= fecha.substring(3, 5);
                        String aen= fecha.substring(6);
                        de.setText(den);
                        de.setEditable(true);
                        me.setText(men);
                        me.setEditable(true);
                        ae.setText(aen);
                        ae.setEditable(true);
                        dac.setEditable(false);
                        mac.setEditable(false);
                        aac.setEditable(false);
                        aceptaract.setEnabled(false);
                        aceptaren.setEnabled(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Uno de los campos"
                            + " no fue completado", "Error", 0);
                    bandera=0;
                }
            }
            if(e.getSource()==aceptaren){
                int ba=0;
                String des= de.getText();
                String mes= me.getText();
                String aes= ae.getText();
                if(des.equalsIgnoreCase("")) bandera=1;
                if(mes.equalsIgnoreCase("")) bandera=1;
                if(aes.equalsIgnoreCase("")) bandera=1;
                if(bandera==0){
                    CompFecha aux= new CompFecha(des,mes,aes);
                    ba=aux.comprobar();
                    if(ba==1){
                        JOptionPane.showMessageDialog(null, "Día incorrecto",
                                "Error", 0);
                    }
                    if(ba==2){
                        JOptionPane.showMessageDialog(null, "Mes incorrecto",
                                "Error", 0);
                    }
                    if(ba==3){
                        JOptionPane.showMessageDialog(null, "Año incorrecto",
                                "Error", 0);
                    }
                    if(ba==0){
                        fechaent=des+"-"+mes+"-"+aes;
                        fechaentg=des+"-"+mes+"-"+aes;
                        fech.setText(fechaent);
                        de.setEditable(false);
                        me.setEditable(false);
                        ae.setEditable(false);
                        aceptaren.setEnabled(false);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Uno de los campos"
                            + " no fue completado", "Error", 0);
                    bandera=0;
                }
            }
        }
        
    }
    public class BotonPeli implements ActionListener{
        BasePelicula bp= new BasePelicula();
        BaseAlquilada ba= new BaseAlquilada();
        BaseAlquiler bar= new BaseAlquiler();
        BasePrecio bpr= new BasePrecio();
        Pelicula nueva;
        int cod=0, codalq=0, bandera=1;
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==buscarp){
                String codt=codpet.getText();
                if(codt.equalsIgnoreCase("")) bandera=1;
                if(bandera==0){
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
                else{
                    JOptionPane.showMessageDialog(null, "Ingrese un código", "Mensaje", 1);
                    bandera=0;
                }
            }
            if(e.getSource()==agregar){
                if(fechaactg.equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null,"Debe ingresar una "
                            + "fecha primero.","Error",0);
                }
                else{
                    cod= Integer.parseInt(codpet.getText());
                    nueva= bp.buscarPelicula(cod);
                    int codp= nueva.getCodigo();
                    int ejem= nueva.getEjemplares();
                    if(ba.buscar(cod) <ejem){
                        pelisg++;
                        pel.setText(Integer.toString(pelisg));
                        float preayuda= bpr.getPrecio();
                        montg=pelisg*preayuda;
                        mont.setText(Float.toString(montg));
                        codalq= bar.codigoMayor()+1;
                        Alquilada ayuda= new Alquilada(codalq, codp, fechaactg);
                        ba.agregar(ayuda);
                        titt.setText("");
                        formtt.setText("");
                        gent.setText("");
                        codpet.setText("");
                        agregar.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "La película está fuera"
                                + " de stock.", "Error", 1);
                        codpet.setText("");
                        formtt.setText("");
                        titt.setText("");
                        gent.setText("");
                    }
                }
            }
        }
    }
    //-----------------------Cliente empieza
    /*
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
    public PanelCliente(){
        //this.setSize(497, 232);
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
                cods="";
                nuevo=bc.buscarCliente(cod);
                if(nuevo!=null){
                    nombt.setText(nuevo.getNomb());
                    dnit.setText(Integer.toString(nuevo.getDni()));
                    cliet.setText(Integer.toString(cod));
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
//}*/
    //-----------------------Cliente termina
    //-----------------------Fecha empieza
    /*
    public class Fecha extends JPanel{
    JLabel fechaac= new JLabel("Fecha actual");
    JTextField dac= new JTextField("");
    JLabel dact= new JLabel("Día");
    JTextField mac= new JTextField("");
    JLabel mact= new JLabel("Mes");
    JTextField aac= new JTextField("");
    JLabel aact= new JLabel("Año");
    JLabel del= new JLabel("Día");
    JLabel mel= new JLabel("Mes");
    JLabel ael= new JLabel("Año");
    JButton aceptaract= new JButton("Aceptar");
    JLabel fechaen= new JLabel("Fecha entrega");
    JTextField de= new JTextField();
    JTextField me= new JTextField();
    JTextField ae= new JTextField();
    JButton aceptaren= new JButton("Aceptar");
    //String fechaent, fechact;
    public Fecha(){
        fechaac.setBounds(220, 10, 200, 21);
        fechaac.setForeground(Color.black);
        fechaac.setFont(new Font("Arial",Font.BOLD, 20));
        dac.setBounds(140, 41, 50, 21);
        dac.setHorizontalAlignment(2);
        dact.setBounds(100, 41, 30, 21);
        dact.setForeground(Color.black);
        dact.setFont(new Font("Arial",Font.BOLD, 20));
        mac.setBounds(250, 41, 50, 21);
        mac.setHorizontalAlignment(2);
        mact.setBounds(200, 41, 40, 21);
        mact.setForeground(Color.black);
        mact.setFont(new Font("Arial",Font.BOLD, 20));
        aac.setBounds(360, 41, 50, 21);
        aac.setHorizontalAlignment(2);
        aact.setBounds(310, 41, 40, 21);
        aact.setForeground(Color.black);
        aact.setFont(new Font("Arial",Font.BOLD, 20));
        aceptaract.setBounds(230, 80, 100, 21);
        aceptaract.addActionListener(new Botonfecha());
        fechaen.setBounds(215, 110, 200, 21);
        fechaen.setForeground(Color.black);
        fechaen.setFont(new Font("Arial",Font.BOLD, 20));
        de.setBounds(140, 141, 50, 21);
        de.setHorizontalAlignment(2);
        de.setEditable(false);
        del.setBounds(100, 141, 40, 21);
        del.setForeground(Color.black);
        del.setFont(new Font("Arial",Font.BOLD, 20));
        me.setBounds(250, 141, 50, 21);
        me.setHorizontalAlignment(2);
        me.setEditable(false);
        mel.setBounds(200, 141, 40, 21);
        mel.setForeground(Color.black);
        mel.setFont(new Font("Arial",Font.BOLD, 20));
        ae.setBounds(360, 141, 50, 21);
        ae.setHorizontalAlignment(2);
        ae.setEditable(false);
        ael.setBounds(310, 141, 40, 21);
        ael.setForeground(Color.black);
        ael.setFont(new Font("Arial",Font.BOLD, 20));
        aceptaren.setBounds(230, 180, 100, 21);
        aceptaren.setEnabled(false);
        aceptaren.addActionListener(new Botonfecha());
        this.add(ael);
        this.add(mel);
        this.add(del);
        this.add(aact);
        this.add(mact);
        this.add(dact);
        this.add(aceptaren);
        this.add(me);
        this.add(ae);
        this.add(de);
        this.add(aceptaract);
        this.add(fechaen);
        this.add(aac);
        this.add(mac);
        this.add(dac);
        this.add(fechaac);
        this.setLayout(null);
        this.setBackground(Color.getHSBColor(0.8f, 0.5f, 0.5f));
        this.setVisible(true);
    }
    public class Botonfecha implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==aceptaract){
                String ds= dac.getText();
                String ms= mac.getText();
                String as= aac.getText();
                CompFecha com= new CompFecha(ds, ms, as);
                int b=com.comprobar();
                if(b==1){
                    JOptionPane.showMessageDialog(null, "Día incorrecto",
                            "Error", 0);
                }
                if(b==2){
                    JOptionPane.showMessageDialog(null, "Mes incorrecto",
                            "Error", 0);
                }
                if(b==3){
                    JOptionPane.showMessageDialog(null, "Año incorrecto",
                            "Error", 0);
                }
                if(b==0){
                    fechact=ds+"-"+ms+"-"+as;
                    FechaEnt comp= new FechaEnt(ds, ms, as);
                    String fecha= comp.calc();
                    String den=fecha.substring(0,2);
                    String men= fecha.substring(3, 5);
                    String aen= fecha.substring(6);
                    de.setText(den);
                    de.setEditable(true);
                    me.setText(men);
                    me.setEditable(true);
                    ae.setText(aen);
                    ae.setEditable(true);
                    dac.setEditable(false);
                    mac.setEditable(false);
                    aac.setEditable(false);
                    aceptaract.setEnabled(false);
                    aceptaren.setEnabled(true);
                }
            }
            if(e.getSource()==aceptaren){
                int ba=0;
                String des= de.getText();
                String mes= me.getText();
                String aes= ae.getText();
                CompFecha aux= new CompFecha(des,mes,aes);
                ba=aux.comprobar();
                if(ba==1){
                    JOptionPane.showMessageDialog(null, "Día incorrecto",
                            "Error", 0);
                }
                if(ba==2){
                    JOptionPane.showMessageDialog(null, "Mes incorrecto",
                            "Error", 0);
                }
                if(ba==3){
                    JOptionPane.showMessageDialog(null, "Año incorrecto",
                            "Error", 0);
                }
                if(ba==0){
                    fechaent=des+"-"+mes+"-"+aes;
                    fech.setText(fechaent);
                    de.setEditable(false);
                    me.setEditable(false);
                    ae.setEditable(false);
                    aceptaren.setEnabled(false);
                }
            }
        }
        
    }
}*/
    //-----------------------Fecha termina
    //-----------------------Peli empieza
    /*
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
        BaseAlquiler bar= new BaseAlquiler();
        BasePrecio bpr= new BasePrecio();
        Pelicula nueva;
        int cod=0, codalq=0;
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
                    pelisg++;
                    pel.setText(Integer.toString(pelisg));
                    float preayuda= bpr.getPrecio();
                    montg=pelisg*preayuda;
                    mont.setText(Float.toString(montg));
                    codalq= bar.codigoMayor()+1;
                    Alquilada ayuda= new Alquilada(codalq, codp, fechaactg);
                    ba.agregar(ayuda);
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
}*/
    //-----------------------Peli termina
    //-----------------------Alquiler empieza
    //-----------------------Alquiler termina
}
