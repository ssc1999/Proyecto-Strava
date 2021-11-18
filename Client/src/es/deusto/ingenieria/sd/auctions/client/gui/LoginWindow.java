package es.deusto.ingenieria.sd.auctions.client.gui;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class LoginWindow extends JFrame{

    private Container cp;

    private JPanel panelPrincipal;

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

        cp = this.getContentPane();
        this.setTitle("Login Window");
        this.setSize(850, 250);

        panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setSize(500, 200);

        // panel 1

        panel1 = new JPanel(new BorderLayout());

        panel1Arriba = new JPanel(new BorderLayout());
        panel1Medio = new JPanel(new GridLayout(2, 1));
        panel1Abajo = new JPanel(new BorderLayout());

        JPanel panelBotonStravaLogin = new JPanel();
        JButton botonStravaLogin = new JButton("Strava Login");
        botonStravaLogin.setPreferredSize(new Dimension(150, 25));
        panelBotonStravaLogin.add(botonStravaLogin);

        panel1Arriba.add(panelBotonStravaLogin);

        JPanel panelBotonGoogleLogin = new JPanel();
        JButton botonGoogleLogin = new JButton("Google Login");
        botonGoogleLogin.setPreferredSize(new Dimension(150, 25));
        panelBotonGoogleLogin.add(botonGoogleLogin);

        JPanel panelBotonFacebookLogin = new JPanel();
        JButton botonFacebookLogin = new JButton("Facebook Login");
        botonFacebookLogin.setPreferredSize(new Dimension(150, 25));
        panelBotonFacebookLogin.add(botonFacebookLogin);

        panel1Medio.add(panelBotonGoogleLogin);
        panel1Medio.add(panelBotonFacebookLogin);

        JPanel panelBotonRegistrarse = new JPanel();
        JButton botonRegistrarse = new JButton("Registrarse");
        botonRegistrarse.setPreferredSize(new Dimension(150, 25));
        panelBotonRegistrarse.add(botonRegistrarse);

        panel1Abajo.add(panelBotonRegistrarse);

        panel1.add(panel1Arriba);
        panel1.add(panel1Medio);
        panel1.add(panel1Abajo);

        // panel 2

        panel2 = new JPanel(new BorderLayout());

        panel2Arriba = new JPanel(new GridLayout(2, 4));
        panel2Abajo = new JPanel(new BorderLayout());

        JLabel atributo1 = new JLabel("Atributo 1");

        JPanel panelTextAtributo1 = new JPanel(); 
        JTextField textAtributo1 = new JPasswordField();
        textAtributo1.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo1.add(textAtributo1);

        JLabel atributo2 = new JLabel("Atributo 2");

        JPanel panelTextAtributo2 = new JPanel(); 
        JTextField textAtributo2 = new JPasswordField();
        textAtributo2.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo2.add(textAtributo2);

        JLabel atributo3 = new JLabel("Atributo 3");

        JPanel panelTextAtributo3 = new JPanel(); 
        JTextField textAtributo3 = new JPasswordField();
        textAtributo3.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo3.add(textAtributo3);

        JLabel atributo4 = new JLabel("Atributo 4");

        JPanel panelTextAtributo4 = new JPanel(); 
        JTextField textAtributo4 = new JPasswordField();
        textAtributo4.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo4.add(textAtributo4);

        JLabel atributo5 = new JLabel("Atributo 5");

        JPanel panelTextAtributo5 = new JPanel(); 
        JTextField textAtributo5 = new JPasswordField();
        textAtributo5.setPreferredSize(new Dimension(150, 25));
        panelTextAtributo5.add(textAtributo5);

        JLabel atributo6 = new JLabel("Atributo 4");

        JPanel panelTextAtributo6 = new JPanel(); 
        JTextField textAtributo6 = new JPasswordField();
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

        panel2Abajo.add(panelBotonRegistrarse);

        panel2.add(panel2Arriba);
        panel2.add(panel2Abajo);

        // panel 3

        panel3 = new JPanel(new BorderLayout());

        panel3Arriba = new JPanel(new GridLayout(2, 2));
        panel3Abajo = new JPanel(new BorderLayout());

        JLabel email = new JLabel("Email:");

        JPanel panelTextEmail = new JPanel(); 
        JTextField textEmail = new JPasswordField();
        textEmail.setPreferredSize(new Dimension(150, 25));
        panelTextEmail.add(textEmail);

        JLabel contrasenya = new JLabel("Contraseña:");

        JPanel panelTextContrasenya = new JPanel(); 
        JTextField textContrasenya = new JPasswordField();
        textContrasenya.setPreferredSize(new Dimension(150, 25));
        panelTextContrasenya.add(textContrasenya);

        panel3Arriba.add(email);
        panel3Arriba.add(panelTextEmail);
        panel3Arriba.add(contrasenya);
        panel3Arriba.add(panelTextContrasenya);

        JPanel panelBotonAceptar = new JPanel();
        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.setPreferredSize(new Dimension(150, 25));
        panelBotonAceptar.add(botonAceptar);

        panel3Abajo.add(panelBotonAceptar);

        panel3.add(panel3Arriba);
        panel3.add(panel3Abajo);

        //

        panelPrincipal.add(panel1);
        panelPrincipal.add(panel2);
        panelPrincipal.add(panel3);

        cp.add(panelPrincipal);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
		new LoginWindow();
	}
}