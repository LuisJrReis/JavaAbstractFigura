
public class Retangulo extends Poligono implements Diagonal{

	public Retangulo (int base, int altura) {
		super(base, altura);
		
	}

	@Override
	public double calcularDiagonal() {
		return ((Math.pow(this.getAltura(), 2) + Math.pow(this.getBase(), 2)) * 0.5);
		
	}

	@Override
	public double perimetro() {
		return getAltura() + getBase() + getAltura() + getBase();
	}

	
}
