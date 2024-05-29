package ar.edu.unju.fi.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Alumno;

@Component
public class CollectionAlumno {
private static List<Alumno> alumnos=new ArrayList<Alumno>();
	
	public static List<Alumno> getAlumnos(){
		LocalDate fecha;
		fecha=LocalDate.of(1998, 6, 22);
		if(alumnos.isEmpty()) {
			alumnos.add(new Alumno("41300614", "Fabricio", "Bazan", "fabri@gmail.com", "3884654082", fecha, "S.S.Jujuy", 5291));
		}
		return alumnos;
	}
	
	/**
	 * 
	 * @param carrera
	 * 
	 * Para agregar una nuevo alumno
	 */
	public static void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	/**
	 * Mostrar alumnos
	 */
	public static void mostrarAlumnos() {
		if(!alumnos.isEmpty())
		{
			alumnos.forEach(c->System.out.println(c));
		}else
			System.out.println("LA LISTA ESTÁ VACIA");
	}
	/**
	 * 
	 * @param LU
	 * 
	 * Para eliminar alumno
	 */
	public static void eliminarAlumno(int LU) {
		Iterator<Alumno> iterator=alumnos.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getLU()==LU) {
				iterator.remove();
			}
		}
	}
	
	/**
	 * Para modificar un Alumno
	 * @param alumno
	 */
	public static void modificarAlumno(Alumno alumno) {
		for(Alumno a: alumnos)
		{
			if(a.getLU()==alumno.getLU())
			{
				a.setApellido_alumno(alumno.getApellido_alumno());
				a.setNombre_alumno(alumno.getNombre_alumno());
				a.setEmail_alumno(alumno.getEmail_alumno());
				a.setFecha_nac(alumno.getFecha_nac());
				a.setDni(alumno.getDni());
				a.setDomicilio_alumno(alumno.getDomicilio_alumno());
				a.setNum_celular(alumno.getNum_celular());

			}else {
				System.out.println("No se encuentra el codigo de la alumno");
			}
		}
	}
	
	/**
	 * Buscar un objeto alumno, con el priterio de @param
	 * @return
	 */
	
	public static Alumno buscarAlumnos(int LU)
	{
		Predicate<Alumno> filterCod=c->c.getLU()==LU;
		Optional<Alumno> alumno=alumnos.stream().filter(filterCod).findFirst();
		if(alumno.isPresent()) {
			return alumno.get();
		}else {
			return null;
		}
	}
	
	
}
