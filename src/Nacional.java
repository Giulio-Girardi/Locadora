
public class Nacional implements Nacionalidade {

	private double ipi;
	
	Nacional(double ipi){
		this.ipi = ipi;
	}
	
	@Override
	public double getValorFixo(double valorBase) {
		return (valorBase) + ((ipi*10)/100)/1000;
	}
	
}
