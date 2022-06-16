
public class Retangulo implements Calculos {
	
	private int base;
	private int altura;
	
	public Retangulo() {}
	
	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	
	}
	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	
	public double Perimetro() {
		double perim = (altura*2)+(base*2);
		return perim;
	}

	
	public double area() {
		double arearet = base * altura;
		return arearet;
	}
	
}
