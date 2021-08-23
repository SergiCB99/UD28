package app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Pieza;
import app.dto.Proveedor;
import app.dto.Suministra;

public interface ISuministraDAO extends JpaRepository<Suministra, Long>{

	public Suministra findByPieza(Pieza pieza); //Listar por pieza
	
	public Suministra findByProveedor(Proveedor proveedor); //Listar por proveedor
	
	public List<Suministra> findByPrecio(int precio); //Listar por precio
	
}
