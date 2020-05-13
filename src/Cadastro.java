import java.util.Iterator;
import java.util.Vector;

public class Cadastro {
	
	public Vector<Cliente> clientes;
	public Vector<Categoria> categorias;
	public Vector<Marca> marcas;
	public Vector<Modelo> modelos;
	
	Cadastro(){
		clientes = new Vector<Cliente>();
		categorias = new Vector<Categoria>();
		marcas = new Vector<Marca>();
		modelos = new Vector<Modelo>();
	}
	
	public void cadastraCliente(Cliente novo) {
		clientes.add(novo);
	}
	
	public void getClientes() {
		Iterator<Cliente> cliIterator = clientes.iterator();
		while(cliIterator.hasNext()) {
			System.out.println(cliIterator.next().nome);
		}
	}
	
	public void getModelos() {
		Iterator<Modelo> modIterator = modelos.iterator();
		while(modIterator.hasNext()) {
			System.out.println(modIterator.next().getNome());
		}
	}
	
	public void getCategorias() {
		Iterator<Categoria> catIterator = categorias.iterator();
		while(catIterator.hasNext()) {
			Vector<Automovel> listAutomovel = catIterator.next().auto;
			Iterator<Automovel> listAutomovelIterator = listAutomovel.iterator();
			while(listAutomovelIterator.hasNext()){
			
				System.out.println(listAutomovelIterator.next().getModeloAutomovel().getNome());
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