package app;

import modelos.Rectangulo;

public class mainRectangulo {
	
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(5, 7);
		
		
		
		
		
		double area = rectangulo.area();
		
		System.out.println(rectangulo.getAltura());
		
		System.out.println(rectangulo.getBase());
		
		System.out.println(area);
		
		System.out.println(rectangulo.perimetro());
		
	}
}
