package Numero;

public class Numeros {
	
	private int x;
	
	public Numeros(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}


	public int sumar(int n1) {
		return x + n1;
	}
	
	public int multiplicar(int n1) {
		return x * 2;
	}
	
	public boolean esPar() {
		return x % 2 == 0;
		
	}
	
	public boolean esPrimo() {
		boolean p = true;
		int i = 2;
		if (x < 2) p = false;
		else {
			while(p && i<=Math.sqrt(x)) {
				if(x % i == 0) {
					p = false;
				}
				i = i + 1;
			}
		}
		return p;
	}
	public String convertirAString() {
		return 
	}
}
