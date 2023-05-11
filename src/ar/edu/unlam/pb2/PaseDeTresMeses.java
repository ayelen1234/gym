package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class PaseDeTresMeses extends Pase {
	private double precioPaseTresMeses = 12000.0;
	private final int PLAZO_VENCIMIENTO_TRES_MESES = 90;
	private final double DESCUENTO_PASE_TRES_MESES = 15.0;
	private final int CONGELAR_PASE_TRES_MESES = 7;

	public PaseDeTresMeses(Double porcentajeDeDescuento, Double precio, Boolean congelarPase, LocalDate fechaInicio) {
		super(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		setPorcentajeDeDescuento(DESCUENTO_PASE_TRES_MESES);
	}

	public double getPrecioPaseTresMeses() {
		return precioPaseTresMeses;
	}

	public void setPrecioPaseTresMeses(double precioPaseTresMeses) {
		this.precioPaseTresMeses = precioPaseTresMeses;
	}

	public int getPLAZO_VENCIMIENTO_TRES_MESES() {
		return PLAZO_VENCIMIENTO_TRES_MESES;
	}

	public double getDESCUENTO_PASE_TRES_MESES() {
		return DESCUENTO_PASE_TRES_MESES;
	}

	public int getCONGELAR_PASE_TRES_MESES() {
		return CONGELAR_PASE_TRES_MESES;
	}

	@Override
	protected LocalDate calcularFechaDeVencimiento() {
		LocalDate fechaDeVencimiento = null;
		LocalDate fechaIngreso = this.fechaInicio;
		fechaDeVencimiento = fechaIngreso.plusDays(PLAZO_VENCIMIENTO_TRES_MESES);
		super.setFechaVencimiento(fechaDeVencimiento);
		return fechaDeVencimiento;
	}


}
