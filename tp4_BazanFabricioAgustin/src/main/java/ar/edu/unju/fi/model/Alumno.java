package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Alumno {
	private long dni;
	private String nombre_alumno;
	private String apellido_alumno;
	private String email_alumno;
	private long num_celular;
	private LocalDate fecha_nac;
	private String domicilio_alumno;
	private int LU;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre_alumno() {
		return nombre_alumno;
	}

	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	public String getApellido_alumno() {
		return apellido_alumno;
	}

	public void setApellido_alumno(String apellido_alumno) {
		this.apellido_alumno = apellido_alumno;
	}

	public String getEmail_alumno() {
		return email_alumno;
	}

	public void setEmail_alumno(String email_alumno) {
		this.email_alumno = email_alumno;
	}

	public long getNum_celular() {
		return num_celular;
	}

	public void setNum_celular(long num_celular) {
		this.num_celular = num_celular;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getDomicilio_alumno() {
		return domicilio_alumno;
	}

	public void setDomicilio_alumno(String domicilio_alumno) {
		this.domicilio_alumno = domicilio_alumno;
	}

	public int getLU() {
		return LU;
	}

	public void setLU(int lU) {
		LU = lU;
	}
	
	
}
