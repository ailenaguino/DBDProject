/*package ar.edu.unlam.tallerweb1.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Secuencia;
import ar.edu.unlam.tallerweb1.repositorios.SecuenciaDao;

@Service
@Transactional
public class ServicioSecuenciaImpl implements ServicioSecuencia{

	@Autowired
	private SecuenciaDao secuenciaDao;

	@Override
	public Long guardarSecuencia(Secuencia sec) {
		return secuenciaDao.guardarSecuencia(sec);
	}

	@Override
	public Secuencia consultarSecuenciaPorId(Long id) {
		return secuenciaDao.consultarSecuenciaPorId(id);
	}

}
*/