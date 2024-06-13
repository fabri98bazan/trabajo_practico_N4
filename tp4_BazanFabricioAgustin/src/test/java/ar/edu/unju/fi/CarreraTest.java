package ar.edu.unju.fi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.model.Carrera;

class CarreraTest {

	@Test
	void carreraTest() {
		Carrera c = new Carrera(25,"APU",5,true);
		System.out.println(c);
	}

}
