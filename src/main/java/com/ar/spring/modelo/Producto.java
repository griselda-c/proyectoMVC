package com.ar.spring.modelo;

import org.springframework.beans.factory.annotation.Autowired;

public class Producto{

	private String nombreProducto;
	
	private int stockMinimo;
	
	
	
	@Autowired
	private Precio precio;
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	public int getStockMinimo() {
		return stockMinimo;
	}
	
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public Precio getPrecio() {
		return precio;
	}

	public void setPrecio(Precio precio) {
		this.precio = precio;
	}
	
	

		
	
}
