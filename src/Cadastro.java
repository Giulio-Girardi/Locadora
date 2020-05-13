import java.util.Iterator;
import java.util.Vector;

public class Cadastro {
	
	private Vector<Cliente> clientes;
	private Vector<Categoria> categorias;
	private Vector<Marca> marcas;
	private Vector<Modelo> modelos;
	private Vector<Locacao> locacao;
	
	Cadastro(){
		clientes = new Vector<Cliente>();
		categorias = new Vector<Categoria>();
		marcas = new Vector<Marca>();
		modelos = new Vector<Modelo>();
		locacao = new Vector<Locacao>();
	}
	
	
	public void consultaCategoria(String cat) {
		Iterator catIterator = categorias.iterator();
		while(catIterator.hasNext()) {
			Categoria categoria = (Categoria) catIterator.next();
			Vector<Automovel> listAutomovel = categoria.auto;
			Iterator listAutomovelIterator = listAutomovel.iterator();
			if(categoria.getNomeCategoria().equals(cat)) {
				System.out.println("Categoria: " + categoria.getNomeCategoria());		
				while(listAutomovelIterator.hasNext()){
					Automovel automovel = (Automovel) listAutomovelIterator.next();
						if(automovel.isDisponivel()==true) {
							System.out.println("-- " + automovel.getModeloAutomovel().getNome());
						}
				}
			}
		}	
	}
	
	public void removeAutomovel(Automovel automovel) {
		Iterator catIterator = categorias.iterator();
		while(catIterator.hasNext()) {
			Categoria categoria = (Categoria) catIterator.next();
			Vector<Automovel> listAutomovel = categoria.auto;
			Iterator listAutomovelIterator = listAutomovel.iterator();
			while(listAutomovelIterator.hasNext()){
				Automovel veiculo = (Automovel) listAutomovelIterator.next();
				if(automovel.getPlaca().equals(veiculo.getPlaca())) {
					listAutomovelIterator.remove();
				}
			}
		}
	}
	
	public void cadastraLocacao(Locacao locacao,Automovel automovel) {
		automovel.setDisponivel(false);
		this.locacao.add(locacao);
	}
	
	public void finalizaLocacao(Automovel automovel) {
		automovel.setDisponivel(true);
	}
	
	public void cadastraCliente(Cliente novo) {
		clientes.add(novo);
	}
	public void getLocacoes() {
		Iterator<Locacao> locIterator = locacao.iterator();
		System.out.println("Locacoes: ");
		while(locIterator.hasNext()) {
			System.out.println("-- " + locIterator.next().toString());
		}
	}
	
	public void getClientes() {
		Iterator<Cliente> cliIterator = clientes.iterator();
		System.out.println("Clientes: ");
		while(cliIterator.hasNext()) {
			System.out.println("-- " + cliIterator.next().nome);
		}
		
	}
	
	public void getModelos() {
		Iterator<Modelo> modIterator = modelos.iterator();
		System.out.println("Modelos: ");
		while(modIterator.hasNext()) {
			System.out.println("-- " + modIterator.next().getNome());
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void getCategorias() {
		Iterator catIterator = categorias.iterator();
		while(catIterator.hasNext()) {
			Categoria categoria = (Categoria) catIterator.next();
			Vector<Automovel> listAutomovel = categoria.auto;
			Iterator listAutomovelIterator = listAutomovel.iterator();
			System.out.println("Categoria: " + categoria.getNomeCategoria());
			while(listAutomovelIterator.hasNext()){
				Automovel automovel = (Automovel) listAutomovelIterator.next();
				System.out.println("-- " + automovel.getModeloAutomovel().getNome());
			}
		}
	}
	
	public void cadastraCategoria(Categoria nova) {
		categorias.add(nova);
	}

	public void cadastrarMarca(Marca marca) {
		marcas.add(marca);
	}

	public void cadastrarModelo(Modelo modelo) {
		modelos.add(modelo);
	}
	
	

}