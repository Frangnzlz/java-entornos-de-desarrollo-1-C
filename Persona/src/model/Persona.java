package model;

public class Persona {
	int edad;
	String nombre;
	String apellidos;
	
	/**
	 * 
	 * @param edad edad de la persona tiene que estar entre 0 y 130
	 * @param nombre nombre de la persona
	 * @param apellidos apellido de la persona
	 * @throws IllegalArgumentException Cuando la edad esta fuera del limite
	 */
	public Persona(int edad,String nombre, String apellidos) {
		if(edad < 0 || edad > 130) {
			throw new IllegalArgumentException("La edad esta fuera de rango");
		}
		
		this.nombre = nombre;
		this.apellidos = nombre;
		this.edad = edad;
		
	}
	
	/**
	 * 
	 * @param edad edad a la que queramos cambiar tiene que estar entre 0 y 130
	 * @throws IllegalArgumentException Cuando la edad esta fuera del limite
	 */
	public void setEdad(int edad) {
		if(edad < 0 || edad > 130) {
			throw new IllegalArgumentException("La edad esta fuera de rango");
		}
		
		this.edad = edad;
	}
	
	/**
	 * 
	 * @param nombre nombre al que queramos cambiar
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @param apellido apellido al que queramos cambiar
	 */
	public void setApellido(String apellido) {
		this.apellidos = apellido;
	}
	
	/**
	 * 
	 * @return Devuelve edad de la Persona
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * 
	 * @return Devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @return devuelve el nombre de la persona
	 */
	public String getApellido() {
		return apellidos;
	}
	/**
	 * 
	 * @return Devuelve si la persona es menor de edad, mayor de edad o esta jubilada
	 */
	public String mostrarEdad() {
		String frase = "";
		
		if(this.edad < 18) {
			frase = "Menor de edad";
		}else if(this.edad <= 65) {
			frase = "Mayor de edad";
		}else {
			frase = "Jubilado";
		}
		
		return frase;
	}
	
	
	
	
}
