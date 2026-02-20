class Pessoa { 
	String nome;
	int idade;
}


public class HelloWorld { 
	public static void main(String[] args) { 
		System.out.println("Hello World Fatec ADS 4o noite");
		Pessoa p1 = new Pessoa();
		p1.nome = "Joao Silva";
		p1.idade = 32;
		System.out.println("Nome: " + p1.nome);
	}
}