package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.IProveedorDAO;
import app.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedorDAO iProveedorDAO;

	@Override
	public List<Proveedor> listarProveedor() {
		// TODO Auto-generated method stub
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(String id) {
		// TODO Auto-generated method stub
		iProveedorDAO.deleteById(id);
	}

	@Override
	public Proveedor proveedorXID(String id) {
		// TODO Auto-generated method stub
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public List<Proveedor> listarProveedorNombre(String nombre) {
		// TODO Auto-generated method stub
		return iProveedorDAO.findByNombre(nombre);
	}
	
	
	
	
}
