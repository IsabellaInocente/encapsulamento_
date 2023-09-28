package Enderecoclass;

public class Endereco {

	long id;
	String logradouro;
	String complemento;
	String bairro;
	String cidade;
	String cep;
	String uf;
	int numero;
	
	public String getlogradouro() {
		return logradouro;
	}
	public void setlogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getcomplemento() {
		return complemento;
	}
	public void setcomplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getbairro() {
		return bairro;
	}
	public void setbairro(String bairro) {
		this.bairro = bairro;
	}
	public String getcidade() {
		return cidade;
	}
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	public String getcep() {
		return cep;
	}
	public void setcep(String cep) {
		this.cep = cep;
	}
	public String getuf() {
		return uf;
	}
	public void setuf(String uf) {
		this.uf = uf;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}

