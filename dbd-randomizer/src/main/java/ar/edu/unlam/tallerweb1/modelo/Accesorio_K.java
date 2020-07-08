package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Accesorio_K {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_acc_k;
	private String nombre_acc_k;
	private String foto_acc_k;
	
	@ManyToOne
	private Killer killer;
	
	public Long getId_acc_k() {
		return id_acc_k;
	}
	
	public void setId_acc_k(Long id_acc_k) {
		this.id_acc_k = id_acc_k;
	}
	
	public String getNombre_acc_k() {
		return nombre_acc_k;
	}
	
	public void setNombre_acc_k(String nombre_acc_k) {
		this.nombre_acc_k = nombre_acc_k;
	}
	
	public String getFoto_acc_k() {
		return foto_acc_k;
	}
	
	public void setFoto_acc_k(String foto_acc_k) {
		this.foto_acc_k = foto_acc_k;
	}
	
}
