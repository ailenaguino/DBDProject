package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Accesorio_S {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_acc_s;
	private String nombre_acc_s;
	private String foto_acc_s;
	
	@ManyToOne
	private Objeto objeto;

	public Long getId_acc_s() {
		return id_acc_s;
	}

	public void setId_acc_s(Long id_acc_s) {
		this.id_acc_s = id_acc_s;
	}

	public String getNombre_acc_s() {
		return nombre_acc_s;
	}

	public void setNombre_acc_s(String nombre_acc_s) {
		this.nombre_acc_s = nombre_acc_s;
	}

	public String getFoto_acc_s() {
		return foto_acc_s;
	}

	public void setFoto_acc_s(String foto_acc_s) {
		this.foto_acc_s = foto_acc_s;
	}
	
}
