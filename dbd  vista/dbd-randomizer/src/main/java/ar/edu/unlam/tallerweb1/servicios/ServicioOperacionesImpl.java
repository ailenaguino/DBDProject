package ar.edu.unlam.tallerweb1.servicios;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ServicioOperaciones")
@Transactional
public class ServicioOperacionesImpl implements ServicioOperaciones{

	@Override
	public Double sumar(Double o1, Double o2) {
		return o1+o2;
	}

	@Override
	public Double multi(Double o1, Double o2) {
		return o1*o2;
	}

	@Override
	public Double rest(Double o1, Double o2) {
		return o1-o2;
	}

	
}
