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

import com.sistemaRecargas.rest.models.entity.Operador;
import com.sistemaRecargas.rest.models.services.IOperadorService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class OperadorController {
	
	@Autowired
	IOperadorService operadorService;
	
	
	@PostMapping("/operador")
	public ResponseEntity<?> recargar(@RequestParam(name =  "operador" ,required = true) String operadorNombre){
		HashMap<String, Object>response= new HashMap<String, Object>();
        Operador operador;
        
		try {
					

			operador=new Operador();
			operador.setOperador(operadorNombre);
           
            
			operadorService.save(operador);

		} catch (Exception e) {
			response.put("mensaje", "Error interno");
			e.printStackTrace();
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
		response.put("operador ",operador.getOperador() );
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK) ;
	}

	
}
