package utilidades;

import persona.Persona;

public class FactoryPersona {

	public static Persona getPersona(String nombre) {
		Persona p = new Persona();

		p.setNombre(nombre);

		int edad = (int) (Math.random() * 100);

		p.setEdad(edad);

		int peso = (int) (Math.random() * 101);

		p.setPeso(peso);

		int altura = (int) (Math.random() * 201);

		p.setAltura(altura);

		return p;
	}
}
