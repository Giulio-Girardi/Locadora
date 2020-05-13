import java.util.Vector;

public class Categoria {
	
	protected String nome;
	protected Vector<Automovel> auto;
	
	Categoria(String nome){
		this.nome = nome;
		auto = new Vector<Automovel>();
	}
	
	public void InsereAutomovel(Automovel auto) {
		this.auto.add(auto);
	}
	
	public String getNomeCategoria() {
		return nome;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nome = nomeCategoria;
	}
}
