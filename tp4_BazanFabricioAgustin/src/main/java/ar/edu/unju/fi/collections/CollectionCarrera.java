package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

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
	 * Mostrar carreras 
	 */
	public static void mostrarCarreras() {
		if(!carreras.isEmpty())
		{
			carreras.forEach(c->System.out.println(c));
		}else
			System.out.println("LA LISTA ESTÁ VACIA");
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
				iterator.remove();
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
			}else {
				System.out.println("No se encuentra el codigo de la carrera");
			}
		}
	}
	
	/**
	 * Buscar un objeto carrera, con el priterio de @param
	 * @return
	 */
	
	public static Carrera buscarCarrera(int cod)
	{
		Predicate<Carrera> filterCod=c->c.getCod_carrera()==cod;
		Optional<Carrera> carrera=carreras.stream().filter(filterCod).findFirst();
		if(carrera.isPresent()) {
			return carrera.get();
		}else {
			return null;
		}
	}
	
	
	
}
