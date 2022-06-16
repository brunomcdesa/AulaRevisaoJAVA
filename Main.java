import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner in =new Scanner (System.in);
		
		
		System.out.println("Quantas formas geometricas voce deseja criar? ");
		int n = in.nextInt();
		
		Calculos[] vetor = new Calculos[n];
		
		int cont = 0;
		
		while(cont < n) {
		System.out.println("Voce deseja qual forma geometrica? "
				+ "1 -> Quadrado\n"
				+ "2 -> Retangulo\n"
				+ "3 -> Circulo\n");
		int opcao = in.nextInt();
		
		switch(opcao) {
		case 1: 	
			System.out.println("Informe o lado do quadrado: ");
			int lado = in.nextInt();
			Quadrado quad = new Quadrado(lado);
			vetor[cont] = quad;
			cont++;
			break;
			
		case 2: 
			System.out.println("Informe a base do retangulo: ");
			int base = in.nextInt();
			System.out.println("Informe a altura do retangulo: ");
			int altura = in.nextInt();
			
			Retangulo ret = new Retangulo(base,altura);
			
			vetor[cont] = ret;
			cont++;
			break;
			
		case 3: 
			System.out.println("Informe o raio do circulo:");
			int raio = in.nextInt();
			
			Circulo circ = new Circulo(raio);
			
			vetor[cont] = circ;
			cont++;
			break;
			
		default:
			System.out.println("Opcao invalida!!");
			
		}
		
		
		
		}

		for(int i = 0; i < n; i++) {
			if(vetor[i] instanceof Quadrado) {
				Quadrado quad = (Quadrado) vetor[i];
				System.out.println("["+vetor[i]+"]" + "\nLado do quadrado: " + quad.getLado() + "\n"
								+ "Perimetro: " + quad.Perimetro() + "\n"
								+ "Area: " + quad.area() + "\n");
				
			}
			else if(vetor[i] instanceof Retangulo) {
				Retangulo ret = (Retangulo) vetor[i];
				System.out.println("["+vetor[i]+"]" + "\nBase do retangulo: " +ret.getBase() + "\n"
								+ "Altura do retangulo: " + ret.getAltura() + "\n"
								+ "Perimetro: " + ret.Perimetro() + "\n"
								+ "Area: " + ret.area() + "\n");
			}
			else if(vetor[i] instanceof Circulo) {
				Circulo circ = (Circulo) vetor[i];
				System.out.println("["+vetor[i]+"]" + "\nRaio do circulo: " + circ.getRaio() + "\n"
								+ "Perimetro: " + circ.Perimetro() + "\n"
								+ "Area: " + circ.area() + "\n");
			}
		}
		
		
	}

}
