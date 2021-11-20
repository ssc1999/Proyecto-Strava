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

        setTitle("Login Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 330));
        setVisible(true);
        pack();

        contentPane = new JPanel();
        setContentPane(contentPane);

        panel1 = new JPanel(new BorderLayout());
        panel1Arriba = new JPanel(new BorderLayout());
        panel1Medio = new JPanel(new GridLayout(1, 2));
        panel1Abajo = new JPanel(new BorderLayout());

        panel2 = new JPanel(new BorderLayout());
        panel2Arriba = new JPanel(new GridLayout(6, 2));
        panel2Abajo = new JPanel(new GridLayout(1, 2));

        panel3 = new JPanel(new BorderLayout());
        panel3Arriba = new JPanel(new GridLayout(2, 2));
        panel3Abajo = new JPanel(new GridLayout(1, 2));

        contentPane.add(panel1);
        contentPane.add(panel2);
        contentPane.add(panel3);

        // panel 1

        JPanel panelBotonStravaLogin = new JPanel();
        JButton botonStravaLogin = new JButton("Strava Login");
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
        JButton botonGoogleLogin = new JButton("Google Login");
        botonGoogleLogin.setPreferredSize(new Dimension(150, 25));
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
        JButton botonFacebookLogin = new JButton("Facebook Login");
        botonFacebookLogin.setPreferredSize(new Dimension(150, 25));
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
        JButton botonRegistrarse = new JButton("Registrarse");
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

        JLabel atributo5 = new JLabel("Atributo 5");

        JPanel panelTextAtributo5 = new JPanel(); 
        JTextField textAtributo5 = new JTextField();
        textAtributo5.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo5.add(textAtributo5);

        JLabel atributo6 = new JLabel("Atributo 6");

        JPanel panelTextAtributo6 = new JPanel(); 
        JTextField textAtributo6 = new JTextField();
        textAtributo6.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo6.add(textAtributo6);

        panel2Arriba.add(atributo1);
        panel2Arriba.add(panelTextAtributo1);
        panel2Arriba.add(atributo2);
        panel2Arriba.add(panelTextAtributo2);
        panel2Arriba.add(atributo3);
        panel2Arriba.add(panelTextAtributo3);
        panel2Arriba.add(atributo4);
        panel2Arriba.add(panelTextAtributo4);
        panel2Arriba.add(atributo5);
        panel2Arriba.add(panelTextAtributo5);
        panel2Arriba.add(atributo6);
        panel2Arriba.add(panelTextAtributo6);

        JPanel panelBotonRegistrarse2 = new JPanel();
        JButton botonRegistrarse2 = new JButton("Registrarse");
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
        JButton botonAtras = new JButton("Atrás");
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
        JLabel email = new JLabel("Email:");
        panelLabelEmail.add(email);

        JPanel panelTextEmail = new JPanel(); 
        JTextField textEmail = new JTextField();
        textEmail.setPreferredSize(new Dimension(150, 25));
        panelTextEmail.add(textEmail);

        JPanel panelLabelContrasenya = new JPanel(); 
        JLabel contrasenya = new JLabel("Contraseña:");
        panelLabelContrasenya.add(contrasenya);

        JPanel panelTextContrasenya = new JPanel(); 
        JTextField textContrasenya = new JPasswordField();
        textContrasenya.setPreferredSize(new Dimension(150, 25));
        panelTextContrasenya.add(textContrasenya);

        panel3Arriba.add(panelLabelEmail);
        panel3Arriba.add(panelTextEmail);
        panel3Arriba.add(panelLabelContrasenya);
        panel3Arriba.add(panelTextContrasenya);

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