package ar.edu.unlam.pb2;

import java.util.HashSet;



public class Gimnasio {

	private String nombre;
	private String mailGym;
	private String direccion;
	private Integer telefonoGym;
	private Double recaudacion;
	private HashSet<Cliente> clientes;
	private HashSet<Entrenador> entrenadores;

	public Gimnasio(String nombreGym, String mailGym, String direccion, Integer telefonoGym, Double recaudacion) {
		this.nombre = nombre;
		this.mailGym = mailGym;
		this.direccion = direccion;
		this.telefonoGym = telefonoGym;
		this.recaudacion = recaudacion;
		this.clientes = new HashSet<>();
		this.entrenadores = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMailGym() {
		return mailGym;
	}

	public void setMailGym(String mailGym) {
		this.mailGym = mailGym;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefonoGym() {
		return telefonoGym;
	}

	public void setTelefonoGym(Integer telefonoGym) {
		this.telefonoGym = telefonoGym;
	}

	public Double getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(Double recaudacion) {
		this.recaudacion = recaudacion;
	}

	public HashSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(HashSet<Cliente> clientes) {
		this.clientes = clientes;
	}

	public boolean agregarEntrenador(Entrenador nuevoEntrenador) {
		return this.entrenadores.add(nuevoEntrenador);
	}

	public int cantidadEntrenadores() {
		
		return this.entrenadores.size();
	}

	public boolean agregarCliente(Cliente nuevoCliente) {
		return this.clientes.add(nuevoCliente);
		
	}

	public int cantidadDePersonas() {
		
		return this.clientes.size();
	}

	public Double recaudacion() {
		Double acumulador = 0.0;
		for (Cliente cliente : clientes) {
			Pase paseParaRecaudacion = cliente.getPaseDelCliente();
			acumulador += paseParaRecaudacion.getPrecio();
		}
		return acumulador;
	}

	public boolean generarNumeroDeCliente(Cliente nuevoCliente) {
		Integer numeroGenerado = (int) Math.round(Math.random() * (100 - 0 + 1) + 0);
		nuevoCliente.setNumeroDeSocio(numeroGenerado);
		return true;
	
	}
		
	

	
}
