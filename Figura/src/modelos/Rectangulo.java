package modelos;

import java.util.*;

public class Rectangulo {
	
    private int base;
    private int altura;
    

    /**
     * Default constructor
     */
    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }
    
    
    /**
     * Método constructor que te pide el valor de todos los atributos
     * @param base 
     * @param altura
     */
    public Rectangulo(int base, int altura) {
    	this.base = base;
    	this.altura = altura;
    }

    /**
     * Método para modificar el valor del atributo base
     * @param base
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Método para ver el valor del atributo base
     * @return
     */
    public int getBase() {
        return this.base;
    }

    /**
     * Método para modificar el valor del atributo altura
     * @param altura
     */
    public void setAltura(int altura) {
    	this.altura = altura;
    }


    /**
     * Método para modificar el valor del atributo base
     * @return
     */
    public int getAltura() {
        
        return altura;
    }

    /**
     * Método para calcular el área del rectángulo
     * @return
     */
    public int getArea() {
        return base*altura;
    }

    /**
     * Método para calcular el perimetro del rectángulo
     * @return
     */
    public int getPerimetro() {
        return (base*2 + altura*2);
    }

}