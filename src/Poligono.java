
public abstract class Poligono extends FiguraPlana {

	private int base;
	private int altura;
	
	public Poligono(int base, int altura) {
		setBase (base);
		setAltura (altura);
	}
	
	@Override
	public double area() {
		
		return getBase() * getAltura();
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
