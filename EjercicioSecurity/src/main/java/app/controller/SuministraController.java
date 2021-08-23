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

import app.dto.Pieza;
import app.dto.Proveedor;
import app.dto.Suministra;
import app.service.PiezaServiceImpl;
import app.service.ProveedorServiceImpl;
import app.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraImplService;
	
	//Para listar por codigo de pieza
	@Autowired
	PiezaServiceImpl piezaImplService;
	
	//Para listar por codigo de proveedor
	@Autowired
	ProveedorServiceImpl proveedorImplService;
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuministra(){
		return suministraImplService.listarSuministra();
	}
	
	@PostMapping("/suministra")
	public Suministra salvarSuministra(@RequestBody Suministra suministra){
		return suministraImplService.guardarSuministra(suministra);
	}
	
	//Actualizar
	@PutMapping("/suministra/{id}")
	public Suministra actualizarSuministra(@PathVariable(name="id")Long id,@RequestBody Suministra suministra) {
			
		Suministra suministra_seleccionado= new Suministra();
		Suministra suministra_actualizado= new Suministra();
			
		suministra_seleccionado = suministraImplService.suministraXID(id);
			
		suministra_seleccionado.setPrecio(suministra.getPrecio());
		suministra_seleccionado.setPieza(suministra.getPieza());
		suministra_seleccionado.setProveedor(suministra.getProveedor());

		
		suministra_actualizado = suministraImplService.actualizarSuministra(suministra_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ suministra_actualizado);
			
		return suministra_actualizado;
	}
	
	@DeleteMapping("/suministra/{id}")
	public void eliminarSuministra(@PathVariable(name="id")Long id) {
		suministraImplService.eliminarSuministra(id);
	}
	
	@GetMapping("/suministra/precio/{precio}")
	public List<Suministra> listarSuministraPrecio(@PathVariable(name="precio")int precio){
		return suministraImplService.listarXPrecio(precio);
	}
	
	@GetMapping("/suministra/pieza/{pieza}")
	public Suministra listarSuministraPieza(@PathVariable(name="pieza")Long pieza){
		Pieza pieza_final= new Pieza();
		pieza_final = piezaImplService.piezaXID(pieza);
		return suministraImplService.listarXPieza(pieza_final);
	}
	
	@GetMapping("/suministra/proveedor/{proveedor}")
	public Suministra listarSuministraProveedor(@PathVariable(name="proveedor")String proveedor){
		Proveedor proveedor_final= new Proveedor();
		proveedor_final = proveedorImplService.proveedorXID(proveedor);
		return suministraImplService.listarXProveedor(proveedor_final);
	}
	
}
