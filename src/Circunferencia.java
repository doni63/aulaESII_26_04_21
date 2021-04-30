
public class Circunferencia {
    double areaCirc, raio, perimetroCirc;
    
    	void calculoAreaCirc(){
            areaCirc = (Math.PI * (raio * raio));
        }
		
	double areaCirc() {
		return areaCirc;
	}
	
	void imprimiAreaCirc() {
		System.out.println("Area da Circunferencia = " + areaCirc() );
	}
	
	void calculoPerimetroCirc() {
		perimetroCirc = (2* Math.PI * raio);
	}
	
	double perimetroCirc() {
		return perimetroCirc;
	}
	
	void imprimiPerimetroCirc() {
		System.out.println("Perimetro da Circunferencia= " + perimetroCirc());
	}
}
