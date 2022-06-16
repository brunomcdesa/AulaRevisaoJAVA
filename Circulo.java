
public class Circulo implements Calculos {
	private int raio;
	
	public Circulo() {}
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	
	
	public double Perimetro() {
		double perim = (2*Math.PI) * raio;
					 
		
		return perim;
	}

	
	public double area() {
		
		double areacirc = Math.PI * (raio*raio);
						//Math.PI * Math.pow(raio,2)
		return areacirc;
	}

}
