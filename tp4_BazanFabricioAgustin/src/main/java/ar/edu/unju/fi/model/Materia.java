package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Materia {
	private int cod;
	private String nombre_materia;
	private int cant_horas;
	private boolean modalidad;
	private Docente docente;
	private Carrera carrera;
	
}
