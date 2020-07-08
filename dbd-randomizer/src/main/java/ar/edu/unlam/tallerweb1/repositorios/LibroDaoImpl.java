/*package ar.edu.unlam.tallerweb1.repositorios;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Autor;
import ar.edu.unlam.tallerweb1.modelo.Direccion;
import ar.edu.unlam.tallerweb1.modelo.Editorial;
import ar.edu.unlam.tallerweb1.modelo.Libro;

@Repository
@Transactional
public class LibroDaoImpl implements LibroDao {

	@Autowired
	private SessionFactory sesion;
	
	public void updateEditorialDeLibro(Editorial ed) {
		sesion.getCurrentSession().update("libro", ed);
	}
	
	@Override
	public Autor registrarAutor(Autor au) {
		sesion.getCurrentSession().save(au);
		return au;

	}

	@Override
	public Libro registrarLibro(Libro li) {
		sesion.getCurrentSession().save(li);
		return li;
	}

	@Override
	public Editorial registrarEditorial(Editorial ed) {
		sesion.getCurrentSession().save(ed);
		return ed;
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Libro> listarLibrosDeUnAutor(Autor au){
		return sesion.getCurrentSession().createCriteria(Libro.class)
				.add(Restrictions.eq("autor", au))
				.list();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Libro> listarLibrosDeUnaDireccionDeEditorial (Direccion dir){
		return sesion.getCurrentSession().createCriteria(Libro.class)
				.createAlias("Libro.editorial", "editorial")
				.add(Restrictions.eq("editorial.direccion", dir))
				.list();
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Libro> listarTodosLosLibrosQueNoSeanDeUnaEditorial (Editorial ed){
		return sesion.getCurrentSession().createCriteria(Libro.class)
				.add(Restrictions.ne("editorial", ed))
				.list();
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public Autor buscarAutorPorNombreYApellido(Autor au) {
		return (Autor) sesion.getCurrentSession().createCriteria(Autor.class)
				.add(Restrictions.eq("nombre", au.getNombre()))
				.add(Restrictions.eq("apellido", au.getApellido()))
				.uniqueResult();
	}
	
}
*/