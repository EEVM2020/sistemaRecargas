package com.sistemaRecargas.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaRecargas.rest.models.dao.IVendedorDao;
import com.sistemaRecargas.rest.models.entity.Vendedor;
import com.sistemaRecargas.rest.models.services.IVendedorService;

@Service
public class VendedorImplService implements IVendedorService {

	@Autowired
	IVendedorDao vendedorDao;
	
	@Override
	public List<Vendedor> findAll() {
		return vendedorDao.findAll();
	}

	@Override
	public Vendedor save(Vendedor vendedor) {
		return vendedorDao.save(vendedor);
	}

	@Override
	public Vendedor findByIdVendedor(long idVendedor) {
		return vendedorDao.findByIdVendedor(idVendedor);
	}

}
