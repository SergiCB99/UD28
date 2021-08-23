package app.dto;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "proveedores")
public class Proveedor {

	@Id
	String id;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Suministra> suministra;
	
	public Proveedor () {
		
	}
	
	public Proveedor (String id,String nombre) {
		this.id=id;
		this.nombre=nombre;
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
		return "Proveedor [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}
