package Enderecoclass;

public class ObjetoEndereco {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco ();
		
		endereco1.setlogradouro("rua telma");
		endereco1.setcomplemento("542963");
		endereco1.setbairro("jardim leonel");
		endereco1.setcidade("itapetininga");
		endereco1.setcep("159758410");
		endereco1.setuf("");
		endereco1.setNumero(254);
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(endereco1.getlogradouro());
		System.out.println(endereco1.getcomplemento());
		System.out.println(endereco1.getbairro ());
		System.out.println(endereco1.getcidade());
		System.out.println(endereco1.getcep());
		System.out.println(endereco1.getuf());
		System.out.println(endereco1.getNumero());
	}
}
