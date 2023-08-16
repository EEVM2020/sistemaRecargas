package com.sistemaRecargas.rest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sistemaRecargas.rest.models.entity.Vendedor;

public interface IVendedorDao extends JpaRepository<Vendedor, Long> {

	@Query("select v from Vendedor v where v.idVendedor=?1")
	public Vendedor findByIdVendedor(long idVendedor);
	
}
