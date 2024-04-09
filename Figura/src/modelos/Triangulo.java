package modelos;


import java.util.*;

public class Triangulo {

    private int base;
    private int altura;

    /**
     * Constructor por defecto
     */
    public Triangulo() {
        this.base = 1;
        this.altura = 1;
    }

    /**
     * Constructor para indicar la base y la altura
     * @param base 
     * @param altura
     */
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para modificar la base
     * @param base
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Método para modificar la altura
     * @param altura	
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Método para obtener la base
     * @return
     */
    public int getBase() {
        return base;
    }

    /**
     * Método para obtener la altura
     * @return
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Método para obtener el area
     * @return
     */
    public double getArea() {
        return ((base*altura)/2);
    }

}