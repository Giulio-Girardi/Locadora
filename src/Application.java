import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int tipoUsuario = 0;
		
		System.out.println("Escolha as opcoes: ");
		System.out.println("[1] - Atendente");
		System.out.println("[2] - Gerente");
		
		try {
			tipoUsuario = System.in.read();
		} catch (IOException e) {

			e.printStackTrace();
		}
		switch(tipoUsuario) {
		
		case 1: System.out.println("Escolha sua acao: ");
		System.out.println("[1] - Cadastrar novo cliente: ");
		System.out.println("[2] - Consultar disponibilidade de automel por categoria: ");
		System.out.println("[3] - Consultar o valor de uma loca鈬o: ");
		System.out.println("[4] - Realizar loca鈬o de automovel: ");
		System.out.println("[5] - Finalizar loca鈬o de automel: ");
		break;
		case 2: System.out.println("Escolha sua acao: ");
		System.out.println("[1] - Cadastrar novo cliente: ");
		System.out.println("[2] - Consultar disponibilidade de automel por categoria: ");
		System.out.println("[3] - Consultar o valor de uma loca鈬o: ");
		System.out.println("[4] - Realizar loca鈬o de automovel: ");
		System.out.println("[5] - Finalizar loca鈬o de automel: ");
		System.out.println("[6] - Cadastrar nova categoria de automovel: ");
		System.out.println("[7] - Cadastrar nova marca de automovel: ");
		System.out.println("[8] - Cadastrar novo modelo de automovel: ");
		System.out.println("[9] - Cadastrar novo automovel: ");
		System.out.println("[10] - Remover automovel: ");
		System.out.println("[11] - Consultar todas as locacoes cadastradas: ");
		System.out.println("[12] - Consultar todos os clientes cadastrados: ");
		System.out.println("[13] - Consultar todos os automoveis cadastrados: ");
	}
		
		
		int acao = 0;
		try {
			acao = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cadastro cadastro = new Cadastro();
		Categoria categoria;
		Cliente cliente;
		switch(acao) {
		/************************
		 * Cadastrar novo cliente
		 ************************/
			case 1: String nome = in.nextLine();
					String telefone = in.nextLine();
					String documento = in.nextLine();
					
					if(documento.length()==11) {
						cliente = new PessoaFisica(nome,telefone,documento);
						
					}else {
						cliente = new PessoaJuridica(nome,telefone,documento);
						
					}
					cadastro.cadastraCliente(cliente);
			break;
			/******************************************************
			 * Consultar disponibilidade de automovel por categoria
			 ******************************************************/
			case 2: String nomeCategoria = in.nextLine();
					cadastro.consultaCategoria(nomeCategoria);
			break;
			/***********************************
			 * Consultar o valor de uma locacao
			 ***********************************/
			case 3: System.out.println("Informe o automovel: ");
			String nomeAutomovel = in.nextLine();
			Automovel automovel;
			System.out.println("Informe data inicial: ");
			
			String[] dataInicio = in.nextLine().split("/");
			LocalDate inicio = inicio = LocalDate
					.of(Integer.parseInt(dataInicio[2]),Integer.parseInt(dataInicio[1]), Integer.parseInt(dataInicio[0]));
			automovel = categoria.getAutomovel(nomeAutomovel);
			System.out.println("Informe data final: ");
			
			String[] dataFinal = in.nextLine().split("/");
			LocalDate fim = LocalDate
					.of(Integer.parseInt(dataFinal[2]),Integer.parseInt(dataFinal[1]), Integer.parseInt(dataFinal[0]));
			automovel = categoria.getAutomovel(nomeAutomovel);
			System.out.println("Valor da locacao: ");
			System.out.println(Locacao.calculaValor(automovel,cliente,inicio,fim));
			break;
				
			/******************************
			 *Realizar locacao de automovel
			 ******************************/
				
			case 4: String[] dataInicial = in.nextLine().split("/");
					LocalDate inicial  = LocalDate
							.of(Integer.parseInt(dataInicial[2]),Integer.parseInt(dataInicial[1]), Integer.parseInt(dataInicial[0]));
					automovel = categoria.getAutomovel(nomeAutomovel);
					System.out.println("Informe data final: ");
					//03/09/2000
					String[] dataFim = in.nextLine().split("/");
					LocalDate fimD = LocalDate
							.of(Integer.parseInt(dataFim[2]),Integer.parseInt(dataFim[1]), Integer.parseInt(dataFim[0]));
					automovel = categoria.getAutomovel(nomeAutomovel);
					System.out.println("Valor da locacao: ");
					System.out.println(Locacao.calculaValor(automovel,cliente,inicio,fim));
					Locacao locacao = new Locacao();
					locacao.setDataInicial(inicial);
					locacao.setDataFinal(fimD);
					locacao.setAutomovel(automovel);
					cadastro.cadastraLocacao(locacao, automovel);
			break;
			/********************************
			 * Finalizar locacao de automovel
			 ********************************/
			case 5: cadastro.finalizaLocacao(automovel);
			break;
			/***************************************
			 * Cadastrar nova categoria de automovel
			 ***************************************/
			case 6: String nomeCat = in.nextLine();  
				Categoria newCategoria = new Categoria(nomeCat);
				cadastro.cadastraCategoria(newCategoria);
			break;
			/***********************************
			 * Cadastrar nova marca de automovel
			 ***********************************/
			case 7: String nomeMarca = in.nextLine();
				Marca newMarca = new Marca(nomeMarca);
				cadastro.cadastrarMarca(newMarca);
			break;
			/************************************
			 * Cadastrar novo modelo de automovel
			 ************************************/
			case 8: String nomeModelo = in.nextLine();
					Modelo newModelo = new Modelo(nomeModelo);
					cadastro.cadastrarModelo(newModelo);
			break;
			/**************************
			 * Cadastrar novo automovel
			 **************************/
			case 9:
			break;
			/*******************
			 * Remover automovel
			 *******************/
			case 10: cadastro.removeAutomovel(automovel);
			break;
			/*****************************************
			 * Consultar todas as locacoes cadastradas
			 *****************************************/	
			case 11: cadastro.getLocacoes();
			break;
				/*****************************************
				 * Consultar todos os clientes cadastrados
				 *****************************************/
			case 12: cadastro.getClientes();
			break;
				/*******************************************
				 * Consultar todos os automoveis cadastrados
				 *******************************************/
			case 13: cadastro.getCategorias();
			break;
			}
		}
		
		
		/***
		 * 
		 *
		/* *********************
		 * CRIAﾃ�ﾃグ DE CLIENTES
		 ***********************
		PessoaFisica cleisson = new PessoaFisica("Cleisson","999999","8584549");
		PessoaJuridica cea = new PessoaJuridica("CeA","999999","8584549");
		Cadastro cadastro = new Cadastro();
		
		cadastro.cadastraCliente(cleisson);
		cadastro.cadastraCliente(cea);

		/* *********************
		 * CRIAﾃ�ﾃグ DE MARCAS
		 ***********************
		Marca ford = new Marca("Ford");
		cadastro.cadastrarMarca(ford);

		Marca fiat = new Marca("Fiat");
		cadastro.cadastrarMarca(fiat);

		Marca jeep = new Marca("Jeep");
		cadastro.cadastrarMarca(jeep);

		/* *********************
		 * CRIAﾃ�ﾃグ DE MODELOS
		 ***********************
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
		 * CRIAﾃ�ﾃグ DE AUTOMOVEL
		 ***********************
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
		
		/***********
		 * Consulta de clientes e modelos
		 **********
		
		
		cadastro.getClientes();
		cadastro.getModelos();
		cadastro.getCategorias();
		cadastro.consultaCategoria(hatch);
		***/
//		System.out.println(fuca.getValorFixo());
//		System.out.println(meuUno.getValorFixo());
//		System.out.println(meuCompass.getValorFixo());
	}
}

