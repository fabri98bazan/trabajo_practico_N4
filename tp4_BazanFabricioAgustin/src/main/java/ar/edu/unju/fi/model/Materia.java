package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	private int cod;
	private String nombre_materia;
	private int cant_horas;
	private boolean modalidad;
	private Docente docente;
	private Carrera carrera;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Materia(int cod, String nombre_materia, int cant_horas, boolean modalidad, Docente docente,
			Carrera carrera) {
		this.cod = cod;
		this.nombre_materia = nombre_materia;
		this.cant_horas = cant_horas;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
	}



	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNombre_materia() {
		return nombre_materia;
	}

	public void setNombre_materia(String nombre_materia) {
		this.nombre_materia = nombre_materia;
	}

	public int getCant_horas() {
		return cant_horas;
	}

	public void setCant_horas(int cant_horas) {
		this.cant_horas = cant_horas;
	}

	public boolean isModalidad() {
		return modalidad;
	}

	public void setModalidad(boolean modalidad) {
		this.modalidad = modalidad;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	
	
}
