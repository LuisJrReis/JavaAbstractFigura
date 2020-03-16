
public class Triangulo extends Poligono {

	public Triangulo (int base, int altura) {
		super(base, altura);
		
	}

	@Override
	public double area() {
		
		return super.area() / 2;
	
	}

	@Override
	public double perimetro() {
		double a=0;
		double b=0;
		double c=0;
		return a+b+c;
	}
	
}
