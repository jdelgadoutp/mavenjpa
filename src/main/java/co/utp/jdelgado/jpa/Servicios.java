package co.utp.jdelgado.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "servicios")

public class Servicios implements Serializable {

	private String id;
	private String nombre;
	
	
	public Servicios() {
		
	}
		
	public Servicios(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Servicios [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
