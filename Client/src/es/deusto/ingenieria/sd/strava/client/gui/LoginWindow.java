package es.deusto.ingenieria.sd.strava.client.gui;

import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import es.deusto.ingenieria.sd.strava.client.controller.LoginController;
import es.deusto.ingenieria.sd.strava.client.controller.SessionController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class LoginWindow extends JFrame{

    private JPanel contentPane;

    private JPanel panel1;
    private JPanel panel1Arriba;
    private JPanel panel1ArribaDerecha;
    private JPanel panel1ArribaIzquierda;
    private JPanel panel1Abajo;

    private JPanel panel2;
    private JPanel panel2Arriba;
    private JPanel panel2Abajo;

    private JPanel panel3;
    private JPanel panel3Arriba;
    private JPanel panel3Medio;
    private JPanel panel3Abajo;
    
    private static LoginController controller;	
    private SessionController sessionController;
    
	private String email = "thomas.e2001@gmail.com";
	private String password = "$!9PhNz,";
    
	public LoginWindow(LoginController controller
			
			) throws IOException {
    	
        setBackground(new Color(0, 0, 51));

        setTitle("Login Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(550, 350));
        setVisible(true);
        pack();

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        setContentPane(contentPane);

        panel1 = new JPanel(new BorderLayout());
        panel1.setBackground(new Color(0, 0, 51));
        panel1Arriba = new JPanel(new BorderLayout());
        panel1Arriba.setBackground(new Color(0, 0, 51));
        panel1ArribaDerecha = new JPanel(new GridLayout(3, 1));
        panel1ArribaDerecha.setBackground(new Color(0, 0, 51));
        panel1ArribaIzquierda = new JPanel(new BorderLayout());
        panel1ArribaIzquierda.setBackground(new Color(0, 0, 51));
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
        panel3Arriba = new JPanel(new BorderLayout());
        panel3Arriba.setBackground(new Color(0, 0, 51));
        panel3Medio = new JPanel(new GridLayout(2, 2));
        panel3Medio.setBackground(new Color(0, 0, 51));
        panel3Abajo = new JPanel(new GridLayout(1, 2));
        panel3Abajo.setBackground(new Color(0, 0, 51));

        contentPane.add(panel1);
        contentPane.add(panel2);
        contentPane.add(panel3);

        // panel 1

        Border border2 = panel1Arriba.getBorder();
        Border margin2 = new EmptyBorder(40, 0, 0, 10);
        panel1ArribaIzquierda.setBorder(new CompoundBorder(border2, margin2));

        Border border3 = panel1Arriba.getBorder();
        Border margin3 = new EmptyBorder(40, 10, 0, 0);
        panel1ArribaDerecha.setBorder(new CompoundBorder(border3, margin3));

        BufferedImage bufferedImage = ImageIO.read(new File("images/strava2.png"));
        Image image = bufferedImage.getScaledInstance(270, 170, Image.SCALE_DEFAULT);

        panel1ArribaIzquierda.add(new JLabel(new ImageIcon(image)));

        JPanel panelBotonStravaLogin = new JPanel();
        panelBotonStravaLogin.setBackground(new Color(0, 0, 51));
        JButton botonStravaLogin = new JButton("Strava Login");
        botonStravaLogin.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonStravaLogin.setBackground(Color.DARK_GRAY);
        botonStravaLogin.setForeground(Color.BLACK);
        botonStravaLogin.setPreferredSize(new Dimension(190, 35));
        panelBotonStravaLogin.add(botonStravaLogin);

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
        botonGoogleLogin.setForeground(Color.BLACK);
        botonGoogleLogin.setPreferredSize(new Dimension(160, 35));
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
        botonFacebookLogin.setForeground(Color.BLACK);
        botonFacebookLogin.setPreferredSize(new Dimension(160, 35));
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

        panel1ArribaDerecha.add(panelBotonStravaLogin);
        panel1ArribaDerecha.add(panelBotonGoogleLogin);
        panel1ArribaDerecha.add(panelBotonFacebookLogin);

        panel1Arriba.add(panel1ArribaDerecha, BorderLayout.EAST);
        panel1Arriba.add(panel1ArribaIzquierda, BorderLayout.WEST);    
        
        Border border4 = panel1Abajo.getBorder();
        Border margin4 = new EmptyBorder(20, 0, 0, 0);
        panel1Abajo.setBorder(new CompoundBorder(border4, margin4));

        JPanel panelBotonRegistrarse = new JPanel();
        panelBotonRegistrarse.setBackground(new Color(0, 0, 51));
        JButton botonRegistrarse = new JButton("Registrarse");
        botonRegistrarse.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
        botonRegistrarse.setBackground(Color.DARK_GRAY);
        botonRegistrarse.setForeground(Color.BLACK);
        botonRegistrarse.setPreferredSize(new Dimension(120, 30));
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
        panel1.add(panel1Abajo, BorderLayout. SOUTH);

        panel1.setVisible(true);

        // panel 2

        Border border5 = panel2Arriba.getBorder();
        Border margin5 = new EmptyBorder(25, 0, 0, 0);
        panel2Arriba.setBorder(new CompoundBorder(border5, margin5));

        JPanel panelLabelEmail = new JPanel();
        panelLabelEmail.setBackground(new Color(0, 0, 51));
        JLabel labelEmail = new JLabel("Email: ");
        labelEmail.setForeground(Color.WHITE);
        panelLabelEmail.add(labelEmail);

        JPanel panelTextEmail = new JPanel(); 
        panelTextEmail.setBackground(new Color(0, 0, 51));
        JTextField textEmail = new JTextField();
        textEmail.setPreferredSize(new Dimension(150, 25));
        panelTextEmail.add(textEmail);

        JPanel panelLabelContrasenya = new JPanel();
        panelLabelContrasenya.setBackground(new Color(0, 0, 51));
        JLabel labelContrasenya = new JLabel("Contraseña: ");
        labelContrasenya.setForeground(Color.WHITE);
        panelLabelContrasenya.add(labelContrasenya);

        JPanel panelTextContrasenya = new JPanel(); 
        panelTextContrasenya.setBackground(new Color(0, 0, 51));
        JTextField textContrasenya = new JPasswordField();
        textContrasenya.setPreferredSize(new Dimension(150, 25));
        panelTextContrasenya.add(textContrasenya);

        JPanel panelLabelName = new JPanel();
        panelLabelName.setBackground(new Color(0, 0, 51));
        JLabel labelName = new JLabel("Nombre: ");
        labelName.setForeground(Color.WHITE);
        panelLabelName.add(labelName);

        JPanel panelTextName = new JPanel(); 
        panelTextName.setBackground(new Color(0, 0, 51));
        JTextField textName = new JTextField();
        textName.setPreferredSize(new Dimension(150, 25));
        panelTextName.add(textName);

        JPanel panelLabelWeight = new JPanel();
        panelLabelWeight.setBackground(new Color(0, 0, 51));
        JLabel labelWeight = new JLabel("Peso: ");
        labelWeight.setForeground(Color.WHITE);
        panelLabelWeight.add(labelWeight);

        JPanel panelTextWeight = new JPanel(); 
        panelTextWeight.setBackground(new Color(0, 0, 51));
        JTextField textWeight = new JTextField();
        textWeight.setPreferredSize(new Dimension(150, 25));
        panelTextWeight.add(textWeight);

        JPanel panelLabelHeight = new JPanel();
        panelLabelHeight.setBackground(new Color(0, 0, 51));
        JLabel labelHeight = new JLabel("Altura: ");
        labelHeight.setForeground(Color.WHITE);
        panelLabelHeight.add(labelHeight);

        JPanel panelTextHeight = new JPanel(); 
        panelTextHeight.setBackground(new Color(0, 0, 51));
        JTextField textHeight = new JTextField();
        textHeight.setPreferredSize(new Dimension(150, 25));
        panelTextHeight.add(textHeight);

        JPanel panelLabelBirthDate = new JPanel();
        panelLabelBirthDate.setBackground(new Color(0, 0, 51));
        JLabel labelBirthDate = new JLabel("Fecha de nacimiento: ");
        labelBirthDate.setForeground(Color.WHITE);
        panelLabelBirthDate.add(labelBirthDate);

        JPanel panelTextBirthDate = new JPanel(); 
        panelTextBirthDate.setBackground(new Color(0, 0, 51));
        JTextField textBirthDate = new JTextField();
        textBirthDate.setPreferredSize(new Dimension(150, 25));
        panelTextBirthDate.add(textBirthDate);

        panel2Arriba.add(panelLabelEmail);
        panel2Arriba.add(panelTextEmail);
        panel2Arriba.add(panelLabelContrasenya);
        panel2Arriba.add(panelTextContrasenya);
        panel2Arriba.add(panelLabelName);
        panel2Arriba.add(panelTextName);
        panel2Arriba.add(panelLabelWeight);
        panel2Arriba.add(panelTextWeight);
        panel2Arriba.add(panelLabelHeight);
        panel2Arriba.add(panelTextHeight);
        panel2Arriba.add(panelLabelBirthDate);
        panel2Arriba.add(panelTextBirthDate);

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
                    panel2.setVisible(false);
                    panel1.setVisible(true);
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

        Border border6 = panel3Arriba.getBorder();
        Border margin6 = new EmptyBorder(55, 0, 20, 0);
        panel3Arriba.setBorder(new CompoundBorder(border6, margin6));

        JPanel panelLabelIniciarSesion = new JPanel(); 
        panelLabelIniciarSesion.setBackground(new Color(0, 0, 51));
        JLabel labelIniciarSesion = new JLabel("INICIAR SESIÓN");
        labelIniciarSesion.setFont(new Font("", Font.PLAIN, 18));
        labelIniciarSesion.setForeground(Color.WHITE);
        panelLabelIniciarSesion.add(labelIniciarSesion);

        panel3Arriba.add(panelLabelIniciarSesion);

        JPanel panelLabelEmail2 = new JPanel(); 
        panelLabelEmail2.setBackground(new Color(0, 0, 51));
        JLabel labelEmail2 = new JLabel("Email:");
        labelEmail2.setForeground(Color.WHITE);
        panelLabelEmail2.add(labelEmail2);

        JPanel panelTextEmail2 = new JPanel();
        panelTextEmail2.setBackground(new Color(0, 0, 51));
        JTextField textEmail2 = new JTextField();
        textEmail2.setPreferredSize(new Dimension(150, 25));
        panelTextEmail2.add(textEmail2);

        JPanel panelLabelContrasenya2 = new JPanel();
        panelLabelContrasenya2.setBackground(new Color(0, 0, 51));
        JLabel labelContrasenya2 = new JLabel("Contraseña:");
        labelContrasenya2.setForeground(Color.WHITE);
        panelLabelContrasenya2.add(labelContrasenya2);

        JPanel panelTextContrasenya2 = new JPanel();
        panelTextContrasenya2.setBackground(new Color(0, 0, 51));
        JTextField textContrasenya2 = new JPasswordField();
        textContrasenya2.setPreferredSize(new Dimension(150, 25));
        panelTextContrasenya2.add(textContrasenya2);

        panel3Medio.add(panelLabelEmail2);
        panel3Medio.add(panelTextEmail2);
        panel3Medio.add(panelLabelContrasenya2);
        panel3Medio.add(panelTextContrasenya2);

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
                    new SessionWindow(sessionController);
                    dispose();
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
        panel3.add(panel3Medio, BorderLayout.CENTER);
        panel3.add(panel3Abajo, BorderLayout. SOUTH);

        //

        contentPane.setVisible(true);
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
    }

    public static void main(String[] args) throws IOException {
		new LoginWindow(controller);
	}
}