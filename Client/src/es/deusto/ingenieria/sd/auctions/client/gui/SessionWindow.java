package es.deusto.ingenieria.sd.auctions.client.gui;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.File;

public class SessionWindow extends JFrame{

    private JPanel contentPane;

    private JPanel panel1;
    private JPanel panel1Izquierda;
    private JPanel panel1Derecha;

    private JPanel panel2;
    private JPanel panel2Arriba;
    private JPanel panel2Abajo;
    private JScrollPane scroll;

    private JPanel panel3;
    private JPanel panel3Arriba;
    private JPanel panel3Abajo;

    public SessionWindow() throws IOException {
        setBackground(new Color(0, 0, 51));

        setTitle("Session Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 330));
        setVisible(true);
        pack();

        int numSesiones = 20;

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        setContentPane(contentPane);

        panel1 = new JPanel(new BorderLayout());
        panel1.setBackground(new Color(0, 0, 51));
        panel1Izquierda = new JPanel(new BorderLayout());
        panel1Izquierda.setBackground(new Color(0, 0, 51));
        panel1Derecha = new JPanel(new GridLayout(3, 1));
        panel1Derecha.setBackground(new Color(0, 0, 51));
       
        panel2 = new JPanel(new GridLayout(7, 1));
        panel2Arriba = new JPanel(new GridLayout(numSesiones/2, 2));
        panel2Abajo = new JPanel(new BorderLayout());
        scroll = new JScrollPane(panel2Arriba); // scroll --> panel2Arriba
        scroll.setPreferredSize(new Dimension(400, 250));
       
        panel3 = new JPanel(new BorderLayout());
        panel3Arriba = new JPanel(new GridLayout(4, 2));
        panel3Abajo = new JPanel(new GridLayout(1, 2));

        contentPane.add(panel1);
        contentPane.add(panel2); // panel2
        contentPane.add(panel3);

        // panel 1

        /*//JPanel panelLabelImage = new JPanel();
        BufferedImage bufferedImage = ImageIO.read(new File("images/barco2.jpg"));
        Image image = bufferedImage.getScaledInstance(400, 200, Image.SCALE_DEFAULT);
		JLabel labelImage = new JLabel(new ImageIcon(image));
        //panelLabelImage.add(labelImage);

        panel1Izquierda.add(labelImage);*/


        

    

        JPanel panelBotonNuevaSesion = new JPanel();
        panelBotonNuevaSesion.setBackground(new Color(0, 0, 51));
        JButton botonNuevaSesion = new JButton("Crear nueva sesion");
        botonNuevaSesion.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonNuevaSesion.setBackground(Color.DARK_GRAY);
        botonNuevaSesion.setForeground(Color.WHITE);
        botonNuevaSesion.setPreferredSize(new Dimension(200, 50));
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
        panelBotonVerSesiones.setBackground(new Color(0, 0, 51));
        JButton botonVerSesiones = new JButton("Ver sesiones");
        botonVerSesiones.setPreferredSize(new Dimension(200, 50));
        botonVerSesiones.setForeground(Color.WHITE);
        botonVerSesiones.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonVerSesiones.setBackground(Color.DARK_GRAY);
        panelBotonVerSesiones.add(botonVerSesiones);

        botonVerSesiones.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    panel2.setVisible(true);
                    panel1.setVisible(false);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        JPanel panelBotonCerrarSesion = new JPanel();
        panelBotonCerrarSesion.setBackground(new Color(0, 0, 51));
        JButton botonCerrarSesion = new JButton("Cerrar sesión");
        botonCerrarSesion.setPreferredSize(new Dimension(110, 25));
        botonCerrarSesion.setForeground(Color.WHITE);
        botonCerrarSesion.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
        botonCerrarSesion.setBackground(Color.DARK_GRAY);
        panelBotonCerrarSesion.add(botonCerrarSesion);

        botonCerrarSesion.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    new LoginWindow();
                    dispose();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panel1Derecha.add(panelBotonNuevaSesion);
        panel1Derecha.add(panelBotonVerSesiones);
        panel1Derecha.add(panelBotonCerrarSesion);

        panel1.add(panel1Izquierda, BorderLayout.WEST);
        panel1.add(panel1Derecha, BorderLayout.EAST);

        // panel 2

        //numSesiones = 20;

        for (int i = 1; i <= numSesiones; i++) {
            JPanel panelBotonSesion = new JPanel();
            panelBotonSesion.setBackground(new Color(0, 0, 51));
            JButton botonSesion = new JButton("Sesión " + i);
            botonSesion.setBackground(Color.DARK_GRAY);
            botonSesion.setForeground(Color.WHITE);
            botonSesion.setPreferredSize(new Dimension(150, 25));
            panelBotonSesion.add(botonSesion);

            panel2Arriba.add(panelBotonSesion);

            botonSesion.addActionListener(new ActionListener() {
				
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    try {
                        panel3.setVisible(true);
                        panel2.setVisible(false);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
        }

        JPanel panelBotonAtras = new JPanel();
        panelBotonAtras.setBackground(new Color(0, 0, 51));
        JButton botonAtras = new JButton("Atrás");
        botonAtras.setPreferredSize(new Dimension(110, 25));
        botonAtras.setBackground(Color.LIGHT_GRAY);
        panelBotonAtras.add(botonAtras);

        botonAtras.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    panel2.setVisible(false);
                    panel1.setVisible(true);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panel2Abajo.add(panelBotonAtras);
        
        panel2.add(scroll, BorderLayout.NORTH);
        panel2.add(panel2Abajo, BorderLayout.SOUTH);

        // panel 3

        JPanel panelLabelAtributo1 = new JPanel();
        panelLabelAtributo1.setBackground(new Color(0, 0, 51));
        JLabel labelAtributo1 = new JLabel("Atributo 1");
        labelAtributo1.setForeground(Color.WHITE);
        panelLabelAtributo1.add(labelAtributo1);

        JPanel panelTextAtributo1 = new JPanel(); 
        panelTextAtributo1.setBackground(new Color(0, 0, 51));
        JTextField textAtributo1 = new JTextField();
        textAtributo1.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo1.add(textAtributo1);

        JPanel panelLabelAtributo2 = new JPanel();
        panelLabelAtributo2.setBackground(new Color(0, 0, 51));
        JLabel labelAtributo2 = new JLabel("Atributo 2");
        labelAtributo2.setForeground(Color.WHITE);
        panelLabelAtributo2.add(labelAtributo2);

        JPanel panelTextAtributo2 = new JPanel(); 
        panelTextAtributo2.setBackground(new Color(0, 0, 51));
        JTextField textAtributo2 = new JTextField();
        textAtributo2.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo2.add(textAtributo2);

        JPanel panelLabelAtributo3 = new JPanel();
        panelLabelAtributo3.setBackground(new Color(0, 0, 51));
        JLabel labelAtributo3 = new JLabel("Atributo 3");
        labelAtributo3.setForeground(Color.WHITE);
        panelLabelAtributo3.add(labelAtributo3);

        JPanel panelTextAtributo3 = new JPanel(); 
        panelTextAtributo3.setBackground(new Color(0, 0, 51));
        JTextField textAtributo3 = new JTextField();
        textAtributo3.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo3.add(textAtributo3);

        JPanel panelLabelAtributo4 = new JPanel();
        panelLabelAtributo4.setBackground(new Color(0, 0, 51));
        JLabel labelAtributo4 = new JLabel("Atributo 4");
        labelAtributo4.setForeground(Color.WHITE);
        panelLabelAtributo4.add(labelAtributo4);

        JPanel panelTextAtributo4 = new JPanel(); 
        panelTextAtributo4.setBackground(new Color(0, 0, 51));
        JTextField textAtributo4 = new JTextField();
        textAtributo4.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo4.add(textAtributo4);

        panel3Arriba.add(panelLabelAtributo1);
        panel3Arriba.add(panelTextAtributo1);
        panel3Arriba.add(panelLabelAtributo2);
        panel3Arriba.add(panelTextAtributo2);
        panel3Arriba.add(panelLabelAtributo3);
        panel3Arriba.add(panelTextAtributo3);
        panel3Arriba.add(panelLabelAtributo4);
        panel3Arriba.add(panelTextAtributo4);

        JPanel panelBotonAtras2 = new JPanel();
        panelBotonAtras2.setBackground(new Color(0, 0, 51));
        JButton botonAtras2 = new JButton("Atrás");
        botonAtras2.setPreferredSize(new Dimension(150, 25));
        botonAtras2.setBackground(Color.LIGHT_GRAY);
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
        panelBotonAceptar2.setBackground(new Color(0, 0, 51));
        JButton botonAceptar2 = new JButton("Aceptar");
        botonAceptar2.setPreferredSize(new Dimension(150, 25));
        botonAceptar2.setBackground(Color.LIGHT_GRAY);
        panelBotonAceptar2.add(botonAceptar2);

        botonAceptar2.addActionListener(new ActionListener() {
				
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

        panel3Abajo.add(panelBotonAtras2);
        panel3Abajo.add(panelBotonAceptar2);

        panel3.add(panel3Arriba, BorderLayout.NORTH);
        panel3.add(panel3Abajo, BorderLayout.SOUTH);

        //

        contentPane.setVisible(true);
        panel1.setVisible(true);
        panel2.setVisible(false);
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