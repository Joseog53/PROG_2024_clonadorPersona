package persona;

public class Persona {

	private String nombre;
	private int peso;
	private int altura;
	private int edad;
	
	/**
	 * Constructor de Persona con sus atributos
	 * @param nombre
	 * @param peso
	 * @param altura
	 * @param edad
	 */
	 
	
	public Persona(String nombre, int peso, int altura, int edad) {
		
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}

	

	public Persona() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * getter para recoger un nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter para establecer un nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * getter para recoger un peso
	 * @return peso
	 */

	public int getPeso() {
		return peso;
	}

	/**
	 * setter para establecer un peso
	 * @param peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	/**
	 * getter para recoger una altura
	 * @return altura
	 */

	public int getAltura() {
		return altura;
	}
	
	/**
	 * setter para establecer una altura
	 * @param altura
	 */

	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * getter para recoger una edad
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * setter para establecer una edad
	 * @param edad
	 */

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * toString para mostrar los datos
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", edad=" + edad + "]";
	}
	
	
	
}
