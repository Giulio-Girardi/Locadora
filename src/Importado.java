
public class Importado implements Nacionalidade {

	private double taxaImport;

	Importado(double taxaImport){
		this.taxaImport = taxaImport;
	}
	
	@Override
	public double getValorFixo(double valorBase) {
		return ((valorBase) + (25*taxaImport)/100)/1000;
	}
	
}
