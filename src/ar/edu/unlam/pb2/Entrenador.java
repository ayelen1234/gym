package ar.edu.unlam.pb2;

public class Entrenador extends Persona {
	private Especialidades especialidadDelEntrenador;

	public Entrenador(String nombre, Integer dni, Especialidades especialidadEntrenador, String mail,
			Integer telefono) {
		super(nombre, dni, mail, telefono);
		this.especialidadDelEntrenador = especialidadEntrenador;
	}

	public Especialidades getEspecialidadDelEntrenador() {
		return especialidadDelEntrenador;
	}

	public void setEspecialidadDelEntrenador(Especialidades especialidadDelEntrenador) {
		this.especialidadDelEntrenador = especialidadDelEntrenador;
	}

}
