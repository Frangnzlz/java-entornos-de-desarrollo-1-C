package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmo;

class TestAlgoritmo {
	
	
	
	
	@Test
	void sumatorio() {
		int resultadoEsperado = 3; 
		int resultadoObtenido = Algoritmo.sumatorio(2);
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	@Test
	void sumatorioParamIncorrecto(){
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> Algoritmo.sumatorio(-1));
		
		String esperado = "El numero debe ser igual o superior a 0";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	
	
	@Test
	void factorial() {
		int resultadoEsperado = 24;
		int resusltadoObtenido = Algoritmo.factorial(4);
		assertEquals(resultadoEsperado, resusltadoObtenido);
	}
}
