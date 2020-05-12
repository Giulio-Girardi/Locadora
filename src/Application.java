
public class Application {


	public static void main(String[] args) {

		/* *********************
		 * CRIAÇÃO DE CLIENTES
		 ***********************/
		PessoaFisica cleisson = new PessoaFisica("Cleisson","999999","8584549");
		PessoaJuridica cea = new PessoaJuridica("CeA","999999","8584549");
		Cadastro cadastro = new Cadastro();
		
		cadastro.cadastraCliente(cleisson);
		cadastro.cadastraCliente(cea);

		/* *********************
		 * CRIAÇÃO DE MARCAS
		 ***********************/
		Marca ford = new Marca("Ford");
		cadastro.cadastrarMarca(ford);

		Marca fiat = new Marca("Fiat");
		cadastro.cadastrarMarca(fiat);

		Marca jeep = new Marca("Jeep");
		cadastro.cadastrarMarca(jeep);

		/* *********************
		 * CRIAÇÃO DE MODELOS
		 ***********************/
		Modelo ka = new Modelo("Ka");
		ka.setMarca(ford);
		cadastro.cadastrarModelo(ka);

		Modelo fiesta = new Modelo("Fiesta");
		fiesta.setMarca(ford);
		cadastro.cadastrarModelo(fiesta);

		Modelo uno = new Modelo("Uno");
		uno.setMarca(fiat);
		cadastro.cadastrarModelo(uno);

		Modelo toro = new Modelo("Toro");
		toro.setMarca(fiat);
		cadastro.cadastrarModelo(toro);

		Modelo renegade = new Modelo("Renegade");
		renegade.setMarca(jeep);
		cadastro.cadastrarModelo(renegade);

		Modelo compass = new Modelo("Compass");
		compass.setMarca(jeep);
		cadastro.cadastrarModelo(compass);

		/* *********************
		 * CRIAÇÃO DE AUTOMOVEL
		 ***********************/
		Automovel meuKa = new Automovel("APP-6969");
		meuKa.setAno(1964);
		meuKa.setDisponivel(true);
		meuKa.setModeloAutomovel(ka);
		meuKa.setNacionalidade(new Nacional(25.00));
		meuKa.setValorBase(120000.00);
		meuKa.setValorDiaria(10.00);

		Automovel meuUno = new Automovel("PPA-2469");
		meuUno.setAno(1969);
		meuUno.setDisponivel(true);
		meuUno.setModeloAutomovel(uno);
		meuUno.setNacionalidade(new Nacional(25.00));
		meuUno.setValorBase(150000.00);
		meuUno.setValorDiaria(10.00);

		Automovel meuCompass = new Automovel("APA-6924");
		meuCompass.setAno(1970);
		meuCompass.setDisponivel(true);
		meuCompass.setModeloAutomovel(compass);
		meuCompass.setNacionalidade(new Importado(25.00));
		meuCompass.setValorBase(150000.00);
		meuCompass.setValorDiaria(10.00);

		Categoria hatch = new Categoria("Hatch");
		Categoria suv = new Categoria("SUV");

		hatch.InsereAutomovel(meuKa);
		hatch.InsereAutomovel(meuUno);
		suv.InsereAutomovel(meuCompass);

		cadastro.cadastraCategoria(hatch);
		cadastro.cadastraCategoria(suv);
		
//		System.out.println(fuca.getValorFixo());
//		System.out.println(meuUno.getValorFixo());
//		System.out.println(meuCompass.getValorFixo());
	}

}
