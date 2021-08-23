package app.service;

import java.util.List;

import app.dto.Pieza;

public interface IPiezaService  {

	public List<Pieza> listarPieza(); //Listar All 
	
	public Pieza guardarPieza(Pieza pieza);	//Guarda una pieza CREATE
	
	public Pieza actualizarPieza(Pieza pieza); //Actualiza datos de la pieza UPDATE
	
	public void eliminarPieza(Long id);// Elimina la pieza DELETE
	
	public Pieza piezaXID(Long id); //Leer datos de una pieza READ
	
	public List<Pieza> listarPiezaNombre(String nombre); //Listar por nombre
	
}
