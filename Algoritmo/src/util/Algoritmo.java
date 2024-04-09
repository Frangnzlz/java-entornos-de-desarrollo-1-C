package util;

public abstract class Algoritmo {
	
	/**
	 * Devuelve el sumatorio del numero especificado
	 * 
	 * @param numero el numero del que queremos calcular el sumatorio
	 * @return el sumatorio del numero especificado
	 */
	public static int sumatorio(int numero) {
		int result = 0;
		
		for(int i = numero; i > 0 ; i--) {
			result += i;
		}

		return result;
	}
	
	/**
	 * Devuelve el factorial del numero especificado
	 * 
	 * @param numero  el nunmero del que queremos calcular el factorial
	 * @return	el factorial del numero especificado
	 */
	public static int factorial(int numero) {
		int result = 1;
		
		for(int i = numero; i > 0; i--) {
			result *= i;
		}
		
		return result;
	}
}
