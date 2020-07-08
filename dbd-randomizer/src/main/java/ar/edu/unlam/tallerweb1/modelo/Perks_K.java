package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Perks_K {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_perk_k;
	private String nombre_p_k;
	private String foto_p_k;
	
	@ManyToOne
	private Killer killer;
	
	public Long getId_perk_k() {
		return id_perk_k;
	}
	
	public void setId_perk_k(Long id_perk_k) {
		this.id_perk_k = id_perk_k;
	}
	
	public String getNombre_p_k() {
		return nombre_p_k;
	}
	
	public void setNombre_p_k(String nombre_p_k) {
		this.nombre_p_k = nombre_p_k;
	}
	
	public String getFoto_p_k() {
		return foto_p_k;
	}
	
	public void setFoto_p_k(String foto_p_k) {
		this.foto_p_k = foto_p_k;
	}
	
}
