package co.edu.unbosque.view;

import javax.swing.*;

public class VentanaInicioSesion extends JFrame{

	private JTextField usuario;
	private JTextField contraseña;
	private JButton iniciar;
	
	public VentanaInicioSesion() {
		setSize(715, 440);
		setResizable(false);
		setTitle("Bostinder");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		
		usuario = new JTextField();
		usuario.setBounds(250, 200, 80, 150);
		
		add(usuario);
	}
	
}
