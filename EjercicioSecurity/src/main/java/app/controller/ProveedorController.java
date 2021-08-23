package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.Proveedor;
import app.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorImplService;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedor(){
		return proveedorImplService.listarProveedor();
	}
	
	@PostMapping("/proveedores")
	public Proveedor salvarProveedor(@RequestBody Proveedor proveedor){
		return proveedorImplService.guardarProveedor(proveedor);
	}
	
	//Actualizar
		@PutMapping("/proveedores/{id}")
		public Proveedor actualizarProveedor(@PathVariable(name="id")String id,@RequestBody Proveedor proveedor) {
				
			Proveedor proveedor_seleccionado= new Proveedor();
			Proveedor proveedor_actualizado= new Proveedor();
				
			proveedor_seleccionado = proveedorImplService.proveedorXID(id);
				
			proveedor_seleccionado.setNombre(proveedor.getNombre());

			
			proveedor_actualizado = proveedorImplService.actualizarProveedor(proveedor_seleccionado);
			
			System.out.println("El articulo actualizado es: "+ proveedor_actualizado);
				
			return proveedor_actualizado;
		}
	
		@DeleteMapping("/proveedores/{id}")
		public void eliminarProveedor(@PathVariable(name="id")String id) {
			proveedorImplService.eliminarProveedor(id);
		}
		
		@GetMapping("/proveedores/nombre/{nombre}")
		public List<Proveedor> listarProveedorNombres(@PathVariable(name="nombre")String nombre){
			return proveedorImplService.listarProveedorNombre(nombre);
		}
		
}
