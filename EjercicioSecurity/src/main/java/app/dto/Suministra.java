package app.dto;

import javax.persistence.*;

@Entity
@Table(name = "suministra")
public class Suministra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "precio") // no hace falta si se llama igual
	private int precio;
	
	@ManyToOne
	@JoinColumn(name = "codigo_pieza")
	private Pieza pieza;
	
	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedor proveedor;
	
	public Suministra () {
		
	}
	
	public Suministra (int precio,Proveedor proveedor,Pieza pieza) {
		this.precio=precio;
		this.proveedor=proveedor;
		this.pieza=pieza;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", precio=" + precio + ", pieza=" + pieza + ", proveedor=" + proveedor + "]";
	}
	
	
	
}
