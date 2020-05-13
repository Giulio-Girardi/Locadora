
public class PessoaFisica extends Cliente {

	private String cpf;
	
	public PessoaFisica(String nome, String telefone, String cpf) {
		super(nome, telefone);
		this.cpf = cpf;
		this.desconto = 1;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
}
