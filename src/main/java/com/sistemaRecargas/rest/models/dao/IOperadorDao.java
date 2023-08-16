package com.sistemaRecargas.rest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sistemaRecargas.rest.models.entity.Operador;


public interface IOperadorDao extends JpaRepository<Operador, Long> {
	@Query("select o from Operador o where o.idOperador=?1")
	public Operador findByIdOperador(long idOperador);
}
