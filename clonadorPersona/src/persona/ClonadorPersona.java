package persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClonadorPersona {

	private String nombre;

	List<Persona> personas;
	
	/**
	 * Constructor de ClonadorPersona
	 * @param nombre
	 */

	public ClonadorPersona(String nombre) {

		this.nombre = nombre;
	}
	
	/**
	 * Operación que genera 10 clones aleatoriamente
	 * @return List
	 */

	public List<Persona> generarClones() {

		List<Persona> personas = new ArrayList<Persona>();

		Random random = new Random();

		for (int i = 0; i < 10; i++) {

			String nombre = "Persona" + (i + 1);

			int edad = random.nextInt() * 100;

			int peso = random.nextInt() * 100;

			int altura = random.nextInt() * 200;

			Persona persona = new Persona(nombre, edad, peso, altura);

			personas.add(persona);
		}

		return personas;
	}

}
