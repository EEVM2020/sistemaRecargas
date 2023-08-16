package com.sistemaRecargas.rest.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name="recarga")
public class Recarga {
	@Id
	@Column(name="idRecarga")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRecarga;
	
	@Column(name="lineaRecargada")
	private String lineaRecargada;
	
	@Column(name="valorRecarga")
	private double valorRecarga;
	
	@ManyToOne
    @JoinColumn(name = "idOperador")
	private Operador operador;
	
	@ManyToOne
    @JoinColumn(name = "idVendedor")
	private Vendedor vendedor;

	public long getIdRecarga() {
		return idRecarga;
	}

	public void setIdRecarga(long idRecarga) {
		this.idRecarga = idRecarga;
	}

	public String getLineaRecargada() {
		return lineaRecargada;
	}

	public void setLineaRecargada(String lineaRecargada) {
		this.lineaRecargada = lineaRecargada;
	}

	public double getValorRecarga() {
		return valorRecarga;
	}

	public void setValorRecarga(double valorRecarga) {
		this.valorRecarga = valorRecarga;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Recarga(long idRecarga, String lineaRecargada, double valorRecarga, Operador operador, Vendedor vendedor) {
		super();
		this.idRecarga = idRecarga;
		this.lineaRecargada = lineaRecargada;
		this.valorRecarga = valorRecarga;
		this.operador = operador;
		this.vendedor = vendedor;
	}
	
	public Recarga() {
		
	}

	@Override
	public String toString() {
		return "Recarga [idRecarga=" + idRecarga + ", lineaRecargada=" + lineaRecargada + ", valorRecarga="
				+ valorRecarga + ", operador=" + operador + ", vendedor=" + vendedor + "]";
	}

	
}
