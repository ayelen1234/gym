package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class PaseDeUnMes extends Pase {

	private final int PLAZO_DE_VENCIMIENTO = 30;

	public PaseDeUnMes(Double porcentajeDeDescuento, Double precio, Boolean congelarPase, LocalDate fechaInicio) {
		super(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		
	}

}
