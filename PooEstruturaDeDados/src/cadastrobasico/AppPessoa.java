package cadastrobasico;

public class AppPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.setNome("Carmen san diego");
		pessoa1.setEmail("carmensandiego@gmail.com");
		pessoa1.setTelefone("99999999");
		pessoa1.setIdade(35);
		pessoa1.setSexo('F');
		
		pessoa2.setNome("Marcos");
		pessoa2.setEmail("Marcos@gmail.com");
		pessoa2.setTelefone("999999555");
		pessoa2.setIdade(40);
		pessoa2.setSexo('M');
		
		pessoa3.setNome("maria");
		pessoa3.setEmail("maria@gmail.com");
		pessoa3.setTelefone("999989999");
		pessoa3.setIdade(65);
		pessoa3.setSexo('F');
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getEmail());
		System.out.println(pessoa1.getTelefone());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getSexo());
		System.out.println("------------------");
		
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getEmail());
		System.out.println(pessoa2.getTelefone());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getSexo());
		System.out.println("------------------");
		
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getEmail());
		System.out.println(pessoa3.getTelefone());
		System.out.println(pessoa3.getIdade());
		System.out.println(pessoa3.getSexo());
		System.out.println("------------------");
		
		
	}

}
