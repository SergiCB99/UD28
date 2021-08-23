package app.service;

import java.util.List;

import app.dto.Proveedor;

public interface IProveedorService {

	public List<Proveedor> listarProveedor(); //Listar All 
	
	public Proveedor guardarProveedor(Proveedor proveedor);	//Guarda un proveedor CREATE
	
	public Proveedor actualizarProveedor(Proveedor proveedor); //Actualiza datos del proveedor UPDATE
	
	public void eliminarProveedor(String id);// Elimina el proveedor DELETE
	
	public Proveedor proveedorXID(String id); //Leer datos de un proveedor READ
	
	public List<Proveedor> listarProveedorNombre(String nombre); //Listar por nombre
	
}
