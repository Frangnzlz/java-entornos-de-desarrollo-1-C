package modelos;

import java.util.*;

/**
 * 
 */
public class Circulo {
	
    private int radio;

    public void Circulo() {
        radio = 1;
    }

    /**
     * Constructor con un parametro para el radio
     * @param radio
     */
    public void Circulo(int radio) {
        this.radio = radio;
    }

    /**
     * @param radio
     */
    public void setRadio(int radio) {
        this.radio =radio;
    }

    /**
     * @return
     */
    public int getRadio() {
    
        return radio;
    }

    /**
     * @return
     */
    public double getArea() {

        return	(Math.PI * Math.pow(radio, 2));
    }
    
    /**
     * @return
     */
    public double getPerimetro() {
    	
        return (2 * Math.PI * radio);
    }

}