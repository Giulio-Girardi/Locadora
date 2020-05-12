
public class PessoaFisica extends Cliente {

	private String cpf;
	
	public PessoaFisica(String nome, String telefone, String cpf) {
		super(nome, telefone);
		this.cpf = cpf;
	}
	/**public PessoaFisica(String nome, String telefone, String categoriaAuto, String cpf) {
		super(nome, telefone,categoriaAuto);
		this.cpf = cpf;
	}
	 **/
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
}
