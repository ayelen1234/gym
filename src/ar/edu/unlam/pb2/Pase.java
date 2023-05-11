package ar.edu.unlam.pb2;

import java.time.LocalDate;

public abstract  class Pase {
	protected Double porcentajeDeDescuento;
	protected Double precio;
	protected LocalDate fechaVencimiento;
	protected Boolean congelarPase;
	protected LocalDate fechaInicio;

	public Pase(Double porcentajeDeDescuento, Double precio, Boolean congelarPase, LocalDate fechaInicio) {
		this.porcentajeDeDescuento = porcentajeDeDescuento;
		this.precio = precio;
		this.congelarPase = congelarPase;
		this.fechaInicio = fechaInicio;
	}

	
	public void setPorcentajeDeDescuento(Double porcentajeDeDescuento) {
		this.porcentajeDeDescuento = porcentajeDeDescuento;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Boolean getCongelarPase() {
		return congelarPase;
	}

	public void setCongelarPase(Boolean congelarPase) {
		this.congelarPase = congelarPase;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	protected abstract LocalDate calcularFechaDeVencimiento();


	protected abstract Double calcularPorcentajeDeDescuento();

}