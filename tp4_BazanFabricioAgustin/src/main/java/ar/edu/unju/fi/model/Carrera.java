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
public class Carrera {
	private int cod_carrera;
	private String nombre_carrera;
	private int cant_anios;
	private boolean estado;
}
