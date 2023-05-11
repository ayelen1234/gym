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

}
