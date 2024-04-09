package modelos;
/**
 *Clase Rectangulo. Permite crear rectangulo y calcular su area y perimetro
 * 
 *  @author Fran
 */
public class Rectangulo extends Figura{
	
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
     * Constructor que crea un rectangulo con la base y la altura especificadas en metro
     * 
     * @param la base del rectangulo en metros
     * @param la altura del rectangulo en metros
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
     * @see modelos.Figura#area()
     */
	@Override
	public double area() {
		
		return this.base*this.altura;
	}

	/**
	 *@see modelos.Figura#perimetro() 
	 */
	@Override
	public double perimetro() {
		return  2*base + 2*altura;
	}


}