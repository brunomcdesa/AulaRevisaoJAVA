
public class Quadrado implements Calculos {
	private int lado;
	
	public Quadrado() {}
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	
	public double Perimetro() {
		
		return lado*4;
	}

	
	public double area() {
		
		return lado * lado;
	}
}
