
public class Esfera extends FiguraEspacial {
	 private double raio;

	    public Esfera (double raio) {
	        this.raio = raio;
	    }

	    public double getRaio() {
	        return this.raio;
	    }

	    public void setRaio(double raio) {
	        this.raio = raio;
	    }

	    @Override
	    public double volume(){
	        return ( 4 * 3.14 * Math.pow(getRaio(), 3) / 3 );
	    }
}
