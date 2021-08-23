package app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Long> {

	public List<Pieza> findByNombre(String nombre); //Listar por nombre
	
}
