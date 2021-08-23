package app.dto;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "piezas")
public class Pieza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Suministra> suministra;
	
	public Pieza () {
		
	}
	
	public Pieza (String nombre) {
		this.nombre=nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		return "Pieza [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}
