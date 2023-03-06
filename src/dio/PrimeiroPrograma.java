package dio;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Funcionario gerente = new Funcionario();
		gerente.nome = "DAVI";
		gerente.sobreNome = "CABRAL";
		System.out.println(gerente.nome);
		}

}

class Funcionario{
	String nome;
	String sobreNome;
	
}
