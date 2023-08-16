package com.sistemaRecargas.rest.models.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="operador")
public class Operador {
	
	@Id
	@Column(name="idOperador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idOperador;
	
	@Column(name="operador")
	private String operador;
	

	@OneToMany(mappedBy = "operador",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Recarga>recargas;

	public Operador() {
		super();
	}
	public Operador(long idOperador, String operador) {
		super();
		this.idOperador = idOperador;
		this.operador = operador;
	}
	public long getIdOperador() {
		return idOperador;
	}
	public void setIdOperador(long idOperador) {
		this.idOperador = idOperador;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}

	
	
}
