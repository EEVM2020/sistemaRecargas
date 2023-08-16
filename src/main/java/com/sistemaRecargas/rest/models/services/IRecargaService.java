package com.sistemaRecargas.rest.models.services;

import java.util.List;

import com.sistemaRecargas.rest.models.entity.Recarga;


public interface IRecargaService  {

	public List<Recarga> findAll();
		
	public Recarga save(Recarga recarga);
		
	public Recarga findByIdRecarga(long idRecarga);
}
