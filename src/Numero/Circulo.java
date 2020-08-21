package Numero;

public class Circulo {
	private Punto origen;
	private double radio;
	
	
	
	
	public Circulo(Punto origen, double radio) {
		this.origen = origen;
		this.radio = radio;
		
	}
	
	public Punto getOrigen() {
		return origen;
	}
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	 public double calcularArea() {
		 return Math.PI * radio * radio;
		 
	 }
	 
	 public double calcularDistancia(Circulo c) {
		 return 
	 }
	 
	public boolean equals(Circulo c) {
		return origen.equals(c.getOrigen()) && this.radio==c.getRadio();
	}
	
	@Override
	public String toString(){
	return "("+origen+","+radio+")";
	}
	
}
