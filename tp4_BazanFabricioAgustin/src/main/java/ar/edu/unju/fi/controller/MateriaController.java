package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.CollectionMateria;
import ar.edu.unju.fi.model.Materia;

@Controller
@RequestMapping("/materia")
public class MateriaController {
	@Autowired
	private Materia materia;
	
	@GetMapping("/listado")
	public String getMateriasPage(Model model) {
		model.addAttribute("materias", CollectionMateria.getMaterias());
		model.addAttribute("titulo","Materias");
		return "materias";
	}
	
	@GetMapping("/nuevo")
	public String getNuevaMateriaPage(Model model) {
		boolean edicion=false;
		model.addAttribute("materia", materia);
		model.addAttribute("edicion", edicion);
		model.addAttribute("titulo", "Nueva materia");
		return "materia";
	}
	
	@PostMapping("/guardar")
	public ModelAndView guardarMateria(@ModelAttribute("materia") Materia materia) {
		ModelAndView modelView=new ModelAndView("materias");
		materia.setModalidad(true);
		CollectionMateria.agregarMateria(materia);
		modelView.addObject("materias",CollectionMateria.getMaterias());
		return modelView;
	}
	
	@GetMapping("/modificar/{cod}")
	public String getModificarMateriaPage(Model model, @PathVariable(value="cod") int codigo) {
		Materia materiaEncontrada= new Materia();
		boolean edicion=true;
		materiaEncontrada=CollectionMateria.buscarMaterias(codigo);
		model.addAttribute("edicion", edicion);
		model.addAttribute("materia", materiaEncontrada);
		model.addAttribute("titulo","Modificar Materia");
		return "materia";
	}
	
	@PostMapping("/modificar")
	public String modificarMateria(@ModelAttribute("materia") Materia materia) {
		CollectionMateria.modificarMateria(materia);
		return "redirect:/materia/listado";
	}
	
	@GetMapping("/eliminar/{cod}")
	public String eliminarCarrera(@PathVariable(value="cod") int codigo) {
		CollectionMateria.eliminarMateria(codigo);
		return "redirect:/materia/listado";
	}
	
	
}
