
public class Quadrado extends Poligono implements Diagonal{
	
	public Quadrado(int lado) {
		super(lado, lado);
		
	}

	@Override
	public double calcularDiagonal() {
		return (Math.sqrt(2)) * this.getAltura();
	}

	@Override
	public double perimetro() {
		
		return getAltura() + getAltura() + getAltura() + getAltura();
	}
}
