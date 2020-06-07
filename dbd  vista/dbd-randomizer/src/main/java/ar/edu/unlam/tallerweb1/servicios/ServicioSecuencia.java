package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Secuencia;

public interface ServicioSecuencia {

	Long guardarSecuencia(Secuencia sec);

	Secuencia consultarSecuenciaPorId(Long id);

}
