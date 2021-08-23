package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.ISuministraDAO;
import app.dto.Pieza;
import app.dto.Proveedor;
import app.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService{

	@Autowired
	ISuministraDAO iSuministraDAO;

	@Override
	public List<Suministra> listarSuministra() {
		// TODO Auto-generated method stub
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return iSuministraDAO.save(suministra);
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(Long id) {
		// TODO Auto-generated method stub
		iSuministraDAO.deleteById(id);
	}

	@Override
	public Suministra suministraXID(Long id) {
		// TODO Auto-generated method stub
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra listarXPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return iSuministraDAO.findByPieza(pieza);
	}

	@Override
	public Suministra listarXProveedor(Proveedor proveedor_final) {
		// TODO Auto-generated method stub
		return iSuministraDAO.findByProveedor(proveedor_final);
	}

	@Override
	public List<Suministra> listarXPrecio(int precio) {
		// TODO Auto-generated method stub
		return iSuministraDAO.findByPrecio(precio);
	}
	
	
	
}
