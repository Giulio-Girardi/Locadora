
public class PessoaJuridica extends Cliente {
	
	private String cnpj;
	
	public PessoaJuridica(String nome, String telefone,String cnpj) {
		super(nome, telefone);
		this.cnpj = cnpj;
		this.desconto = 0.95;
	}
	
	
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
}
