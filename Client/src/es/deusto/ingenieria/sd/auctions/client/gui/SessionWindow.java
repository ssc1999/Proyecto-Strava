package es.deusto.ingenieria.sd.auctions.client.gui;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class SessionWindow extends JFrame{

    private Container cp;

    private JPanel panelPrincipal;

    private JPanel panel1;
    private JPanel panel1Arriba;
    private JPanel panel1Abajo;

    private JPanel panel2;

    private JPanel panel3;
    private JPanel panel3Arriba;
    private JPanel panel3Abajo;

    private JScrollPane scroll;

    public SessionWindow() {

        cp = this.getContentPane();
        this.setTitle("Session Window");
        this.setSize(850, 250);

        panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setSize(500, 200);

        // panel 1

        panel1 = new JPanel(new BorderLayout());

        panel1Arriba = new JPanel(new BorderLayout());
        panel1Abajo = new JPanel(new BorderLayout());

        JPanel panelBotonNuevaSesion = new JPanel();
        JButton botonNuevaSesion = new JButton("Crear nueva sesion");
        botonNuevaSesion.setPreferredSize(new Dimension(150, 25));
        panelBotonNuevaSesion.add(botonNuevaSesion);

        JPanel panelBotonVerSesiones = new JPanel();
        JButton botonVerSesiones = new JButton("Ver sesiones");
        botonVerSesiones.setPreferredSize(new Dimension(150, 25));
        panelBotonVerSesiones.add(botonVerSesiones);

        panelPrincipal.add(panel1Arriba, BorderLayout.NORTH);
        panelPrincipal.add(panel1Abajo, BorderLayout.SOUTH);

        panel1Arriba.add(panelBotonNuevaSesion);
        panel1Abajo.add(panelBotonVerSesiones);

        panel1.add(panel1Arriba, BorderLayout.NORTH);
        panel1.add(panel1Abajo, BorderLayout.SOUTH);

        // panel 2

        panel2 = new JPanel(new GridLayout(5, 1));

        int numSesiones = 5;

        for (int i = 1; i <= numSesiones; i++) {
            JPanel panelBotonSesion = new JPanel();
            JButton botonSesion = new JButton("Sesión " +i);
            botonSesion.setPreferredSize(new Dimension(150, 25));
            panelBotonSesion.add(botonSesion);
            panel2.add(panelBotonSesion);
        }

        scroll = new JScrollPane(panel2);
        scroll.setVisible(true);
        //this.add(scroll);

        // panel 3

        panel3 = new JPanel(new BorderLayout());

        panel3Arriba = new JPanel(new GridLayout(4, 2));
        panel3Abajo = new JPanel(new BorderLayout());

        JLabel atributo1 = new JLabel("Atributo 1");

        JPanel panelTextAtributo1 = new JPanel(); 
        JTextField textAtributo1 = new JTextField();
        textAtributo1.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo1.add(textAtributo1);

        JLabel atributo2 = new JLabel("Atributo 2");

        JPanel panelTextAtributo2 = new JPanel(); 
        JTextField textAtributo2 = new JTextField();
        textAtributo2.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo2.add(textAtributo2);

        JLabel atributo3 = new JLabel("Atributo 3");

        JPanel panelTextAtributo3 = new JPanel(); 
        JTextField textAtributo3 = new JTextField();
        textAtributo3.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo3.add(textAtributo3);

        JLabel atributo4 = new JLabel("Atributo 4");

        JPanel panelTextAtributo4 = new JPanel(); 
        JTextField textAtributo4 = new JTextField();
        textAtributo4.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo4.add(textAtributo4);

        panel3Arriba.add(atributo1);
        panel3Arriba.add(panelTextAtributo1);
        panel3Arriba.add(atributo2);
        panel3Arriba.add(panelTextAtributo2);
        panel3Arriba.add(atributo3);
        panel3Arriba.add(panelTextAtributo3);
        panel3Arriba.add(atributo4);
        panel3Arriba.add(panelTextAtributo4);

        JPanel panelBotonAceptar = new JPanel();
        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.setPreferredSize(new Dimension(150, 25));
        panelBotonAceptar.add(botonAceptar);

        panel3Abajo.add(panelBotonAceptar);

        panel3.add(panel3Arriba, BorderLayout.NORTH);
        panel3.add(panel3Abajo, BorderLayout.SOUTH);

        //

        panelPrincipal.add(panel1);
        panelPrincipal.add(panel2);
        panelPrincipal.add(panel3);

        cp.add(panelPrincipal);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
		new SessionWindow();
	}
}