import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dadosDesenhoPlano = new Scanner(System.in);
		Retangulo retangulo1 = new Retangulo();
		Circunferencia circunferencia1 = new Circunferencia();
		
		System.out.println("Formato do material:");
		System.out.println("[1] - Retângulo \n[2] - Circunferência");
		int opcao = dadosDesenhoPlano.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Base: ");
			retangulo1.base = dadosDesenhoPlano.nextDouble();
			System.out.println("Altura: ");
			retangulo1.altura = dadosDesenhoPlano.nextDouble();
			retangulo1.calculoArea();
			retangulo1.calculoPerimetro();
			retangulo1.imprimiArea();
			retangulo1.imprimiPerimetro();
			break;
			
		case 2:
			System.out.println("Raio: ");
			circunferencia1.raio = dadosDesenhoPlano.nextDouble();
			circunferencia1.calculoAreaCirc();
			circunferencia1.calculoPerimetroCirc();
			circunferencia1.imprimiAreaCirc();
			circunferencia1.imprimiPerimetroCirc();
			break;
			
		default:
			System.out.println("Opção inválida!");
			break;
		}
		dadosDesenhoPlano.close();
	}
}
