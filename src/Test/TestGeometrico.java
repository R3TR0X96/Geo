package Test;

import Modelo.Punto;

import Modelo.Circulo;

public class TestGeometrico {
 
	
	public static void main(String[] args) {
		
		Punto punto1 = new Punto(10, 10);
		
		Punto punto2 = new Punto(20, 15);
		
		Punto punto3 = new Punto(25, 25);
		
		Punto punto4 = new Punto(25, 25);
		
		Circulo circulo1 = new Circulo(punto1, 10);
		
		Circulo circulo2 = new Circulo(punto2, 10);
		
	
		System.out.println(circulo1.calcularArea() + " " + circulo1.calcularPerimetro());
		
		System.out.println(circulo1.calcularDistancia(circulo2));
		
		System.out.println(circulo1.equals(circulo2));
		
		System.out.println(punto1.getX()+" " + punto1.getY());
		
		System.out.println(punto2.getX()+" " + punto2.getY());
		
		System.out.println(punto1.equals(punto2));
		
		System.out.println(punto3.getX()+" " + punto3.getY());
		
		System.out.println(punto4.getX()+" " + punto4.getY());
		
		System.out.println(punto3.equals(punto4));
		
	}
}
