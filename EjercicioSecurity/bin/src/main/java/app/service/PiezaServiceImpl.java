package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.IPiezaDAO;
import app.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService{

	@Autowired
	IPiezaDAO iPiezaDAO;
	
	@Override
	public List<Pieza> listarPieza() {
		// TODO Auto-generated method stub
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(Long id) {
		// TODO Auto-generated method stub
		iPiezaDAO.deleteById(id);
	}

	@Override
	public Pieza piezaXID(Long id) {
		// TODO Auto-generated method stub
		return iPiezaDAO.findById(id).get();
	}

	@Override
	public List<Pieza> listarPiezaNombre(String nombre) {
		// TODO Auto-generated method stub
		return iPiezaDAO.findByNombre(nombre);
	}

	
	
}
