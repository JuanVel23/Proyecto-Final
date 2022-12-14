package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;

public class View {

	private VentanaInicial vi;
	private VentanaInicioSesion vis;
	private VentanaGénero veg;
	private VentanaRegistroHombre vresgh;
	private VentanaRegistroMujer vresgm;
	
	public View(Controller control) {
		vi = new VentanaInicial();
		vis = new VentanaInicioSesion();
		veg = new VentanaGénero();
		vresgh = new VentanaRegistroHombre();
		vresgm = new VentanaRegistroMujer();
		
		
		vi.getIniciar().addActionListener(control);
		vi.getRegistrarse().addActionListener(control);
		vis.getIniciar().addActionListener(control);
		veg.getBotmasculino().addActionListener(control);
		veg.getBotfemenino().addActionListener(control);
		vresgh.getRegistrate().addActionListener(control);
		vresgm.getRegistrate().addActionListener(control);
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


	public VentanaGénero getVeg() {
		return veg;
	}



	public void setVeg(VentanaGénero veg) {
		this.veg = veg;
	}



	public VentanaRegistroHombre getVresgh() {
		return vresgh;
	}



	public void setVresgh(VentanaRegistroHombre vresgh) {
		this.vresgh = vresgh;
	}



	public VentanaRegistroMujer getVresgm() {
		return vresgm;
	}



	public void setVresgm(VentanaRegistroMujer vresgm) {
		this.vresgm = vresgm;
	}
	
	
	
}
