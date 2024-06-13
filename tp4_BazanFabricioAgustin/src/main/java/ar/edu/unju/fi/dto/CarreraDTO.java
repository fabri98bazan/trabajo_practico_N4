package ar.edu.unju.fi.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor 
@AllArgsConstructor
@Data 
@Component
public class CarreraDTO {
	private int cod_carrera;
	private String nombre_carrera;
	private int cant_anios;
	private boolean estado;
}
