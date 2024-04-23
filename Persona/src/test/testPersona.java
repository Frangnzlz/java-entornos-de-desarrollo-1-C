package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Persona;

class testPersona {

	@Test
	void testConstructoArriba(){
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> new Persona(131, "" ,""));
		
		String esperado = "La edad esta fuera de rango";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	@Test
	void testConstructoAbajo(){
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> new Persona(-1, "" ,""));
		
		String esperado = "La edad esta fuera de rango";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	@Test
	void testSetEdadAbajo() {
		Persona per = new Persona(18, "" ,"");
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> per.setEdad(-1));
		
		String esperado = "La edad esta fuera de rango";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testSetEdadArriba() {
		Persona per = new Persona(18, "" ,"");
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> per.setEdad(131));
		
		String esperado = "La edad esta fuera de rango";
		String obtenido =  excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	@Test
	void testMostrarEdad0() {
		Persona per = new Persona(0 ,"","");
		
		String esperado ="Menor de edad";
		String obtenido = per.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	@Test
	void testMostrarEdad17() {
		Persona per = new Persona(17 ,"","");
		
		String esperado ="Menor de edad";
		String obtenido = per.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	@Test
	void testMostrarEdad18() {
		Persona per = new Persona(18 ,"","");
		
		String esperado ="Mayor de edad";
		String obtenido = per.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	@Test
	void testMostrarEdad65() {
		Persona per = new Persona(65 ,"","");
		
		String esperado ="Mayor de edad";
		String obtenido = per.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testMostrarEdad66() {
		Persona per = new Persona(66 ,"","");
		
		String esperado ="Jubilado";
		String obtenido = per.mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	
	
}
