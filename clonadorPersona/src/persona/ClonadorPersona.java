package persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import utilidades.FactoryPersona;
import utilidades.ValidadorPersona;

public class ClonadorPersona {

	private String nombre;

	List<Persona> personas;

	/**
	 * Constructor de ClonadorPersona
	 * 
	 * @param nombre
	 */

	public ClonadorPersona(String nombre) {

		this.nombre = nombre;
	}

	/**
	 * Operación que genera 10 clones aleatoriamente
	 * 
	 * @return List
	 */

	public List<Persona> generarClones() {

		List<Persona> personas = new ArrayList<Persona>();

		for (int i = 0; i < 10; i++) {

			Persona p = FactoryPersona.getPersona(nombre);

			boolean personaValida = ValidadorPersona.isValid(p);

			if (personaValida) {

				personas.add(0, p);

			}

		}

		return personas;
	}

}
