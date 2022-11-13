package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class VentanaInicioSesion extends JFrame{

	private JLabel insUsuario;
	private JTextField usuario;
	private JLabel insContraseña;
	private JTextField contraseña;
	private JButton iniciar;
	private JLabel fondo;
	public static final String 	INICIAR = "iniciar";
	
	public VentanaInicioSesion() {
		setSize(715, 440);
		setResizable(false);
		setTitle("Bostinder");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		insUsuario = new JLabel("Ingresa tu usuario: ");
		insUsuario.setBounds(250, 115, 200, 35);
		usuario = new JTextField();
		usuario.setBounds(250, 150, 200, 35);
		usuario.setForeground(Color.black);
		usuario.setBackground(Color.white);
		insContraseña = new JLabel("Ingresa tu contraseña: ");
		insContraseña.setBounds(250, 180, 200, 35);
		contraseña = new JTextField();
		contraseña.setBounds(250, 215, 200, 35);
		contraseña.setForeground(Color.black);
		contraseña.setBackground(Color.white);
		iniciar = new JButton();
		ImageIcon imag1 = new ImageIcon(getClass().getResource("/Imagenes/3.png"));
		ImageIcon icono1 = new ImageIcon(imag1.getImage().getScaledInstance(260, 50, Image.SCALE_DEFAULT));
		iniciar.setIcon(icono1);
		iniciar.setActionCommand(INICIAR);
		iniciar.setBounds(220, 280, 260, 50);
		fondo = new JLabel();
		ImageIcon imag3 = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
		ImageIcon icono3 = new ImageIcon(imag3.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
		fondo.setIcon(icono3);
		fondo.setBounds(0, 0, 700, 400);
		
		add(insContraseña);
		add(insUsuario);
		add(contraseña);
		add(usuario);
		add(iniciar);
		add(fondo);
		
	}

	public JTextField getUsuario() {
		return usuario;
	}

	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}

	public JTextField getContraseña() {
		return contraseña;
	}

	public void setContraseña(JTextField contraseña) {
		this.contraseña = contraseña;
	}

	public JButton getIniciar() {
		return iniciar;
	}

	public void setIniciar(JButton iniciar) {
		this.iniciar = iniciar;
	}
	
	
	
}
