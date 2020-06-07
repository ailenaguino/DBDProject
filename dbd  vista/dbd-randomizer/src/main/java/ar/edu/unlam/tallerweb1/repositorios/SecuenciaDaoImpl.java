package ar.edu.unlam.tallerweb1.repositorios;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Secuencia;

@Repository
@Transactional
public class SecuenciaDaoImpl implements SecuenciaDao{
	
	@Autowired
	private SessionFactory sesion;

	@Override
	public Long guardarSecuencia(Secuencia sec) {
		Long idGenerado = (Long) sesion.getCurrentSession().save(sec);
		return idGenerado;
	}

	@Override
	public Secuencia consultarSecuenciaPorId(Long id) {
		Secuencia sec = sesion.getCurrentSession().get(Secuencia.class, id);
		return null;
	}

}
