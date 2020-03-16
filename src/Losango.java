
public class Losango extends Poligono {

	public Losango (int base, int altura) {
		super(base, altura);
		
	}

	@Override
	public double perimetro() {
		
		return getAltura() + getBase() + getAltura() + getBase();
	}

	
}
