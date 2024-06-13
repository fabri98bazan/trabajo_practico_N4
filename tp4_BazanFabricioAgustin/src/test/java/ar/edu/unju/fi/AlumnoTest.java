package ar.edu.unju.fi;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.model.Alumno;

class AlumnoTest {

	@Test
	void alumnoTest() {
		Alumno a= new Alumno("41300614","Fabricio","BAzan","fabri@gmail.com","3884654082",LocalDate.of(1998, 6, 22),"San Pedrito",5291);
		System.out.println(a);
	}

}
