package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Perks_S {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_perk_s;
	private String nombre_p_s;
	private String foto_p_s;
	
	@ManyToOne
	private Survivor survivor;
	
	public Long getId_perk_s() {
		return id_perk_s;
	}
	
	public void setId_perk_s(Long id_perk_s) {
		this.id_perk_s = id_perk_s;
	}
	
	public String getNombre_p_s() {
		return nombre_p_s;
	}
	
	public void setNombre_p_s(String nombre_p_s) {
		this.nombre_p_s = nombre_p_s;
	}
	
	public String getFoto_p_s() {
		return foto_p_s;
	}
	
	public void setFoto_p_s(String foto_p_s) {
		this.foto_p_s = foto_p_s;
	}

}
