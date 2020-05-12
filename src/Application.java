
public class Application {


	public static void main(String[] args) {
		
		PessoaFisica cleisson = new PessoaFisica("Cleisson","999999","8584549");
		PessoaJuridica cea = new PessoaJuridica("CeA","999999","8584549");
		Cadastro cadastroCliente = new Cadastro();
		
		
		cadastroCliente.CadastraCliente(cleisson);
		cadastroCliente.CadastraCliente(cea);
		
		
		
		
		Automovel fuca = new Automovel("APP-6969");
		fuca.setAno(1964);
		fuca.setDisponivel(true);
		fuca.setMarcaAutomovel(new Marca("Volkswagen"));
		fuca.setModeloAutomovel(new Modelo("Fuca"));
		fuca.setNacionalidade(new Nacional(25.00));
		fuca.setValorBase(120000.00);
		fuca.setValorDiaria(10.00);
		Automovel chevette = new Automovel("PPA-2469");
		chevette.setAno(1969);
		chevette.setDisponivel(true);
		chevette.setMarcaAutomovel(new Marca("Ford"));
		chevette.setModeloAutomovel(new Modelo("Chevette"));
		chevette.setNacionalidade(new Nacional(25.00));
		chevette.setValorBase(150000.00);
		chevette.setValorDiaria(10.00);
		Automovel corcel = new Automovel("APA-6924");
		corcel.setAno(1970);
		corcel.setDisponivel(true);
		corcel.setMarcaAutomovel(new Marca("Ford"));
		corcel.setModeloAutomovel(new Modelo("Corcel"));
		corcel.setNacionalidade(new Nacional(25.00));
		corcel.setValorBase(150000.00);
		corcel.setValorDiaria(10.00);
		
		System.out.println(fuca.getValorFixo());
		System.out.println(chevette.getValorFixo());
		System.out.println(corcel.getValorFixo());		
	}

}
