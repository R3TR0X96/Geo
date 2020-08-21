package Test;

import Numero.Numeros;

public class TestNumeros {

	public static void main(String[] args) {
		
		Numeros numero1 = new Numeros(5);
		System.out.println(numero1.sumar(5));
		System.out.println(numero1.multiplicar(2));
		System.out.println(numero1.esPar());
		System.out.println(numero1.esPrimo());

	}

}
