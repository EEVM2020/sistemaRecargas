package com.sistemaRecargas.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaRecargas.rest.models.dao.IOperadorDao;
import com.sistemaRecargas.rest.models.entity.Operador;
import com.sistemaRecargas.rest.models.services.IOperadorService;

@Service
public class OperadorImplService implements IOperadorService{

	@Autowired
	private IOperadorDao operadorDao;

	@Override
	public List<Operador> findAll() {
		return operadorDao.findAll();
	}

	@Override
	public Operador save(Operador Operador) {
		return operadorDao.save(Operador);
	}

	@Override
	public Operador findByIdOperador(long idOperador) {
		return operadorDao.findByIdOperador(idOperador);
	}
	
}
