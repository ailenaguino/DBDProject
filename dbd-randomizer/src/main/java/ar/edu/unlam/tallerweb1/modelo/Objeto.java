package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Objeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_obj;
	private String nombre_obj;
	private String foto_obj;
	
	@OneToOne (cascade = {CascadeType.PERSIST})
	private Survivor survivor;
	
	public Long getId_obj() {
		return id_obj;
	}
	
	public void setId_obj(Long id_obj) {
		this.id_obj = id_obj;
	}
	
	public String getNombre_obj() {
		return nombre_obj;
	}
	
	public void setNombre_obj(String nombre_obj) {
		this.nombre_obj = nombre_obj;
	}
	
	public String getFoto_obj() {
		return foto_obj;
	}
	
	public void setFoto_obj(String foto_obj) {
		this.foto_obj = foto_obj;
	}

}
