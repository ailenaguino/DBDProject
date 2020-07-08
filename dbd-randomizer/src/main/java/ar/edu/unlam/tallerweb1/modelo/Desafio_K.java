package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Desafio_K {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_desafio_k;
	private String descripcion;

	@OneToOne (cascade = {CascadeType.PERSIST})
	private Killer killer;
	
	public Long getId_desafio_k() {
		return id_desafio_k;
	}
	
	public void setId_desafio_k(Long id_desafio_k) {
		this.id_desafio_k = id_desafio_k;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
