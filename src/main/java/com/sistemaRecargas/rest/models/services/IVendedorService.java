package com.sistemaRecargas.rest.models.services;

import java.util.List;
import com.sistemaRecargas.rest.models.entity.Vendedor;

public interface IVendedorService {
	 public List<Vendedor> findAll();
		
		public Vendedor save(Vendedor vendedor);
		
		public Vendedor findByIdVendedor(long idVendedor);

}
