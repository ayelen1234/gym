package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class PaseDeSeisMeses extends Pase {

	private double precioPaseSeisMeses = 24000.0;
	private final int PLAZO_VENCIMIENTO_SEIS_MESES = 180;
	private final double DESCUENTO_PASE_SEIS_MESES = 30.0;
	private final int CONGELAR_PASE_SEIS_MESES = 15;

	public PaseDeSeisMeses(Double porcentajeDeDescuento, Double precio, Boolean congelarPase, LocalDate fechaInicio) {
		super(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		setPorcentajeDeDescuento(DESCUENTO_PASE_SEIS_MESES);
	}

	@Override
	protected LocalDate calcularFechaDeVencimiento() {
		LocalDate fechaDeVencimiento = null;
		LocalDate fechaIngreso = this.fechaInicio;

		if (this.getCongelarPase().equals(false)) {
			fechaDeVencimiento = fechaIngreso.plusDays(PLAZO_VENCIMIENTO_SEIS_MESES);
			super.setFechaVencimiento(fechaDeVencimiento);
		}
		return fechaDeVencimiento;
	}

	public double getPrecioPaseSeisMeses() {
		return precioPaseSeisMeses;
	}

	public void setPrecioPaseSeisMeses(double precioPaseSeisMeses) {
		this.precioPaseSeisMeses = precioPaseSeisMeses;
	}

	public int getPLAZO_VENCIMIENTO_SEIS_MESES() {
		return PLAZO_VENCIMIENTO_SEIS_MESES;
	}

	public double getDESCUENTO_PASE_SEIS_MESES() {
		return DESCUENTO_PASE_SEIS_MESES;
	}

	public int getCONGELAR_PASE_SEIS_MESES() {
		return CONGELAR_PASE_SEIS_MESES;
	}

	@Override
	protected Double calcularPorcentajeDeDescuento() {
		double precioFinal = 0.0;
		precioFinal = this.precioPaseSeisMeses - (this.precioPaseSeisMeses * this.DESCUENTO_PASE_SEIS_MESES) / 100;
		setPrecio(precioFinal);

		return precioFinal;
	}

}
