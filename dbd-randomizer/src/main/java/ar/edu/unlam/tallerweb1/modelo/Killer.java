package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Killer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_killer;
	private String nombre_killer;
	private String foto_killer;
	
	public Long getId_killer() {
		return id_killer;
	}
	
	public void setId_killer(Long id_killer) {
		this.id_killer = id_killer;
	}
	
	public String getNombre_killer() {
		return nombre_killer;
	}
	
	public void setNombre_killer(String nombre_killer) {
		this.nombre_killer = nombre_killer;
	}
	
	public String getFoto_killer() {
		return foto_killer;
	}
	
	public void setFoto_killer(String foto_killer) {
		this.foto_killer = foto_killer;
	}

}
