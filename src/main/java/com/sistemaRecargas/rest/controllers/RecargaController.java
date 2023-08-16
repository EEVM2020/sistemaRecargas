package com.sistemaRecargas.rest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaRecargas.rest.models.entity.Operador;
import com.sistemaRecargas.rest.models.entity.Recarga;
import com.sistemaRecargas.rest.models.entity.Vendedor;
import com.sistemaRecargas.rest.models.entity.dto.RecargaDto;
import com.sistemaRecargas.rest.models.services.IOperadorService;
import com.sistemaRecargas.rest.models.services.IRecargaService;
import com.sistemaRecargas.rest.models.services.IVendedorService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class RecargaController {

	@Autowired
	IRecargaService recargaService;
	
	@Autowired
	IOperadorService operadorService;
	
	@Autowired
	IVendedorService vendedorService;
	
	@PostMapping("/recarga")
	public ResponseEntity<?> recargar(@RequestBody  RecargaDto recargaEntra, BindingResult validaciones ){
		HashMap<String, Object>response= new HashMap<String, Object>();
		Recarga recargaGuardar;
        Vendedor vendedor;
        Operador operador;
        System.out.println("llego "+recargaEntra.toString());
		try {
			operador=operadorService.findByIdOperador(recargaEntra.getIdOperador());		
			
            if(operador==null || operador.getIdOperador()==0) {
            	response.put("mensaje", "No se encontró el operador");
    			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.BAD_REQUEST) ;
            }
            
            vendedor=vendedorService.findByIdVendedor(recargaEntra.getIdVendedor());		
			
            if(vendedor==null || vendedor.getIdVendedor()==0) {
            	response.put("mensaje", "No se encontró el vendedor");
    			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.BAD_REQUEST) ;
          }
            


			recargaGuardar=new Recarga();
			recargaGuardar.setLineaRecargada(recargaEntra.getLineaRecargada());
			recargaGuardar.setValorRecarga(recargaEntra.getValorRecarga());
			recargaGuardar.setOperador(operador);
			recargaGuardar.setVendedor(vendedor);
            
            recargaService.save(recargaGuardar);

		} catch (Exception e) {
			response.put("mensaje", "Error interno");
			e.printStackTrace();
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
		response.put("recarga ",recargaGuardar.getValorRecarga() );
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK) ;
	}

}
