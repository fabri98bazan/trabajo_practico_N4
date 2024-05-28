package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Carrera;

@Component
public class CollectionCarrera {
	private static List<Carrera> carreras=new ArrayList<Carrera>();
	
	public static List<Carrera> getCarreras(){
		if(carreras.isEmpty()) {
			carreras.add(new Carrera(1,"A.P.U",3,true));
			carreras.add(new Carrera(2,"Lic. Sistemas",5,true));
			carreras.add(new Carrera(3,"Ing. Informatica",5,false));
		}
		return carreras;
	}
	
	/**
	 * 
	 * @param carrera
	 * 
	 * Para agregar una nueva carrera
	 */
	public static void agregarCarrera(Carrera carrera) {
		carreras.add(carrera);
	}
	
	/**
	 * 
	 * @param codCarrera
	 * 
	 * Para eliminar carrera
	 */
	public static void eliminarCarrera(int codCarrera) {
		Iterator<Carrera> iterator=carreras.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getCod_carrera()==codCarrera) {
				
			}
		}
	}
	
	/**
	 * Para modificar una carrera
	 * @param carrera
	 */
	public static void modificarCarrera(Carrera carrera) {
		for(Carrera c: carreras)
		{
			if(c.getCod_carrera()==carrera.getCod_carrera())
			{
				c.setNombre_carrera(carrera.getNombre_carrera());
				c.setCant_anios(carrera.getCant_anios());
				c.setEstado(carrera.isEstado());
			}
		}
	}
	
	
}
