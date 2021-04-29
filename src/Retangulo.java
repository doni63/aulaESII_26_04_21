
public class Retangulo {
	double base, largura, area, perimetro;
	
	void calculoArea() {
		area = base * largura;
	}
	
	double area() {
		return area;
	}
	
	void imprimiArea() {
		System.out.println("Area = " + area() );
	}
	
	void calculoPerimetro() {
		perimetro = (2*base) + (2*largura);
	}
	
	double perimetro() {
		return perimetro;
	}
	
	void imprimiPerimetro() {
		System.out.println("Perimetro = " + perimetro());
	}
}
