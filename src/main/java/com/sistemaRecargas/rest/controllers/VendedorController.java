package com.sistemaRecargas.rest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaRecargas.rest.models.entity.Vendedor;
import com.sistemaRecargas.rest.models.services.IVendedorService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class VendedorController {
	
	@Autowired
	 IVendedorService vendedorService ;
	
	
	@PostMapping("/vendedor")
	public ResponseEntity<?> recargar(@RequestParam(name =  "vendedor" ,required = true) String vendedorNombre,@RequestParam(name =  "apellido" ,required = true) String apellidoVendedor){
		HashMap<String, Object>response= new HashMap<String, Object>();
        Vendedor vendedor;
        
		try {
					

			vendedor=new Vendedor();
			vendedor.setNombreVendedor(vendedorNombre);
			vendedor.setApellidoVendedor(apellidoVendedor);
            
			vendedorService.save(vendedor);

		} catch (Exception e) {
			response.put("mensaje", "Error interno");
			e.printStackTrace();
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
		response.put("Vendedor ",vendedor.getNombreVendedor() );
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK) ;
	}

}
