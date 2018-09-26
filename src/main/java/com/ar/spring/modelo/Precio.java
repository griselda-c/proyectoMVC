package com.ar.spring.modelo;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


public class Precio {
	

	private Double precio;
	
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate fechaInicio;
	
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate fechaHasta;

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	//con LocalDate nos evitamos hacer format de las fecha al hacer display
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(LocalDate fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	
	
	

}
