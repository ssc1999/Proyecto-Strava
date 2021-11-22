package es.deusto.ingenieria.sd.auctions.client.gui;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class LoginWindow extends JFrame{

    private JPanel contentPane;

    private JPanel panel1;
    private JPanel panel1Arriba;
    private JPanel panel1Medio;
    private JPanel panel1Abajo;

    private JPanel panel2;
    private JPanel panel2Arriba;
    private JPanel panel2Abajo;

    private JPanel panel3;
    private JPanel panel3Arriba;
    private JPanel panel3Abajo;

    public LoginWindow() {
        setBackground(new Color(0, 0, 51));

        setTitle("Login Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 330));
        setVisible(true);
        pack();

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        setContentPane(contentPane);

        panel1 = new JPanel(new BorderLayout());
        panel1.setBackground(new Color(0, 0, 51));
        panel1Arriba = new JPanel(new BorderLayout());
        panel1Arriba.setBackground(new Color(0, 0, 51));
        panel1Medio = new JPanel(new GridLayout(1, 2));
        panel1Medio.setBackground(new Color(0, 0, 51));
        panel1Abajo = new JPanel(new BorderLayout());
        panel1Abajo.setBackground(new Color(0, 0, 51));

        panel2 = new JPanel(new BorderLayout());
        panel2.setBackground(new Color(0, 0, 51));
        panel2Arriba = new JPanel(new GridLayout(6, 2));
        panel2Arriba.setBackground(new Color(0, 0, 51));
        panel2Abajo = new JPanel(new GridLayout(1, 2));
        panel2Abajo.setBackground(new Color(0, 0, 51));

        panel3 = new JPanel(new BorderLayout());
        panel3.setBackground(new Color(0, 0, 51));
        panel3Arriba = new JPanel(new GridLayout(2, 2));
        panel3Arriba.setBackground(new Color(0, 0, 51));
        panel3Abajo = new JPanel(new GridLayout(1, 2));
        panel3Abajo.setBackground(new Color(0, 0, 51));

        contentPane.add(panel1);
        contentPane.add(panel2);
        contentPane.add(panel3);

        // panel 1

        JPanel panelBotonStravaLogin = new JPanel();
        panelBotonStravaLogin.setBackground(new Color(0, 0, 51));
        JButton botonStravaLogin = new JButton("Strava Login");
        botonStravaLogin.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonStravaLogin.setBackground(Color.DARK_GRAY);
        botonStravaLogin.setForeground(Color.WHITE);
        botonStravaLogin.setPreferredSize(new Dimension(300, 50));
        panelBotonStravaLogin.add(botonStravaLogin);

        panel1Arriba.add(panelBotonStravaLogin);

        botonStravaLogin.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    panel3.setVisible(true);
                    panel1.setVisible(false);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        JPanel panelBotonGoogleLogin = new JPanel();
        panelBotonGoogleLogin.setBackground(new Color(0, 0, 51));
        JButton botonGoogleLogin = new JButton("Google Login");
        botonGoogleLogin.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonGoogleLogin.setBackground(Color.DARK_GRAY);
        botonGoogleLogin.setForeground(Color.WHITE);
        botonGoogleLogin.setPreferredSize(new Dimension(160, 25));
        panelBotonGoogleLogin.add(botonGoogleLogin);

        botonGoogleLogin.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    panel3.setVisible(true);
                    panel1.setVisible(false);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        JPanel panelBotonFacebookLogin = new JPanel();
        panelBotonFacebookLogin.setBackground(new Color(0, 0, 51));
        JButton botonFacebookLogin = new JButton("Facebook Login");
        botonFacebookLogin.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonFacebookLogin.setBackground(Color.DARK_GRAY);
        botonFacebookLogin.setForeground(Color.WHITE);
        botonFacebookLogin.setPreferredSize(new Dimension(160, 25));
        panelBotonFacebookLogin.add(botonFacebookLogin);

        botonFacebookLogin.addActionListener(new ActionListener() {
				
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    panel3.setVisible(true);
                    panel1.setVisible(false);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        panel1Medio.add(panelBotonGoogleLogin);
        panel1Medio.add(panelBotonFacebookLogin);

        JPanel panelBotonRegistrarse = new JPanel();
        panelBotonRegistrarse.setBackground(new Color(0, 0, 51));
        JButton botonRegistrarse = new JButton("Registrarse");
        botonRegistrarse.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonRegistrarse.setBackground(Color.DARK_GRAY);
        botonRegistrarse.setForeground(Color.WHITE);
        botonRegistrarse.setPreferredSize(new Dimension(150, 40));
        panelBotonRegistrarse.add(botonRegistrarse);

        botonRegistrarse.addActionListener(new ActionListener() {
				
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

        panel1Abajo.add(panelBotonRegistrarse);

        panel1.add(panel1Arriba, BorderLayout.NORTH);
        panel1.add(panel1Medio, BorderLayout.CENTER);
        panel1.add(panel1Abajo, BorderLayout. SOUTH);

        panel1.setVisible(true);

        // panel 2

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

        JPanel panelLabelAtributo5 = new JPanel();
        panelLabelAtributo5.setBackground(new Color(0, 0, 51));
        JLabel labelAtributo5 = new JLabel("Atributo 5");
        labelAtributo5.setForeground(Color.WHITE);
        panelLabelAtributo5.add(labelAtributo5);

        JPanel panelTextAtributo5 = new JPanel(); 
        panelTextAtributo5.setBackground(new Color(0, 0, 51));
        JTextField textAtributo5 = new JTextField();
        textAtributo5.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo5.add(textAtributo5);

        JPanel panelLabelAtributo6 = new JPanel();
        panelLabelAtributo6.setBackground(new Color(0, 0, 51));
        JLabel labelAtributo6 = new JLabel("Atributo 6");
        labelAtributo6.setForeground(Color.WHITE);
        panelLabelAtributo6.add(labelAtributo6);

        JPanel panelTextAtributo6 = new JPanel(); 
        panelTextAtributo6.setBackground(new Color(0, 0, 51));
        JTextField textAtributo6 = new JTextField();
        textAtributo6.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo6.add(textAtributo6);

        panel2Arriba.add(panelLabelAtributo1);
        panel2Arriba.add(panelTextAtributo1);
        panel2Arriba.add(panelLabelAtributo2);
        panel2Arriba.add(panelTextAtributo2);
        panel2Arriba.add(panelLabelAtributo3);
        panel2Arriba.add(panelTextAtributo3);
        panel2Arriba.add(panelLabelAtributo4);
        panel2Arriba.add(panelTextAtributo4);
        panel2Arriba.add(panelLabelAtributo5);
        panel2Arriba.add(panelTextAtributo5);
        panel2Arriba.add(panelLabelAtributo6);
        panel2Arriba.add(panelTextAtributo6);

        JPanel panelBotonRegistrarse2 = new JPanel();
        panelBotonRegistrarse2.setBackground(new Color(0, 0, 51));
        JButton botonRegistrarse2 = new JButton("Registrarse");
        botonRegistrarse2.setBackground(Color.LIGHT_GRAY);
        botonRegistrarse2.setPreferredSize(new Dimension(150, 25));
        panelBotonRegistrarse2.add(botonRegistrarse2);

        botonRegistrarse2.addActionListener(new ActionListener() {
				
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

        JPanel panelBotonAtras = new JPanel();
        panelBotonAtras.setBackground(new Color(0, 0, 51));
        JButton botonAtras = new JButton("Atrás");
        botonAtras.setBackground(Color.LIGHT_GRAY);
        botonAtras.setPreferredSize(new Dimension(150, 25));
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
        panel2Abajo.add(panelBotonRegistrarse2);

        panel2.add(panel2Arriba, BorderLayout.NORTH);
        panel2.add(panel2Abajo, BorderLayout.SOUTH);

        // panel 3

        JPanel panelLabelEmail = new JPanel(); 
        panelLabelEmail.setBackground(new Color(0, 0, 51));
        JLabel labelEmail = new JLabel("Email:");
        labelEmail.setForeground(Color.WHITE);
        panelLabelEmail.add(labelEmail);

        JPanel panelTextEmail = new JPanel();
        panelTextEmail.setBackground(new Color(0, 0, 51));
        JTextField textEmail = new JTextField();
        textEmail.setPreferredSize(new Dimension(150, 25));
        panelTextEmail.add(textEmail);

        JPanel panelLabelContrasenya = new JPanel();
        panelLabelContrasenya.setBackground(new Color(0, 0, 51));
        JLabel labelContrasenya = new JLabel("Contraseña:");
        labelContrasenya.setForeground(Color.WHITE);
        panelLabelContrasenya.add(labelContrasenya);

        JPanel panelTextContrasenya = new JPanel();
        panelTextContrasenya.setBackground(new Color(0, 0, 51));
        JTextField textContrasenya = new JPasswordField();
        textContrasenya.setPreferredSize(new Dimension(150, 25));
        panelTextContrasenya.add(textContrasenya);

        panel3Arriba.add(panelLabelEmail);
        panel3Arriba.add(panelTextEmail);
        panel3Arriba.add(panelLabelContrasenya);
        panel3Arriba.add(panelTextContrasenya);

        JPanel panelBotonAceptar = new JPanel();
        panelBotonAceptar.setBackground(new Color(0, 0, 51));
        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.setBackground(Color.LIGHT_GRAY);
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

        JPanel panelBotonAtras2 = new JPanel();
        panelBotonAtras2.setBackground(new Color(0, 0, 51));
        JButton botonAtras2 = new JButton("Atrás");
        botonAtras2.setBackground(Color.LIGHT_GRAY);
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

        panel3Abajo.add(panelBotonAtras2);
        panel3Abajo.add(panelBotonAceptar);

        panel3.add(panel3Arriba, BorderLayout.NORTH);
        panel3.add(panel3Abajo, BorderLayout. SOUTH);

        //

        contentPane.setVisible(true);
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
    }

    public static void main(String[] args) throws IOException {
		new LoginWindow();
	}
}