
public class PessoaJuridica extends Cliente {
	
	private String cnpj;
	
	public PessoaJuridica(String nome, String telefone,String cnpj) {
		super(nome, telefone);
		this.cnpj = cnpj;
	}
	/**
	public PessoaJuridica(String nome, String telefone,String categoriaAuto,String cnpj) {
		super(nome, telefone,categoriaAuto);
		this.cnpj = cnpj;
	}
	**/
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
}
