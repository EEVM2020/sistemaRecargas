package com.sistemaRecargas.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaRecargas.rest.models.dao.IRecargaDao;
import com.sistemaRecargas.rest.models.entity.Recarga;
import com.sistemaRecargas.rest.models.services.IRecargaService;

@Service
public class RecargaImplService implements IRecargaService {

	
	@Autowired
	IRecargaDao recargaDao;
	
	@Override
	public List<Recarga> findAll() {
		return recargaDao.findAll();
	}

	@Override
	public Recarga save(Recarga recarga) {
		return recargaDao.save(recarga);
	}

	@Override
	public Recarga findByIdRecarga(long idRecarga) {
		return recargaDao.findByIdRecarga(idRecarga);
	}

}
