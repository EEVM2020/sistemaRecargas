package com.sistemaRecargas.rest.models.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="vendedor")
public class Vendedor {

	@Id
	@Column(name="idVendedor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idVendedor;
	@Column(name="nombreVendedor")
	private String nombreVendedor;
	@Column(name="apellidoVendedor")
	private String apellidoVendedor;
	
	@OneToMany(mappedBy = "vendedor",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Recarga>recargas;
	
	public Vendedor() {
		
	}
	public Vendedor(long idVendedor, String nombreVendedor, String apellidoVendedor) {
		super();
		this.idVendedor = idVendedor;
		this.nombreVendedor = nombreVendedor;
		this.apellidoVendedor = apellidoVendedor;
	}
	public long getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(long idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	public String getApellidoVendedor() {
		return apellidoVendedor;
	}
	public void setApellidoVendedor(String apellidoVendedor) {
		this.apellidoVendedor = apellidoVendedor;
	}
	
	
	
}
