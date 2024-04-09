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
}
