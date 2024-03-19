package modelos;


import java.util.*;

/**
 * 
 */
public class Rectangulo {

    /**
     * Default constructor
     */
    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }

    /**
     * 
     */
    private int base;

    /**
     * 
     */
    private int altura;

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
        // TODO implement here
        return this.base;
    }

    /**
     * Método para modificar el valor del atributo altura
     * @param altura
     */
    public void setAltura(int altura) {
     // TODO implement here
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
     * @param base 
     * @param altura 
     * @return
     */
    public int calcularArea() {
        
        return base*altura;
    }

    /**
     * @param base 
     * @param altura 
     * @return
     */
    public int calcularPerimetro() {
        // TODO implement here
        return (base*2 + altura*2);
    }

}