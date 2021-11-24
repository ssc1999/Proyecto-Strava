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
        panel3Arriba = new JPanel(new GridLayout(7, 2));
        panel3Abajo = new JPanel(new GridLayout(1, 2));

        contentPane.add(panel1);
        contentPane.add(panel2); // panel2
        contentPane.add(panel3);

        // panel 1

        /*BufferedImage bufferedImage = ImageIO.read(new File("images/barco2.jpg"));
        Image image = bufferedImage.getScaledInstance(200, 100, Image.SCALE_DEFAULT);
		panel1Izquierda.add(new JLabel(new ImageIcon(image)));*/

        JPanel panelBotonNuevaSesion = new JPanel();
        panelBotonNuevaSesion.setBackground(new Color(0, 0, 51));
        JButton botonNuevaSesion = new JButton("Crear nueva actividad"); // crear nueva sesión
        botonNuevaSesion.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonNuevaSesion.setBackground(Color.DARK_GRAY);
        botonNuevaSesion.setForeground(Color.WHITE);
        botonNuevaSesion.setPreferredSize(new Dimension(200, 50));
        panelBotonNuevaSesion.add(botonNuevaSesion);

        /*botonNuevaSesion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    panel3.setVisible(true);
                    panel1.setVisible(false);
                    botonAceptar2.setVisible(true);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });*/

        JPanel panelBotonVerSesiones = new JPanel();
        panelBotonVerSesiones.setBackground(new Color(0, 0, 51));
        JButton botonVerSesiones = new JButton("Ver actividades"); // ver sesión
        botonVerSesiones.setPreferredSize(new Dimension(200, 50));
        botonVerSesiones.setForeground(Color.WHITE);
        botonVerSesiones.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonVerSesiones.setBackground(Color.DARK_GRAY);
        panelBotonVerSesiones.add(botonVerSesiones);

        /*botonVerSesiones.addActionListener(new ActionListener() {

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
        });*/

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

        for (int i = 1; i <= numSesiones; i++) {
            JPanel panelBotonSesion = new JPanel();
            panelBotonSesion.setBackground(new Color(0, 0, 51));
            JButton botonSesion = new JButton("Actividad " + i);
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

        JPanel panelLabelId = new JPanel();
        panelLabelId.setBackground(new Color(0, 0, 51));
        JLabel labelId = new JLabel("Id: ");
        labelId.setForeground(Color.WHITE);
        panelLabelId.add(labelId);

        JPanel panelLabelId2 = new JPanel(); 
        panelLabelId2.setBackground(new Color(0, 0, 51));
        JLabel LabelId2 = new JLabel(); // que coja el id
        LabelId2.setPreferredSize(new Dimension(150, 25));
        panelLabelId2.add(LabelId2);

        JPanel panelLabelTittle = new JPanel();
        panelLabelTittle.setBackground(new Color(0, 0, 51));
        JLabel labelTittle = new JLabel("Título: ");
        labelTittle.setForeground(Color.WHITE);
        panelLabelTittle.add(labelTittle);

        JPanel panelTextTittle = new JPanel(); 
        panelTextTittle.setBackground(new Color(0, 0, 51));
        JTextField textTittle = new JTextField();
        textTittle.setPreferredSize(new Dimension(150, 25));
        panelTextTittle.add(textTittle);

        JPanel panelLabelSport = new JPanel();
        panelLabelSport.setBackground(new Color(0, 0, 51));
        JLabel labelSport = new JLabel("Deporte: ");
        labelSport.setForeground(Color.WHITE);
        panelLabelSport.add(labelSport);

        JPanel panelTextSport = new JPanel(); 
        panelTextSport.setBackground(new Color(0, 0, 51));
        JTextField textSport = new JTextField();
        textSport.setPreferredSize(new Dimension(150, 25));
        panelTextSport.add(textSport);

        JPanel panelLabelDistance = new JPanel();
        panelLabelDistance.setBackground(new Color(0, 0, 51));
        JLabel labelDistance = new JLabel("Distancia: ");
        labelDistance.setForeground(Color.WHITE);
        panelLabelDistance.add(labelDistance);

        JPanel panelTextDistance = new JPanel(); 
        panelTextDistance.setBackground(new Color(0, 0, 51));
        JTextField textDistance = new JTextField();
        textDistance.setPreferredSize(new Dimension(150, 25));
        panelTextDistance.add(textDistance);

        JPanel panelLabelIDate = new JPanel();
        panelLabelIDate.setBackground(new Color(0, 0, 51));
        JLabel labelIDate = new JLabel("Fecha inicial: ");
        labelIDate.setForeground(Color.WHITE);
        panelLabelIDate.add(labelIDate);

        JPanel panelTextIDate = new JPanel(); 
        panelTextIDate.setBackground(new Color(0, 0, 51));
        JTextField textIDate = new JTextField();
        textIDate.setPreferredSize(new Dimension(150, 25));
        panelTextIDate.add(textIDate);

        JPanel panelLabelIHour = new JPanel();
        panelLabelIHour.setBackground(new Color(0, 0, 51));
        JLabel labelIHour = new JLabel("Hora inicial: ");
        labelIHour.setForeground(Color.WHITE);
        panelLabelIHour.add(labelIHour);

        JPanel panelTextIHour = new JPanel(); 
        panelTextIHour.setBackground(new Color(0, 0, 51));
        JTextField textIHour = new JTextField();
        textIHour.setPreferredSize(new Dimension(150, 25));
        panelTextIHour.add(textIHour);

        JPanel panelLabelDuration = new JPanel();
        panelLabelDuration.setBackground(new Color(0, 0, 51));
        JLabel labelDuration = new JLabel("Duración: ");
        labelDuration.setForeground(Color.WHITE);
        panelLabelDuration.add(labelDuration);

        JPanel panelTextDuration = new JPanel(); 
        panelTextDuration.setBackground(new Color(0, 0, 51));
        JTextField textDuration = new JTextField();
        textDuration.setPreferredSize(new Dimension(150, 25));
        panelTextDuration.add(textDuration);

        panel3Arriba.add(panelLabelId);
        panel3Arriba.add(panelLabelId2);
        panel3Arriba.add(panelLabelTittle);
        panel3Arriba.add(panelTextTittle);
        panel3Arriba.add(panelLabelSport);
        panel3Arriba.add(panelTextSport);
        panel3Arriba.add(panelLabelDistance);
        panel3Arriba.add(panelTextDistance);
        panel3Arriba.add(panelLabelIDate);
        panel3Arriba.add(panelTextIDate);
        panel3Arriba.add(panelLabelIHour);
        panel3Arriba.add(panelTextIHour);
        panel3Arriba.add(panelLabelDuration);
        panel3Arriba.add(panelTextDuration);

        JPanel panelBotonAtras2 = new JPanel();
        panelBotonAtras2.setBackground(new Color(0, 0, 51));
        JButton botonAtras2 = new JButton("Atrás");
        botonAtras2.setPreferredSize(new Dimension(150, 25));
        botonAtras2.setBackground(Color.LIGHT_GRAY);
        panelBotonAtras2.add(botonAtras2);

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

        // lo pongo aquí para que coja el botonAceptar2

        botonAtras2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    if (botonAceptar2.isVisible()) {
                        panel3.setVisible(false);
                        panel1.setVisible(true);
                    } else {
                        panel3.setVisible(false);
                        panel2.setVisible(true);
                    }
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

        // lo pongo aquí porque si no no coge el botón aceptar2

        botonNuevaSesion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    panel3.setVisible(true);
                    panel1.setVisible(false);
                    botonAceptar2.setVisible(true);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        botonVerSesiones.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    panel2.setVisible(true);
                    panel1.setVisible(false);
                    botonAceptar2.setVisible(false);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
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