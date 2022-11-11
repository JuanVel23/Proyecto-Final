package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;

public class VentanaInicial  extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JButton iniciar;
	private JButton registrarse;
	private JLabel fondo;
	public static final String INICIAR = "iniciar";
	public static final String REGISTRAR = "registrarse";
	
	public VentanaInicial() {
		 
		setSize(715, 440);
		setResizable(false);
		setTitle("Bostinder");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		
		iniciar = new JButton();
		ImageIcon imag1 = new ImageIcon(getClass().getResource("/Imagenes/2.png"));
		ImageIcon icono1 = new ImageIcon(imag1.getImage().getScaledInstance(260, 50, Image.SCALE_DEFAULT));
		iniciar.setIcon(icono1);
		iniciar.setActionCommand(INICIAR);
		iniciar.setBounds(260, 220, 260, 50);
		registrarse = new JButton();
		ImageIcon imag2 = new ImageIcon(getClass().getResource("/Imagenes/1.png"));
		ImageIcon icono2 = new ImageIcon(imag2.getImage().getScaledInstance(260, 50, Image.SCALE_DEFAULT));
		registrarse.setIcon(icono2);
		registrarse.setActionCommand(REGISTRAR);
		registrarse.setBounds(260, 290, 260, 50);
		fondo = new JLabel();
		ImageIcon imag3 = new ImageIcon(getClass().getResource("/Imagenes/Fondo.png"));
		ImageIcon icono3 = new ImageIcon(imag3.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
		fondo.setIcon(icono3);
		fondo.setBounds(0, 0, 700, 400);
		
	
		add(iniciar);
		add(registrarse);
		add(fondo);
		
	}

	public JButton getIniciar() {
		return iniciar;
	}

	public void setIniciar(JButton iniciar) {
		this.iniciar = iniciar;
	}

	public JButton getRegistrarse() {
		return registrarse;
	}

	public void setRegistrarse(JButton registrarse) {
		this.registrarse = registrarse;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}
	
	
}
