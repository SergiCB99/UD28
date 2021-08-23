package app.service;

import java.util.List;

import app.dto.Pieza;
import app.dto.Proveedor;
import app.dto.Suministra;

public interface ISuministraService {

	public List<Suministra> listarSuministra(); //Listar All 
	
	public Suministra guardarSuministra(Suministra suministra);	//Guarda una pieza CREATE
	
	public Suministra actualizarSuministra(Suministra suministra); //Actualiza datos de la pieza UPDATE
	
	public void eliminarSuministra(Long id);// Elimina la pieza DELETE
	
	public Suministra suministraXID(Long id); //Leer datos de una pieza READ
	
	public Suministra listarXPieza(Pieza pieza); //Listar por pieza
	
	public Suministra listarXProveedor(Proveedor proveedor); //Listar por proveedor
	
	public List<Suministra> listarXPrecio(int precio); //Listar por precio
	
}
