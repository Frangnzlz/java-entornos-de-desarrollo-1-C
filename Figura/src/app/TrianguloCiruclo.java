package app;

import modelos.Circulo;
import modelos.Triangulo;

public class TrianguloCiruclo {

	public static void main(String[] args) {
		
		Triangulo triangulo1 = new Triangulo(1,2);
		
		double areaTriangulo = triangulo1.getArea();
		System.out.println(areaTriangulo);
		
		triangulo1.setBase(2);
		System.out.println(triangulo1.getBase());
		
		areaTriangulo = triangulo1.getArea();
		System.out.println(areaTriangulo);
		
		Circulo circulo1 = new Circulo(2);
		
		double areaCirculo = circulo1.getArea();
		
		circulo1.setRadio(3);
		double perimetroCirculo = circulo1.getPerimetro();
		System.out.println(perimetroCirculo);
		
		
		
	}

}
