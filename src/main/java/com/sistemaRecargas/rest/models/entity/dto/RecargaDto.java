package com.sistemaRecargas.rest.models.entity.dto;


public class RecargaDto {
	
	private String lineaRecargada;
	
	private double valorRecarga;

	private long idOperador;
	
	private long idVendedor;
	


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



	
	public long getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(long idOperador) {
		this.idOperador = idOperador;
	}

	public long getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(long idVendedor) {
		this.idVendedor = idVendedor;
	}

	public RecargaDto() {
		
	}

	public RecargaDto(String lineaRecargada, double valorRecarga, long idOperador, long idVendedor) {
		super();
		this.lineaRecargada = lineaRecargada;
		this.valorRecarga = valorRecarga;
		this.idOperador = idOperador;
		this.idVendedor = idVendedor;
	}


	
}
