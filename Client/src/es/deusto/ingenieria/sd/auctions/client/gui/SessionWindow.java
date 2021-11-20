package es.deusto.ingenieria.sd.auctions.client.gui;

import javax.swing.JFrame; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class SessionWindow extends JFrame{

    private JPanel contentPane;

    private JPanel panel1;
    private JPanel panel1Arriba;
    private JPanel panel1Abajo;

    private JPanel panel2;
    private JScrollPane scroll;

    private JPanel panel3;
    private JPanel panel3Arriba;
    private JPanel panel3Abajo;

    public SessionWindow() {

        setTitle("Session Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 330));
        setVisible(true);
        pack();

        contentPane = new JPanel();
        setContentPane(contentPane);

        panel1 = new JPanel(new BorderLayout());
        panel1Arriba = new JPanel(new BorderLayout());
        panel1Abajo = new JPanel(new BorderLayout());
       
        panel2 = new JPanel(new GridLayout(7, 1));
        scroll = new JScrollPane(panel2);
       
        panel3 = new JPanel(new BorderLayout());
        panel3Arriba = new JPanel(new GridLayout(4, 2));
        panel3Abajo = new JPanel(new GridLayout(1, 2));

        contentPane.add(panel1);
        contentPane.add(scroll); // panel2
        contentPane.add(panel3);

        // panel 1

        JPanel panelBotonNuevaSesion = new JPanel();
        JButton botonNuevaSesion = new JButton("Crear nueva sesion");
        botonNuevaSesion.setPreferredSize(new Dimension(150, 25));
        panelBotonNuevaSesion.add(botonNuevaSesion);

        botonNuevaSesion.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    panel3.setVisible(true);;
                    panel1.setVisible(false);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        JPanel panelBotonVerSesiones = new JPanel();
        JButton botonVerSesiones = new JButton("Ver sesiones");
        botonVerSesiones.setPreferredSize(new Dimension(150, 25));
        panelBotonVerSesiones.add(botonVerSesiones);

        botonVerSesiones.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    scroll.setVisible(true);
                    panel1.setVisible(false);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panel1Arriba.add(panelBotonNuevaSesion);
        panel1Abajo.add(panelBotonVerSesiones);

        panel1.add(panel1Arriba, BorderLayout.NORTH);
        panel1.add(panel1Abajo, BorderLayout.SOUTH);

        // panel 2

        int numSesiones = 5;

        for (int i = 1; i <= numSesiones; i++) {
            JPanel panelBotonSesion = new JPanel();
            JButton botonSesion = new JButton("Sesión " + i);
            botonSesion.setPreferredSize(new Dimension(150, 25));
            panelBotonSesion.add(botonSesion);

            panel2.add(panelBotonSesion);

            botonSesion.addActionListener(new ActionListener() {
				
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    try {
                        panel3.setVisible(true);
                        scroll.setVisible(false);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
        }

        JPanel panelBotonAtras = new JPanel();
        JButton botonAtras = new JButton("Atrás");
        botonAtras.setPreferredSize(new Dimension(150, 25));
        panelBotonAtras.add(botonAtras);

        botonAtras.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    scroll.setVisible(false);
                    panel1.setVisible(true);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        JPanel panelBotonAceptar = new JPanel();
        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.setPreferredSize(new Dimension(150, 25));
        panelBotonAceptar.add(botonAceptar);

        botonAceptar.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    System.exit(0);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panel2.add(panelBotonAceptar);
        panel2.add(panelBotonAtras);

        // panel 3

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

        JPanel panelBotonAtras2 = new JPanel();
        JButton botonAtras2 = new JButton("Atrás");
        botonAtras2.setPreferredSize(new Dimension(150, 25));
        panelBotonAtras2.add(botonAtras2);

        botonAtras2.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    panel3.setVisible(false);
                    panel1.setVisible(true);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        JPanel panelBotonAceptar2 = new JPanel();
        JButton botonAceptar2 = new JButton("Aceptar");
        botonAceptar2.setPreferredSize(new Dimension(150, 25));
        panelBotonAceptar2.add(botonAceptar2);

        botonAceptar2.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    System.exit(0);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panel3Abajo.add(panelBotonAtras2);
        panel3Abajo.add(panelBotonAceptar2);

        panel3.add(panel3Arriba, BorderLayout.NORTH);
        panel3.add(panel3Abajo, BorderLayout.SOUTH);

        contentPane.setVisible(true);
        panel1.setVisible(true);
        scroll.setVisible(false); // panel2
        panel3.setVisible(false);
    }

    public static void main(String[] args) throws IOException {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
             try {
              SessionWindow frame = new SessionWindow();
              frame.setVisible(true);
             } catch (Exception e) {
              e.printStackTrace();
             }
            }
           });
    }
}