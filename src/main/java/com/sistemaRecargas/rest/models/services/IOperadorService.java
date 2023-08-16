package com.sistemaRecargas.rest.models.services;

import java.util.List;

import com.sistemaRecargas.rest.models.entity.Operador;


public interface IOperadorService {

    public List<Operador> findAll();
	
	public Operador save(Operador operador);
	
	public Operador findByIdOperador(long idOperador);
}
