import java.util.Vector;

public class Categoria {
	
	protected String nomeCategoria;
	protected Vector<Automovel> nomeAuto;
	
	Categoria(String nomeCategoria){
		this.nomeCategoria = nomeCategoria;
		nomeAuto = new Vector<Automovel>();
	}
	
	public void InsereAutomovel(Automovel auto) {
		nomeAuto.add(auto);
	}
	
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
}
