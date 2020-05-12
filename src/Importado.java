
public class Importado implements Nacionalidade {

	private double taxaImport;
	
	@Override
	public double getValorFixo(double valorBase) {
		return ((valorBase) + (25*taxaImport)/100)/1000;
	}
	
}
