package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;



public class PruebaTestGymnasio {

	@Test
	public void queSePuedaCrearUnPaseTipoDeUnMesYAsignarleUnCliente() {
		// datos de entrada
		Cliente nuevoCliente;
		Pase nuevoPase;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;

		Double porcentajeDeDescuento = 0.0;
		Double precio = 4000.0;
		Boolean congelarPase = false;
		LocalDate fechaInicio = LocalDate.of(2023, 5, 8);
		// ejecucion
		nuevoPase = new PaseDeUnMes(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		nuevoCliente = new Cliente(nombre, dni, mail, telefono, nuevoPase);

		// validacion
		assertNotNull(nuevoPase);
		assertNotNull(nuevoCliente);
	}

	@Test
	public void queSePuedaCrearUnGimnasio() {
		// datos de entrada
		Gimnasio nuevoGym;

		String nombreGym = "Luis";
		String mailGym = "gym@gmail.com";
		String direccion = "Varela 123";
		Integer telefonoGym = 11456789;
		Double recaudacion = 0.0;
		// ejecucion

		nuevoGym = new Gimnasio(nombreGym, mailGym, direccion, telefonoGym, recaudacion);
		// validacion
		assertNotNull(nuevoGym);
	}

	@Test
	public void queSePuedaCrearUnEntrenador() {
		// datos de entrada
		Entrenador nuevoEntrenador;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;
		Especialidades especialidadEntrenador = Especialidades.CROSSFIT;
		// ejecucion
		nuevoEntrenador = new Entrenador(nombre, dni, especialidadEntrenador, mail, telefono);
		// validacion
		assertNotNull(nuevoEntrenador);
	}

	@Test
	public void queSePuedaAgregarUnEntrenadorAlGimnasio() {
		// datos de entrada
		Entrenador nuevoEntrenador;
		Gimnasio nuevoGym;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;
		Especialidades especialidadEntrenador = Especialidades.CROSSFIT;

		String nombreGym = "Luis";
		String mailGym = "gym@gmail.com";
		String direccion = "Varela 123";
		Integer telefonoGym = 11456789;
		Double recaudacion = 0.0;

		// ejecucion
		nuevoGym = new Gimnasio(nombreGym, mailGym, direccion, telefonoGym, recaudacion);
		nuevoEntrenador = new Entrenador(nombre, dni, especialidadEntrenador, mail, telefono);
		boolean seAgrego = nuevoGym.agregarEntrenador(nuevoEntrenador);
		// validacion
		assertTrue(seAgrego);
	}

	@Test
	public void queNoSePuedaAgregarDosEntrenadorIgualesAlGimnasio() {
		// datos de entrada
		Entrenador nuevoEntrenador;
		Entrenador nuevoEntrenadorOtro;
		Gimnasio nuevoGym;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;
		Especialidades especialidadEntrenador = Especialidades.CROSSFIT;

		String nombreOtro = "Luis";
		Integer dniOtro = 43598590;
		String mailOtro = "cliente@gmail.com";
		Integer telefonoOtro = 1138721497;
		Especialidades especialidadEntrenadorOtro = Especialidades.CROSSFIT;

		String nombreGym = "Luis";
		String mailGym = "gym@gmail.com";
		String direccion = "Varela 123";
		Integer telefonoGym = 11456789;
		Double recaudacion = 0.0;

		int cantidadEntrenadores = 1;
		// ejecucion
		nuevoGym = new Gimnasio(nombreGym, mailGym, direccion, telefonoGym, recaudacion);
		nuevoEntrenador = new Entrenador(nombre, dni, especialidadEntrenador, mail, telefono);
		nuevoEntrenadorOtro = new Entrenador(nombreOtro, dniOtro, especialidadEntrenadorOtro, mailOtro, telefonoOtro);
		nuevoGym.agregarEntrenador(nuevoEntrenador);
		nuevoGym.agregarEntrenador(nuevoEntrenadorOtro);
		int cantidadObtenida = nuevoGym.cantidadEntrenadores();
		// validacion
		assertEquals(cantidadEntrenadores, cantidadObtenida);
	}

	@Test
	public void queSeDeAltaUnClienteEnElGimnasioConPaseDeUnMes() {
		// datos de entrada
		Cliente nuevoCliente;
		Gimnasio nuevoGym;
		Pase nuevoPase;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;

		String nombreGym = "Luis";
		String mailGym = "gym@gmail.com";
		String direccion = "Varela 123";
		Integer telefonoGym = 11456789;
		Double recaudacion = 0.0;

		Double porcentajeDeDescuento = 0.0;
		Double precio = 4000.0;
		Boolean congelarPase = false;
		LocalDate fechaInicio = LocalDate.of(2023, 5, 8);

		boolean seAgregoUnCliente = false;
		// ejecucion

		nuevoGym = new Gimnasio(nombreGym, mailGym, direccion, telefonoGym, recaudacion);
		nuevoPase = new PaseDeUnMes(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		nuevoCliente = new Cliente(nombre, dni, mail, telefono, nuevoPase);
		seAgregoUnCliente = nuevoGym.agregarCliente(nuevoCliente);

		// validacion
		assertNotNull(nuevoGym);
		assertNotNull(nuevoPase);
		assertNotNull(nuevoCliente);
		assertTrue(seAgregoUnCliente);
	}

	@Test
	public void queSePuedaCrearUnPaseYElTipoDeTresMeses() {
		// datos de entrada
		Cliente nuevoCliente;
		Pase nuevoPaseTresMeses;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;

		Double porcentajeDeDescuento = 15.0;
		Double precio = 12000.0;
		Boolean congelarPase = false;
		LocalDate fechaInicio = LocalDate.of(2023, 5, 8);

		// ejecucion
		nuevoPaseTresMeses = new PaseDeTresMeses(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		nuevoCliente = new Cliente(nombre, dni, mail, telefono, nuevoPaseTresMeses);

		// validacion
		assertNotNull(nuevoPaseTresMeses);
		assertNotNull(nuevoCliente);
	}

	@Test
	public void queSePuedaCrearUnPaseYElTipoDeSeisMeses() {
		// datos de entrada
		Cliente nuevoCliente;
		Pase nuevoPaseSeisMeses;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;

		Double porcentajeDeDescuento = 30.0;
		Double precio = 24000.0;
		Boolean congelarPase = false;
		LocalDate fechaInicio = LocalDate.of(2023, 5, 8);

		// ejecucion
		nuevoPaseSeisMeses = new PaseDeSeisMeses(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		nuevoCliente = new Cliente(nombre, dni, mail, telefono, nuevoPaseSeisMeses);

		// validacion
		assertNotNull(nuevoPaseSeisMeses);
		assertNotNull(nuevoCliente);
	}

	@Test
	public void queNoSePuedaAsignarDosPasesAUnCliente() {
		// datos de entrada
		Cliente nuevoCliente;
		Gimnasio nuevoGym;
		Pase nuevoPase;
		Pase otroPase;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;

		String nombreGym = "Luis";
		String mailGym = "gym@gmail.com";
		String direccion = "Varela 123";
		Integer telefonoGym = 11456789;
		Double recaudacion = 0.0;

		Double porcentajeDeDescuento = 0.0;
		Double precio = 4000.0;
		Boolean congelarPase = false;
		LocalDate fechaInicio = LocalDate.of(2023, 5, 8);

		Double porcentajeDeDescuentoOtro = 0.0;
		Double precioOtro = 4000.0;
		Boolean congelarPaseOtro = false;
		LocalDate fechaInicioOtro = LocalDate.of(2023, 5, 8);

		// ejecucion
		nuevoGym = new Gimnasio(nombreGym, mailGym, direccion, telefonoGym, recaudacion);

		nuevoPase = new PaseDeUnMes(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		// esto se ve dentro del set de Cliente
		otroPase = new PaseDeUnMes(porcentajeDeDescuentoOtro, precioOtro, congelarPaseOtro, fechaInicioOtro);
		nuevoCliente = new Cliente(nombre, dni, mail, telefono, nuevoPase);

		nuevoCliente.setPaseDelCliente(otroPase);

		// validacion
		assertEquals(nuevoPase, nuevoCliente.getPaseDelCliente());
	}

	@Test
	public void queSePuedanAgregarVariosClienteAlGimnasio() {
		// datos de entrada
		Cliente nuevoCliente;
		Cliente otroCliente;
		Gimnasio nuevoGym;
		Pase nuevoPase;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;

		String nombreOtro = "Agustin";
		Integer dniOtro = 35598590;
		String mailOtro = "clientx@gmail.com";
		Integer telefonoOtro = 1138721487;

		String nombreGym = "Luis";
		String mailGym = "gym@gmail.com";
		String direccion = "Varela 123";
		Integer telefonoGym = 11456789;
		Double recaudacion = 0.0;

		Double porcentajeDeDescuento = 0.0;
		Double precio = 4000.0;
		Boolean congelarPase = false;
		LocalDate fechaInicio = LocalDate.of(2023, 5, 8);

		boolean seAgregoUnCliente = false;
		boolean seAgregoUnClienteOtro = false;
		LocalDate fechaEsperada = LocalDate.of(2023, 6, 7);
		int cantidadEsperada = 2;
		int cantidadObtenida = 0;
		// ejecucion

		nuevoGym = new Gimnasio(nombreGym, mailGym, direccion, telefonoGym, recaudacion);
		nuevoPase = new PaseDeUnMes(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		otroCliente = new Cliente(nombreOtro, dniOtro, mailOtro, telefonoOtro, nuevoPase);
		nuevoCliente = new Cliente(nombre, dni, mail, telefono, nuevoPase);

		seAgregoUnClienteOtro = nuevoGym.agregarCliente(otroCliente);
		seAgregoUnCliente = nuevoGym.agregarCliente(nuevoCliente);
		cantidadObtenida = nuevoGym.cantidadDePersonas();
		nuevoPase.calcularFechaDeVencimiento();

		// validacion
		assertEquals(cantidadEsperada, cantidadObtenida);
	}

	@Test
	public void queNoSePuedaAgregarDosClientesIguales() {
		// datos de entrada
		Cliente nuevoCliente;
		Cliente otroCliente;
		Gimnasio nuevoGym;
		Pase nuevoPase;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;

		String nombreOtro = "Luis";
		Integer dniOtro = 43598590;
		String mailOtro = "cliente@gmail.com";
		Integer telefonoOtro = 1138721497;

		String nombreGym = "Luis";
		String mailGym = "gym@gmail.com";
		String direccion = "Varela 123";
		Integer telefonoGym = 11456789;
		Double recaudacion = 0.0;

		Double porcentajeDeDescuento = 0.0;
		Double precio = 4000.0;
		Boolean congelarPase = false;
		LocalDate fechaInicio = LocalDate.of(2023, 5, 8);

		boolean seAgregoUnCliente = false;
		boolean seAgregoUnClienteOtro = false;
		LocalDate fechaEsperada = LocalDate.of(2023, 6, 7);

		int cantidadEsperada = 1;
		int cantidadObtenida = 0;
		// ejecucion

		nuevoGym = new Gimnasio(nombreGym, mailGym, direccion, telefonoGym, recaudacion);
		nuevoPase = new PaseDeUnMes(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		otroCliente = new Cliente(nombreOtro, dniOtro, mailOtro, telefonoOtro, nuevoPase);
		nuevoCliente = new Cliente(nombre, dni, mail, telefono, nuevoPase);

		seAgregoUnClienteOtro = nuevoGym.agregarCliente(otroCliente);
		seAgregoUnCliente = nuevoGym.agregarCliente(nuevoCliente);
		cantidadObtenida = nuevoGym.cantidadDePersonas();
		nuevoPase.calcularFechaDeVencimiento();

		// validacion
		assertEquals(cantidadEsperada, cantidadObtenida);
	}

	@Test
	public void queSePuedaRealizarUnDescuentoEnLosPasesDeTresYSeisMeses() {
		// datos de entrada
		Cliente nuevoClienteTresMeses;
		Cliente nuevoClienteSeisMeses;
		Pase nuevoPaseTresMeses;
		Pase nuevoPaseSeisMeses;

		String nombreTresMeses = "Luis";
		Integer dniTresMeses = 43598590;
		String mailTresMeses = "cliente@gmail.com";
		Integer telefonoTresMeses = 1138721497;

		String nombreSeisMeses = "Luis";
		Integer dniSeisMeses = 45598590;
		String mailSeisMeses = "cliente@gmail.com";
		Integer telefonoSeisMeses = 1138721497;

		Double porcentajeDeDescuentoSeisMeses = 30.0;
		Double precioSeisMeses = 24000.0;
		Boolean congelarPaseSeisMeses = false;
		LocalDate fechaInicioSeisMeses = LocalDate.of(2023, 5, 8);

		Double porcentajeDeDescuentoTresMeses = 15.0;
		Double precioTresMeses = 12000.0;
		Boolean congelarPaseTresMeses = false;
		LocalDate fechaInicioTresMeses = LocalDate.of(2023, 5, 8);

		Double precioFinalTresMesesEsperado = 10200.0;
		Double precioFinalSeisMesesEsperado = 16800.0;
		// ejecucion
		nuevoPaseTresMeses = new PaseDeTresMeses(porcentajeDeDescuentoTresMeses, precioTresMeses, congelarPaseTresMeses,
				fechaInicioTresMeses);
		nuevoClienteTresMeses = new Cliente(nombreTresMeses, dniTresMeses, mailTresMeses, telefonoTresMeses,
				nuevoPaseTresMeses);

		nuevoPaseSeisMeses = new PaseDeSeisMeses(porcentajeDeDescuentoSeisMeses, precioSeisMeses, congelarPaseSeisMeses,
				fechaInicioSeisMeses);
		nuevoClienteSeisMeses = new Cliente(nombreSeisMeses, dniSeisMeses, mailSeisMeses, telefonoSeisMeses,
				nuevoPaseSeisMeses);

		Double precioRecibidoTresMeses = nuevoPaseTresMeses.calcularPorcentajeDeDescuento();
		Double precioRecibidoSeisMeses = nuevoPaseSeisMeses.calcularPorcentajeDeDescuento();
		// validacion
		assertEquals(precioFinalTresMesesEsperado, precioRecibidoTresMeses);
		assertEquals(precioFinalSeisMesesEsperado, precioRecibidoSeisMeses);
	}

	@Test
	public void queSePuedaVerLoRecaudadoEnElGimnasio() {
		// datos de entrada
		Gimnasio nuevoGym;
		Cliente nuevoClienteTresMeses;
		Cliente nuevoClienteSeisMeses;
		Pase nuevoPaseTresMeses;
		Pase nuevoPaseSeisMeses;

		String nombreGym = "Luis";
		String mailGym = "gym@gmail.com";
		String direccion = "Varela 123";
		Integer telefonoGym = 11456789;
		Double recaudacion = 0.0;

		String nombreTresMeses = "Luis";
		Integer dniTresMeses = 43598590;
		String mailTresMeses = "cliente@gmail.com";
		Integer telefonoTresMeses = 1138721497;

		String nombreSeisMeses = "Luis";
		Integer dniSeisMeses = 45598590;
		String mailSeisMeses = "cliente@gmail.com";
		Integer telefonoSeisMeses = 1138721497;

		Double porcentajeDeDescuentoSeisMeses = 30.0;
		Double precioSeisMeses = 24000.0;
		Boolean congelarPaseSeisMeses = false;
		LocalDate fechaInicioSeisMeses = LocalDate.of(2023, 5, 8);

		Double porcentajeDeDescuentoTresMeses = 15.0;
		Double precioTresMeses = 12000.0;
		Boolean congelarPaseTresMeses = false;
		LocalDate fechaInicioTresMeses = LocalDate.of(2023, 5, 8);

		Double recaudacionEsperada = 27000.0;
		// ejecucion

		nuevoGym = new Gimnasio(nombreGym, mailGym, direccion, telefonoGym, recaudacion);
		nuevoPaseTresMeses = new PaseDeTresMeses(porcentajeDeDescuentoTresMeses, precioTresMeses, congelarPaseTresMeses,
				fechaInicioTresMeses);
		nuevoClienteTresMeses = new Cliente(nombreTresMeses, dniTresMeses, mailTresMeses, telefonoTresMeses,
				nuevoPaseTresMeses);

		nuevoPaseSeisMeses = new PaseDeSeisMeses(porcentajeDeDescuentoSeisMeses, precioSeisMeses, congelarPaseSeisMeses,
				fechaInicioSeisMeses);
		nuevoClienteSeisMeses = new Cliente(nombreSeisMeses, dniSeisMeses, mailSeisMeses, telefonoSeisMeses,
				nuevoPaseSeisMeses);
		nuevoPaseTresMeses.calcularPorcentajeDeDescuento();
		nuevoPaseSeisMeses.calcularPorcentajeDeDescuento();
		nuevoGym.agregarCliente(nuevoClienteTresMeses);
		nuevoGym.agregarCliente(nuevoClienteSeisMeses);
		Double recaudado = nuevoGym.recaudacion();
		// validacion
		assertEquals(recaudacionEsperada, recaudado);
	}

	@Test
	public void queSePuedaGenerarUnNumeroDeCliente() {
		// datos de entrada
		Cliente nuevoCliente;
		Gimnasio nuevoGym;
		Pase nuevoPase;

		String nombre = "Luis";
		Integer dni = 43598590;
		String mail = "cliente@gmail.com";
		Integer telefono = 1138721497;

		String nombreGym = "Luis";
		String mailGym = "gym@gmail.com";
		String direccion = "Varela 123";
		Integer telefonoGym = 11456789;
		Double recaudacion = 0.0;

		Double porcentajeDeDescuento = 0.0;
		Double precio = 4000.0;
		Boolean congelarPase = false;
		LocalDate fechaInicio = LocalDate.of(2023, 5, 8);

		boolean seAgregoUnCliente = false;
		boolean seGeneroNumeroUnCliente = false;
		// ejecucion

		nuevoGym = new Gimnasio(nombreGym, mailGym, direccion, telefonoGym, recaudacion);
		nuevoPase = new PaseDeUnMes(porcentajeDeDescuento, precio, congelarPase, fechaInicio);
		nuevoCliente = new Cliente(nombre, dni, mail, telefono, nuevoPase);
		seAgregoUnCliente = nuevoGym.agregarCliente(nuevoCliente);
		seGeneroNumeroUnCliente = nuevoGym.generarNumeroDeCliente(nuevoCliente);

		// validacion
		assertTrue(seGeneroNumeroUnCliente);
	}

}
