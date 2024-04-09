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
}
