package com.sistemaRecargas.rest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sistemaRecargas.rest.models.entity.Recarga;

public interface IRecargaDao extends JpaRepository<Recarga, Long> {
	@Query("select r from Recarga r where r.idRecarga=?1")
	public Recarga findByIdRecarga(long idRecarga);
}
