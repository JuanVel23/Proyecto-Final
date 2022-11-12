package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;

public class View {

	private VentanaInicial vi;
	private VentanaInicioSesion vis;
	
	public View(Controller control) {
		vi = new VentanaInicial();
		vis = new VentanaInicioSesion();
		
		vi.getIniciar().addActionListener(control);
		vi.getRegistrarse().addActionListener(control);
		vis.getIniciar().addActionListener(control);
	}

	
	
	public VentanaInicial getVi() {
		return vi;
	}

	public void setVi(VentanaInicial vi) {
		this.vi = vi;
	}

	public VentanaInicioSesion getVis() {
		return vis;
	}

	public void setVis(VentanaInicioSesion vis) {
		this.vis = vis;
	}
	
	
	
}
