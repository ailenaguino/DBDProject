package ar.edu.unlam.tallerweb1.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladoParam {

	@RequestMapping(path = "/Texto", method = RequestMethod.GET)
	public ModelAndView params(@RequestParam(value = "firstname", required = false) String nombre,
			@RequestParam(value = "lastname", required = true) String apellido) {
		
		String mensaje = "El nombre ingresado es : " + nombre +" ";
		String mensaje2 = "y, el apellido ingresado es : " + apellido + ".";
		ModelMap modelo = new ModelMap();
		modelo.put("msj", mensaje);
		modelo.put("msj2", mensaje2);
		
		return new ModelAndView("texto", modelo);
	}

}
