import java.util.Iterator;
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
	public Automovel getAutomovel(String nomeAuto) {
		Iterator autIterator = auto.iterator();
		while(autIterator.hasNext()) {
			Automovel automovel = (Automovel) autIterator.next();
			if(automovel.equals(nomeAuto)){
				return automovel;
			}	
		}
		return null;		
	}
	public String getNomeCategoria() {
		return nome;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nome = nomeCategoria;
	}
}
