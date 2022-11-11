package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View gui;
	
	public Controller() {
		gui = new View(this);
		gui.getVi().setVisible(true);
		gui.getVis().setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(gui.getVi().INICIAR));
			gui.getVi().setVisible(false);
			gui.getVis().setVisible(true);
	}
	
	
}
