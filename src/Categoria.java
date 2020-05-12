import java.util.Vector;

public class Categoria {
	
	protected String nome;
	protected Vector<Automovel> nomeAuto;
	
	Categoria(String nome){
		this.nome = nome;
		nomeAuto = new Vector<Automovel>();
	}
	
	public void InsereAutomovel(Automovel auto) {
		nomeAuto.add(auto);
	}
	
	public String getNomeCategoria() {
		return nome;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nome = nomeCategoria;
	}
}
