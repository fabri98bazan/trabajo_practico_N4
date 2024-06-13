package ar.edu.unju.fi.model;

import java.time.LocalDate;

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
public class Alumno {
	private String dni;
	private String nombre_alumno;
	private String apellido_alumno;
	private String email_alumno;
	private String num_celular;
	private LocalDate fecha_nac;
	private String domicilio_alumno;
	private int LU;
	
}
