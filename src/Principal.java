import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dadosDesenhoPlano = new Scanner(System.in);
		Retangulo retangulo1 = new Retangulo();
		Circunferencia circunferencia1 = new Circunferencia();
		
		System.out.println("Base: ");
		retangulo1.base = dadosDesenhoPlano.nextDouble();
		System.out.println("Largura: ");
		retangulo1.largura = dadosDesenhoPlano.nextDouble();
		System.out.println("Raio: ");
		circunferencia1.raio = dadosDesenhoPlano.nextDouble();
		
		retangulo1.calculoArea();
		retangulo1.calculoPerimetro();
		retangulo1.imprimiArea();
		retangulo1.imprimiPerimetro();
                
		circunferencia1.calculoAreaCirc();
		circunferencia1.calculoPerimetroCirc();
		circunferencia1.imprimiAreaCirc();
		circunferencia1.imprimiPerimetroCirc();
		
		dadosDesenhoPlano.close();
	}
}
