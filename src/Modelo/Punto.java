package Modelo;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;

	
}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y =y;
	}
	
	public boolean equals(Punto p){
		return x==p.getX()&&y==p.getY();
		}

	
	@Override
	public String toString(){
		return "("+x+","+y+")";
	}

	public double calcularDistancia(Punto p){
		//d = raiz cuadrada de x - x al cuadrado + y - y al cuadrado
		return Math.sqrt(Math.pow(x - p.getX() , 2) + Math.pow(y - p.getY(), 2));
	}
	
	
	public void mover(double desplazamientoX, double desplazamientoY){
		x = x + desplazamientoX;
		y = y + desplazamientoY;
		}
	
}