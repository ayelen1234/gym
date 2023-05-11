package ar.edu.unlam.pb2;

public class Cliente extends Persona {

	private Integer numeroDeSocio;
	private Pase paseDelCliente; // sino es null no lo agreges

	public Cliente(String nombre, Integer dni, String mail, Integer telefono, Pase nuevoPase) {
		super(nombre, dni, mail, telefono);
		this.paseDelCliente = nuevoPase;
	}

	public Pase getPaseDelCliente() {
		return paseDelCliente;
	}

	public void setPaseDelCliente(Pase paseDelCliente) {
		if (this.paseDelCliente.equals(null)) {
			this.paseDelCliente = paseDelCliente;
		}
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	@Override
	public String toString() {
		return "Cliente [numeroDeSocio=" + numeroDeSocio + ", paseDelCliente=" + paseDelCliente + "]";
	}

}