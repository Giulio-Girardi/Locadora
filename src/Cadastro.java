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
	
	public void CadastraCliente(Cliente novo) {
		clientes.add(novo);
	}
	
	public void CadastraCategoria(Categoria nova) {
		categorias.add(nova);
	}
	
	

}