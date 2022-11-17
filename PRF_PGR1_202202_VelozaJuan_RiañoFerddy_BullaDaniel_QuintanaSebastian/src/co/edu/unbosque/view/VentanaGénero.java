package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class VentanaGénero extends JFrame{
	
	private JButton botcontinuar, botmasculino, botfemenino;
	private JLabel titulo;
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
		
		titulo = new JLabel("¿Qué eres?");
		titulo.setForeground(Color.red);
		Font font = new Font("Times New Roman", 1, 25);
		titulo.setFont(font);
		titulo.setBounds(80, 10, 150, 25);
		botmasculino = new JButton("Hombre");
		botmasculino.setActionCommand(HOMBRE);
		botmasculino.setBounds(40, 80, 90, 20);
		botcontinuar = new JButton("Continuar");
		botcontinuar.setActionCommand(CONTINUAR);
		botcontinuar.setBounds(95, 175, 90, 20);
		botfemenino = new JButton("Mujer");
		botfemenino.setActionCommand(MUJER);
		botfemenino.setBounds(160, 80, 90, 20);
		
		add(titulo);
		add(botcontinuar);
		add(botmasculino);
		add(botfemenino);
	
		
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
