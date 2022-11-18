package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class VentanaGénero extends JFrame{
	
	private JButton botcontinuar, botmasculino, botfemenino;
	private JLabel fondo;
	
	public static final String 	CONTINUAR = "Continuar";
	public static final String 	HOMBRE = "Hombre";
	public static final String 	MUJER = "Mujer";
	
	public VentanaGénero() {
		setSize(300,250);
		setResizable(false);
		setTitle("Género");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		botmasculino = new JButton("Hombre");
		ImageIcon imag1 = new ImageIcon(getClass().getResource("/Imagenes/BotonHombre.png"));
		ImageIcon icono1 = new ImageIcon(imag1.getImage().getScaledInstance(90, 40, Image.SCALE_DEFAULT));
		botmasculino.setIcon(icono1);
		botmasculino.setActionCommand(HOMBRE);
		botmasculino.setBounds(50, 90, 80, 40);
		botcontinuar = new JButton("Continuar");
		botcontinuar.setActionCommand(CONTINUAR);
		botcontinuar.setBounds(95, 175, 90, 30);
		botfemenino = new JButton("Mujer");
		ImageIcon imag2 = new ImageIcon(getClass().getResource("/Imagenes/BotonMujer.png"));
		ImageIcon icono2 = new ImageIcon(imag2.getImage().getScaledInstance(90, 40, Image.SCALE_DEFAULT));
		botfemenino.setIcon(icono2);
		botfemenino.setActionCommand(MUJER);
		botfemenino.setBounds(160, 90, 80, 40);
		fondo = new JLabel();
		ImageIcon imag3 = new ImageIcon(getClass().getResource("/Imagenes/FondoGenero.png"));
		ImageIcon icono3 = new ImageIcon(imag3.getImage().getScaledInstance(285, 210, Image.SCALE_DEFAULT));
		fondo.setIcon(icono3);
		fondo.setBounds(0, 0, 285, 210);
		
		add(botmasculino);
		add(botfemenino);
		add(fondo);
	
		
	}

	public JButton getBotcontinuar() {
		return botcontinuar;
	}

	public void setBotcontinuar(JButton botcontinuar) {
		this.botcontinuar = botcontinuar;
	}

	public JButton getBotmasculino() {
		return botmasculino;
	}

	public void setBotmasculino(JButton botmasculino) {
		this.botmasculino = botmasculino;
	}

	public JButton getBotfemenino() {
		return botfemenino;
	}

	public void setBotfemenino(JButton botfemenino) {
		this.botfemenino = botfemenino;
	}

	
	
	
}
