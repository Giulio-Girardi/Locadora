import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente {
	
	protected String nome;
	protected String telefone;
	protected double desconto;
	
	
	 Cliente(String nome,String telefone) {
		 this.nome = nome;
		 this.telefone = telefone;
	}
	 
	 protected double getDesconto() {
		 return desconto;
	 } 
	 
	 
}
