package es.dsw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.dsw.models.*;

/* [10] - ORGANIZACIÓN DE LAS CONTROLADORAS POR ÁREAS O REGIONES LÓGICAS DE MAPEO
 * 
 * Esta controladora mapeará todos sus métodos bajo la ruta url /OtrosEjemplos/. De esta forma se puede evitar conflictos entre métodos de diferentes controladoras que mapean la misma
 * ruta o también se puede organizar la aplicación en diferentes áreas.
 */
@Controller
@RequestMapping("/OtrosEjemplos/")
public class MasEjemplosController {

	/*Observa como el mapeo de /ejemplo9 siembre estará bajo la ruta /OtrosEjemplos/. Además, es un ejemplo
	 *de como podemos mapear la misma ruta pero por métodos http diferentes (GET Y POST)*/
	@GetMapping({"/ejemplo9"})
	public String ejem9(Model objModel) {
		//Se crea el objeto del modelo Profesor
		  //Profesor objProfesor = new Profesor();
		  
		//Se carga en el modelo el objeto profesor
		//objModel.addAttribute("DataProfesor", objProfesor);
		  
		return "/OtrasVistas/example9";
	}
	
	//Cuando se captura este mapeo se debe a que se reciben datos por POST.
	@PostMapping({"/ejemplo9"})
	public String ejem9_2(@RequestParam(name="nom", defaultValue = "") String Nombre,
            			  @RequestParam(name="apell", defaultValue = "") String Apellido,
            			  @RequestParam(name="edad", defaultValue = "-1") int edad,
            			  Model objModel) {
		
		  //Se crea el objeto del modelo Profesor
		  Profesor objProfesor = new Profesor(Nombre, Apellido, edad);
		  
		  //Se carga en el modelo el objeto profesor
		  objModel.addAttribute("DataProfesor", objProfesor);
		  
		  
		return "/OtrasVistas/example9";
	}
	
	//Este mapeo simula que un profesor tiene asociado una lista de alumnos y es utilizado para mostrar
	//como en la vista example10 se puede generar código html repetitivo con Thymeleaf.
	@GetMapping({"/ejemplo10"})
	public String ejemplo10(Model objModel) {
		
		//Se genera un bucle de n iteraciones aleatorias que simulan cargar los datos de n alumnos. (de 5 a 8 de forma aleatoria)
		int NumAlumnos = (int) (Math.random() * 8 + 5); 
		
		//Se simula la edad del profesor.
		int edadProfe = (int) (Math.random() * 70 + 18); 
		
		//Se crea el objeto del modelo Profesor
		Profesor objProfesor = new Profesor(4343, "44332211S", "Profesor 1", "Apellidos profesor", edadProfe);
		  
		for(int i=1; i<=NumAlumnos; i++) {
			//Se simula la edad de un alumno.
			int edad = (int) (Math.random() * 50 + 18); 
			//Se termina de simular los datos de un alumno.
			Alumno aux = new Alumno(i, "44338844L","Alumno "+i,"Apellidos alumno "+i, edad);
			objProfesor.setListaAlumnos(aux);
		}
		
		//Se carga en el modelo el objeto profesor para que esté disponible en la vista.
		objModel.addAttribute("DataProfesor", objProfesor);
		
		return "/OtrasVistas/example10";
	}
	
	//Se reciben los datos identificativos desde enlaces generados dinamicamente con thymeleafe en la vista del ejemplo 10.
	@GetMapping({"/ejemplo11"})
	public String ejemplo11(@RequestParam(name="idalum", defaultValue = "-1") int IdAlumno,
							@RequestParam(name="nif", defaultValue = "") String nif,
			                Model objModel) {
		
		objModel.addAttribute("IdAlumno", IdAlumno);
		objModel.addAttribute("NifAlumno", nif);
		
		return "/OtrasVistas/example11";
	}

}
