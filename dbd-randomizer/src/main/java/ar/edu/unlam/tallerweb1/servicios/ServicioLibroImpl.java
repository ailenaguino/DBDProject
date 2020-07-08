/*package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Autor;
import ar.edu.unlam.tallerweb1.modelo.Direccion;
import ar.edu.unlam.tallerweb1.modelo.Editorial;
import ar.edu.unlam.tallerweb1.modelo.Libro;
import ar.edu.unlam.tallerweb1.repositorios.LibroDao;

@Service
@Transactional
public class ServicioLibroImpl implements ServicioLibro {

	@Autowired
	private LibroDao libroDao;
	
	@Override
	public Autor registrarAutor(Autor au) {
		return libroDao.registrarAutor(au);
	}

	@Override
	public Libro registrarLibro(Libro li) {
		return libroDao.registrarLibro(li);

	}

	@Override
	public Editorial registrarEditorial(Editorial ed) {
		return libroDao.registrarEditorial(ed);
	}
	
	@Override 
	public List<Libro> listarLibrosDeUnAutor(Autor au){
		return libroDao.listarLibrosDeUnAutor(au);
	}

	@Override
	public List<Libro> listarLibrosDeUnaDireccionDeEditorial(Direccion dir){
		return libroDao.listarLibrosDeUnaDireccionDeEditorial(dir);
	}

	@Override
	public List<Libro> listarTodosLosLibrosQueNoSeanDeUnaEditorial(Editorial ed){
		return libroDao.listarTodosLosLibrosQueNoSeanDeUnaEditorial(ed);
	}
	
	@Override
	public Autor buscarAutorPorNombreYApellido(Autor au) {
		return libroDao.buscarAutorPorNombreYApellido(au);
	}

}
*/