import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dadosDesenhoPlano = new Scanner(System.in);
		Retangulo retangulo1 = new Retangulo();
		
		System.out.println("Base: ");
		retangulo1.base = dadosDesenhoPlano.nextDouble();
		System.out.println("Largura: ");
		retangulo1.largura = dadosDesenhoPlano.nextDouble();
		
		retangulo1.calculoArea();
		retangulo1.calculoPerimetro();
		retangulo1.imprimiArea();
		retangulo1.imprimiPerimetro();
		
		dadosDesenhoPlano.close();
	}
}
