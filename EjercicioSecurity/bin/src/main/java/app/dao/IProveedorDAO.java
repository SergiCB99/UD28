package app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, String> {

	public List<Proveedor> findByNombre(String nombre); //Listar por nombre
	
}