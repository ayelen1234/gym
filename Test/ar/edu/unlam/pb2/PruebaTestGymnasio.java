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

}
