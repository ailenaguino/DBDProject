package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Desafio_S {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_desafio_s;
	private String descripcion;
	
	@OneToOne (cascade = {CascadeType.PERSIST})
	private Survivor survivor;

	public Long getId_desafio_s() {
		return id_desafio_s;
	}

	public void setId_desafio_s(Long id_desafio_s) {
		this.id_desafio_s = id_desafio_s;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
