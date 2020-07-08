package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Survivor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_surv;
	private String nombre_surv;
	private String foto_surv;
	
	public Long getId_surv() {
		return id_surv;
	}
	
	public void setId_surv(Long id_surv) {
		this.id_surv = id_surv;
	}
	
	public String getNombre_surv() {
		return nombre_surv;
	}
	
	public void setNombre_surv(String nombre_surv) {
		this.nombre_surv = nombre_surv;
	}
	
	public String getFoto_surv() {
		return foto_surv;
	}
	
	public void setFoto_surv(String foto_surv) {
		this.foto_surv = foto_surv;
	}
	
}
