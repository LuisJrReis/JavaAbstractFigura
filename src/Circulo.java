
public class Circulo extends FiguraPlana{

	double raio;
	
	@Override
	public double area()	{
		
		return 3.141516*raio*raio;
		
	}

	@Override
	public double perimetro() {
		
		return 2*3.141516*raio;
	}
}
