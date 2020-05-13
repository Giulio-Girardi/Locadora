import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Vector;


public class Locacao {
	
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	private Automovel automovel;
	
	
	public static double calculaValor(Automovel auto, Cliente pessoa,LocalDate inicio, LocalDate fim) {
		double newDiaria = auto.getValorDiaria() * pessoa.getDesconto();
		double intervalo = ChronoUnit.DAYS.between(inicio, fim);
		return (newDiaria * intervalo) + auto.getValorFixo();
	}
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Automovel getAutomovel() {
		return automovel;
	}
	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
	public void setDataInicial(int ano, int mes, int dia) {
		 LocalDate inicio = LocalDate.of(ano, mes, dia);
		 this.dataInicial = inicio;
	 }
	 public void setDataFinal(int ano, int mes, int dia) {
		 LocalDate fim = LocalDate.of(ano, mes, dia);
		 this.dataFinal = fim;
	 }
	 
	
	
	
	
}
