package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class VentanaRegistrarse extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel fondo;
	private ButtonGroup genero;
	private JButton botcontinuar1, botcontinuar2;
	public static final String 	CONTINUAR1 = "Continuar1";
	public static final String 	CONTINUAR2 = "Continuar2";
	
	public VentanaRegistrarse() {
		setSize(715,440);
		setResizable(false);
		setTitle("Bostinder");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		fondo = new JLabel();
		ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
		ImageIcon icono = new ImageIcon(img.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
		fondo.setIcon(icono);
		fondo.setBounds(0, 0, 700, 400);
		
		JPanel aux1 = new JPanel();
		aux1.setVisible(true);
		TitledBorder border = BorderFactory.createTitledBorder("Selecciona tu género");
		border.setTitleColor(Color.BLACK);
		aux1.setBorder( border );
		aux1.setBounds(0, 0, 700, 100);
		genero = new ButtonGroup();
		JRadioButton masculino = new JRadioButton("Hombre");
		JRadioButton femenino = new JRadioButton("Mujer");
		genero.add(masculino);
		genero.add(femenino);
		botcontinuar1 = new JButton();
		botcontinuar1.setActionCommand(CONTINUAR1);
		
		
		aux1.add(botcontinuar1);
		aux1.add(masculino);
		aux1.add(femenino);
		
		
		add(aux1);
		add(fondo);
	}
}
