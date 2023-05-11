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

}
