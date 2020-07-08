/*package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Autor;
import ar.edu.unlam.tallerweb1.modelo.Direccion;
import ar.edu.unlam.tallerweb1.modelo.Editorial;
import ar.edu.unlam.tallerweb1.modelo.Libro;
import ar.edu.unlam.tallerweb1.modelo.Secuencia;
import ar.edu.unlam.tallerweb1.servicios.ServicioLibro;
import ar.edu.unlam.tallerweb1.servicios.ServicioOperaciones;
import ar.edu.unlam.tallerweb1.servicios.ServicioSecuencia;

@Controller
public class ControladorPaginaDos {

	@Autowired
	private ServicioOperaciones servicioOperaciones;
	@Autowired
	private ServicioSecuencia servicioSecuencia;
	
	@RequestMapping("/PaginaDos")
	public ModelAndView irAPaginaDos() {
		return new ModelAndView ("paginados");
	}
	
	
	@RequestMapping("/PaginaTres")
	public ModelAndView irAPaginaTres() {
		return new ModelAndView ("paginatres");
	}
	
	
	/*@RequestMapping(path = "/Operaciones", method =  RequestMethod.GET)
	public ModelAndView operaciones(@RequestParam(value = "n1", required = true) Double n1, 
			@RequestParam(value = "n2", required = true) Double n2, @RequestParam(value = "op", required = true) String op) {
		
		Double r = 0.0;
		String error = "Operación inválida";
		ModelMap modelo = new ModelMap();
		
		if(op.equals("sumar")) {
			r = servicioOperaciones.sumar(n1, n2);
		} else if (op.equals("resta")) {
			r = servicioOperaciones.rest(n1, n2);
		} else if (op.equals("multi")) {
			r = servicioOperaciones.multi(n1, n2);
		}
		
		modelo.put("n1", n1);
		modelo.put("n2", n2);
		modelo.put("r", r);
		modelo.put("op", op);
		modelo.put("error", error);
		
		return new ModelAndView("operaciones", modelo);
	}

	@RequestMapping(path = "/Operaciones", method =  RequestMethod.GET)
	public ModelAndView operaciones(@RequestParam(value = "n1", required = true) Double n1, 
			@RequestParam(value = "n2", required = true) Double n2, @RequestParam(value = "op", required = true) String op) {
		
		ModelMap modelo = new ModelMap();
		Double r = 0.0;
		switch (op) {
		case "sumar" :
			r = servicioOperaciones.sumar(n1, n2);
			break;
		
		case "restar" :
			r = servicioOperaciones.rest(n1, n2);
			break;
			
		case "multi" :
			r = servicioOperaciones.multi(n1, n2);
			break;
			
		}
		
		modelo.put("n1", n1);
		modelo.put("n2", n2);
		modelo.put("r", r);
		modelo.put("op", op);
		
		
		return new ModelAndView ("operaciones", modelo);
	}
	
	@RequestMapping(path = "/Formulario", method =  RequestMethod.GET)
	public ModelAndView formulario () {
		
		ModelMap modelo = new ModelMap();
		
		return new ModelAndView("formulario", modelo);
		
	}
	
	@RequestMapping("/crearSecuencia")
	public ModelAndView crearSecuencia (@RequestParam(value = "titulosec") String titulo) {
		Secuencia sec = new Secuencia();
		sec.setTitulo(titulo);
		
		Long idGenerado = servicioSecuencia.guardarSecuencia(sec);
		
		ModelMap modelo = new ModelMap();
		modelo.put("secuencia", sec);
		return new ModelAndView("secuencia", modelo );
	}
	
	@RequestMapping("/consultarSecuencia")
	public ModelAndView consultarSecuencia (@RequestParam (value = "id") Long id){
		
		Secuencia secEncontrada = servicioSecuencia.consultarSecuenciaPorId(id);
		
		ModelMap modelo = new ModelMap();
		modelo.put("secuencia", secEncontrada);
		modelo.put("id", id);
		
		return new ModelAndView("consultar", modelo);
	}
	
	/*@RequestMapping("/ejemploRelaciones")
	public ModelAndView ejemploRelaciones() {
		
		Direccion d = new Direccion(123, "CalleFalsa", "La Matanza");
		Editorial e = new Editorial("Nombre de Editorial", d);
		Autor a = new Autor("Pepito", "Pepe");
		Libro l = new Libro("Nombre de Libro", a, e);
		
		String apellidoDeAutor = l.getAutor().getApellido();
		String editorial = l.getEditorial().getNombre();
		String direccionEditorial = e.getDireccion().getNombreCalle();
		
		ModelMap modelo = new ModelMap();
		
		modelo.put("nombreLibro", l.getNombre());
		modelo.put("apellidoDeAutor", apellidoDeAutor);
		modelo.put("editorial", editorial);
		modelo.put("direccionEditorial", direccionEditorial);
		
		return new ModelAndView("relacionesej", modelo);
	}
	
	@Autowired
	private ServicioLibro servicioLibro;
	
	@RequestMapping(path = "/registrarLibro", method = RequestMethod.GET)
	public ModelAndView formularioLibro(@RequestParam(value = "nombreAu") String nAutor, @RequestParam(value = "apellido")
	String aAutor, @RequestParam(value = "nombreEd") String nEditorial, @RequestParam(value = "nombreLi") String nLibro){
		
		Autor au = new Autor();
		Editorial ed = new Editorial();
		Libro li = new Libro();
		
		au.setApellido(aAutor);
		au.setNombre(nAutor);
		ed.setNombre(nEditorial);
		li.setNombre(nLibro);
		li.setEditorial(ed);
		li.setAutor(au);
		
		Autor autorRegistrado = servicioLibro.registrarAutor(au);
		Editorial editorialRegistrada = servicioLibro.registrarEditorial(ed);
		Libro libroRegistrado = servicioLibro.registrarLibro(li);
		
		ModelMap modelo = new ModelMap();
		modelo.put("autor", autorRegistrado);
		modelo.put("editorial", editorialRegistrada);
		modelo.put("libro", libroRegistrado);
		
		return new ModelAndView("registrarlibro", modelo);
	}
	
	@RequestMapping("/formularioLibro")
	public ModelAndView formularioLibro() {
		
		return new ModelAndView ("formulariolibro");
	}
	
	//CRITERIA
	
	@RequestMapping("/librosdeunautor")
	public ModelAndView buscarLibrosDeUnAutor(@RequestParam(value = "apellido") String ap, @RequestParam(value = "nombre")
			String nom, @RequestParam(value = "id") Long id) {
		
		Autor au = new Autor();
		au.setApellido(ap);
		au.setId(id);
		au.setNombre(nom);
		
		List<Libro> lista = servicioLibro.listarLibrosDeUnAutor(au);
		
		//FOREACH EN VISTA
		
		ModelMap modelo = new ModelMap();
		modelo.put("lista", lista);
		
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(modelo);
		miVista.setViewName("librosdeunautor");
		
		return miVista;
	}
	
	@RequestMapping("/librosdeunadireccion")
	public ModelAndView buscarLibrosDeUnaDireccionDeEditorial(@RequestParam(value = "id") Long id, 
			@RequestParam(value = "numero") Integer num, @RequestParam(value = "calle") String calle,
			@RequestParam(value = "localidad") String localidad) {
		
		Direccion dir = new Direccion();
		dir.setId(id);
		dir.setLocalidad(localidad);
		dir.setNombreCalle(calle);
		dir.setNumero(num);
		
		List<Libro> lista = servicioLibro.listarLibrosDeUnaDireccionDeEditorial(dir);
		
		ModelMap modelo = new ModelMap();
		modelo.put("lista", lista);
		
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(modelo);
		miVista.setViewName("librosdeunadireccion");
		
		return miVista;

	}
	
	@RequestMapping("/librosdistintosdeeditorial")
	public ModelAndView buscarLibrosNoSeanDeEditorial(@RequestParam(value = "idDir") Long idDir, 
			@RequestParam(value = "numero") Integer num, @RequestParam(value = "calle") String calle,
			@RequestParam(value = "localidad") String localidad, @RequestParam(value = "idEdit") Long idEdit,
			@RequestParam(value = "nombre") String nombre){
		
		Direccion dir = new Direccion();
		dir.setId(idDir);
		dir.setLocalidad(localidad);
		dir.setNombreCalle(calle);
		dir.setNumero(num);
		
		Editorial ed = new Editorial();
		ed.setDireccion(dir);
		ed.setId(idEdit);
		ed.setNombre(nombre);
		
		List<Libro> lista = servicioLibro.listarTodosLosLibrosQueNoSeanDeUnaEditorial(ed);
		
		ModelMap modelo = new ModelMap();
		modelo.put("lista", lista);
		
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(modelo);
		miVista.setViewName("librosdistintosdeeditorial");
		
		return miVista;

	}
	
	//POST
	//utilizo post siempre y cuando haya datos sensitivos y cuando modifico el estado del servidor
	//GET es mas para los request de productos o cosas asi
	//path es el atributo del objeto en el .jsp
	
	
	@RequestMapping("/buscarautor")
	public ModelAndView buscarAutor() {
		
		ModelMap model = new ModelMap();
		Autor au = new Autor();
		model.put("autor", au);
		
		return new ModelAndView("formularioBuscarAutor", model);
	}
	
	@RequestMapping(path = "/validar-autor", method = RequestMethod.POST)
	public ModelAndView encontrarAutor(@ModelAttribute("autor") Autor au) {
		
		ModelMap model = new ModelMap();
		
		if(servicioLibro.buscarAutorPorNombreYApellido(au) != null) {
			return new ModelAndView("redirect:/autorencontrado", model);
		}else {
			model.put("error", "Autor no encontrado");
		}
		
		return new ModelAndView("formularioBuscarAutor", model);
	}
	
	@RequestMapping("/autorencontrado")
	public ModelAndView autorEncontrado(){
		
		ModelMap model = new ModelMap();
		
		return new ModelAndView("autorEncontrado", model);
	}
	
}
*/