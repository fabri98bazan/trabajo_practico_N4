package ar.edu.unju.fi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;

class MateriaTest {

	@Test
	void materiaTest() {
		Materia materia = new Materia(1,"Base de datos", 6, true, new Docente() ,new Carrera());
		System.out.println(materia);
	}

}
