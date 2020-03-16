
public class Trapezio extends Poligono {
	private float area; //= (h * (b+B))/2
	int baseMaior;
	
	public int getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(int baseMaior) {
		this.baseMaior = baseMaior;
	}

	public Trapezio(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (getAltura() * (getBase()+ getBaseMaior()) / 2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return ((getBase() + getBaseMaior() + getAltura()) + (getAltura() * (getBaseMaior() - getBase())) / 2);
	}
}
