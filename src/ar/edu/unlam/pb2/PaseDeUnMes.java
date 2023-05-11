package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class PaseDeUnMes extends Pase {

	private final int PLAZO_DE_VENCIMIENTO = 30;
	private final Double PRECIO_PASE_UN_MES=4000.0;

	public PaseDeUnMes(Double porcentajeDeDescuento, Double precio, Boolean congelarPase, LocalDate fechaInicio) {
		super(porcentajeDeDescuento, precio, congelarPase, fechaInicio);

	}

	@Override
	protected LocalDate calcularFechaDeVencimiento() {
		LocalDate fechaDeVencimiento = null;
		LocalDate fechaIngreso = this.fechaInicio;

		fechaDeVencimiento = fechaIngreso.plusDays(PLAZO_DE_VENCIMIENTO);
		super.setFechaVencimiento(fechaDeVencimiento);
		return fechaDeVencimiento;
	}

	public int getPLAZO_DE_VENCIMIENTO() {
		return PLAZO_DE_VENCIMIENTO;
	}

	public Double getPRECIO_PASE_UN_MES() {
		return PRECIO_PASE_UN_MES;
	}

	
	

}
