import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente {
	
	protected String nome;
	protected String telefone;
	//protected String categoriaAuto;
	//public LocalDate dataInicial;
	//public LocalDate dataFinal;
	
	
	 Cliente(String nome,String telefone) {
		 this.nome = nome;
		 this.telefone = telefone;
	}
	 /**Cliente(String nome,String telefone,String categoriaAuto) {
		 this.nome = nome;
		 this.telefone = telefone;
		 this.categoriaAuto = categoriaAuto;
	}
	 
	 public String getCategoria() {
		 return categoriaAuto;
	 }
	 public void setCategoria(String categoriaAuto) {
		 this.categoriaAuto = categoriaAuto;
	 }
	 public void setDataInicial(int ano, int mes, int dia) {
		 LocalDate inicio = LocalDate.of(ano, mes, dia);
		 this.dataInicial = inicio;
	 }
	 public void setDataFinal(int ano, int mes, int dia) {
		 LocalDate fim = LocalDate.of(ano, mes, dia);
		 this.dataFinal = fim;
	 }
	 //Calcula numero de dias da locacao
	 public double Periodo(LocalDate inicio, LocalDate fim) {
		 long intervalo = ChronoUnit.DAYS.between(inicio, fim);
		 
		 return intervalo;
	 }**/
}
