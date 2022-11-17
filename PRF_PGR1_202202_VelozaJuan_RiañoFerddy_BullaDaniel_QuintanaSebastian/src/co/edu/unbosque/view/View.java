package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;

public class View {

	private VentanaInicial vi;
	private VentanaInicioSesion vis;
	private VentanaRegistrarse vresg;
	private VentanaGénero veg;
	
	public View(Controller control) {
		vi = new VentanaInicial();
		vis = new VentanaInicioSesion();
		vresg = new VentanaRegistrarse();
		veg = new VentanaGénero();
		
		
		vi.getIniciar().addActionListener(control);
		vi.getRegistrarse().addActionListener(control);
		vis.getIniciar().addActionListener(control);
		veg.getBotcontinuar().addActionListener(control);
		
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



	public VentanaRegistrarse getVresg() {
		return vresg;
	}



	public void setVresg(VentanaRegistrarse vresg) {
		this.vresg = vresg;
	}



	public VentanaGénero getVeg() {
		return veg;
	}



	public void setVeg(VentanaGénero veg) {
		this.veg = veg;
	}
	
	
	
}
