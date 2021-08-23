package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import app.dto.Pieza;
import app.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPieza(){
		return piezaServiceImpl.listarPieza();
	}
	
	@PostMapping("/piezas")
	public Pieza salvarPieza(@RequestBody Pieza pieza){
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	//Actualizar
	@PutMapping("/piezas/{id}")
	public Pieza actualizarPieza(@PathVariable(name="id")Long id,@RequestBody Pieza pieza) {
			
		Pieza pieza_seleccionado= new Pieza();
		Pieza pieza_actualizado= new Pieza();
			
		pieza_seleccionado = piezaServiceImpl.piezaXID(id);
			
		pieza_seleccionado.setNombre(pieza.getNombre());

		
		pieza_actualizado = piezaServiceImpl.actualizarPieza(pieza_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ pieza_actualizado);
			
		return pieza_actualizado;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eliminarPieza(@PathVariable(name="id")Long id) {
		piezaServiceImpl.eliminarPieza(id);
	}
	
	@GetMapping("/piezas/nombre/{nombre}")
	public List<Pieza> listarPiezaNombres(@PathVariable(name="nombre")String nombre){
		return piezaServiceImpl.listarPiezaNombre(nombre);
	}
	
}
