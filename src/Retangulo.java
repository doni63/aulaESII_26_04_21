
public class Retangulo {
	double base, altura, area, perimetro;
	
	void calculoArea() {
		area = base * altura;
	}
	
	double area() {
		return area;
	}
	
	void imprimiArea() {
		System.out.println("Area do retângulo = " + area() );
	}
	
	void calculoPerimetro() {
		perimetro = 2*(base + altura);
	}
	
	double perimetro() {
		return perimetro;
	}
	
	void imprimiPerimetro() {
		System.out.println("Perimetro do retângulo = " + perimetro());
	}
}
